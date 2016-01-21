package gwu.jetbrains.refactoring;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class Dummy {
    public static int getIntFromBaseClass(){

        BaseClass<String, String> baseClass = new BaseClass<>();

        return baseClass.getField1().getValue();
    }


    public void converter(int base){

        BaseClass<String, String> baseClass = new BaseClass<>();

        int intValue = BaseClass.parseInt("5", base);
    }
}
