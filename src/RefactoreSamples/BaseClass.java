package RefactoreSamples;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class BaseClass extends SuperClass{
    private int field1;
    private int field2;
    AnotherClass anotherClass;

    public void printRandomIntValue(){
        System.out.println(anotherClass.randomIntValue());
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
