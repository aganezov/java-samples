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
        /* Constructor Call replaced with Builder patter by     Ctrl + T -> Replace Constructor with Builder   */
        new RectangleBuilder().setX(1).setY(2).setWidth(3).setHeight(4).setFillColor(Color.green).setBorderColor(Color.blue).createRectangle().show();
    }

    public void converter(){
        BaseClass baseClass = new BaseClass();
        /* Call expression changed by    Ctrl + T -> Make static (in BaseClass.parseInt method)    */
        int intValue = BaseClass.parseInt("5");
    }
}
