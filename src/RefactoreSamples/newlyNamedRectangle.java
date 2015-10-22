package RefactoreSamples;

import java.awt.*;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */
/* Class naming is changed (Rectangle -> newlyNamedRectangle) by    Ctrl + T -> Rename  */
public class newlyNamedRectangle {
    private int x, y;
    private int width, height;
    private Color fillColor, borderColor;

    /* Constructor naming (Rectangle -> newlyNamedRectangle) by    Ctrl + T -> Rename  */
    public newlyNamedRectangle(int x, int y, int width, int height, Color fillColor, Color borderColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    /* method made static and moved by    Ctrl + T -> Move (in Dummy class)*/
    public static void createAndShowRectangle(){
        /* Constructor Call replaced with Builder patter by     Ctrl + T -> Replace Constructor with Builder   */
        new RectangleBuilder().setX(1).setY(2).setWidth(3).setHeight(4).setFillColor(Color.green).setBorderColor(Color.blue).createRectangle().show();
    }

    public void show() {}
}
