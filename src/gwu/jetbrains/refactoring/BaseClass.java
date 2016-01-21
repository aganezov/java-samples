package gwu.jetbrains.refactoring;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */


public class BaseClass<Generic1, Generic2> extends SuperClass {
    protected int field1;

    AnotherClass anotherClass;
    private int field2;



    private int randomIntValue;


    public BaseClass(){

        this.setField1(10);
    }

    public BaseClass(int field1Value){
        this.setField1(field1Value);
    }

    public void printRandomIntValue(){

        randomIntValue = anotherClass.randomIntValue();


        int a = 5 + 6;
        int b = 6 + 7;

        System.out.println(randomIntValue);
    }

    public FieldHolder getField1() {

        return new FieldHolder(field1);
    }


    public void setField1(int field1) {
        this.field1 = field1;
    }


    public int getField2() {
        return field2;
    }


    public void setField2(int field2) {
        this.field2 = field2;
    }


    public class FieldHolder {
        private final int value;

        public FieldHolder(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }


    public static int parseInt(String string, int base){
        return Integer.parseInt(string);
    }
}
