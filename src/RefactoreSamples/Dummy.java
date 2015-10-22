package RefactoreSamples;

import java.awt.*;

/**
 * Created by aganezov on 10/21/15.
 * JetBrains GWU
 */
public class Dummy {
    public static int getIntFromBaseClass(){
        BaseClass baseClass = new BaseClass();
        /* Changed by Field Encapsulation refactoring in BaseClass */
        /* Expression changed as return value for getField1 has been wrapped by    Ctrl + T -> Wrap Return Value
            (in BaseClass.getField1 method)  */
        return baseClass.getField1().getValue();
    }

    public void createAndShowRectangle(){
        new Rectangle(1, 2, 3, 4, Color.green, Color.blue).show();
    }
}
