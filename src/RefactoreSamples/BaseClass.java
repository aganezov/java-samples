package RefactoreSamples;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class BaseClass extends SuperClass{
    private int field1;
    private int field2;
    AnotherClass anotherClass;

    /* Parameter extracted by Ctrl + T -> Extract Parameter */
    public void greet(String greeting){
        /* Variable extracted by Ctrl + T -> Extract Variable */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("My name".toLowerCase());
        System.out.println(greeting);
    }

    /* Generated by Ctrl + T -> Extract Field */
    private int randomIntValue;

    public void printRandomIntValue(){
        /* Generated by Ctrl + T -> Extract Field */
        randomIntValue = anotherClass.randomIntValue();

        System.out.println(randomIntValue);
    }
    /* Generate by Ctrl + T -> Encapsulate Fields */
    public int getField1() {
        return field1;
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
}
