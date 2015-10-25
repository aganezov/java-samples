package gwu.jetbrains.refactoring;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class Dummy {
    public static int getIntFromBaseClass(){
        /* Class signature has been changed by    Ctrl + T -> Change Signature (in BaseClass)
        *       default String parametrization was specified during refactoring
        * */
        BaseClass<String, String> baseClass = new BaseClass<>();
        /* Changed by Field Encapsulation refactoring in BaseClass */
        /* Expression changed as return value for getField1 has been wrapped by    Ctrl + T -> Wrap Return Value
            (in BaseClass.getField1 method)  */
        return baseClass.getField1().getValue();
    }

    /* signature change by propagating parameter in signature change of BaseClass.parseInt by
    *                   Ctrl + T -> Change Signature
    * */
    public void converter(int base){
        /* Class signature has been changed by    Ctrl + T -> Change Signature (in BaseClass)
        *       default String parametrization was specified during refactoring
        * */
        BaseClass<String, String> baseClass = new BaseClass<>();
        /* Call expression changed by    Ctrl + T -> Make static (in BaseClass.parseInt method)    */
        /* Signature of method is changed by     Ctrl + T -> Change signature (in BaseClass.parseInt method)     */
        int intValue = BaseClass.parseInt("5", base);
    }
}
