package RefactoreSamples;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */

/* Super Class has been changed via    Ctrl + T -> Extract Superclass  */
public class BaseClass extends ExtractedSuperClass {
    private int field2;
    /* Member was pulled to super class by    Ctrl + T -> Pull Members Up  */

    /* Generated by Ctrl + T -> Extract Field */
    private int randomIntValue;

    public int add(int value1, int value2){
        return value1 + value2;
    }

    public void printRandomIntValue(){
        /* Generated by Ctrl + T -> Extract Field */
        randomIntValue = anotherClass.randomIntValue();

        int a = add(5, 6);
        int b = add(6, 7);

        System.out.println(randomIntValue);
    }
    /* Generate by Ctrl + T -> Encapsulate Fields */
    public FieldHolder getField1() {
        /* Wrapped method return value    by Ctrl + T ->  Wrap Method Return Value */
        return new FieldHolder(field1);
    }

    /* Generate by Ctrl + T -> Encapsulate Fields */
    public void setField1(int field1) {
        this.field1 = field1;
    }

    /* Generate by Ctrl + T -> Encapsulate Fields */
    public int getField2() {
        return field2;
    }

    /* Generate by Ctrl + T -> Encapsulate Fields */
    public void setField2(int field2) {
        this.field2 = field2;
    }

    /* Wrapper for getField1 method return value created   by Ctrl + T ->  Wrap Method Return Value */
    public class FieldHolder {
        private final int value;

        public FieldHolder(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
