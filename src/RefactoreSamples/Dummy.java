package RefactoreSamples;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class Dummy {
    public static int getIntFromBaseClass(){
        BaseClass baseClass = new BaseClass();
        return baseClass.field1;
    }
}
