package gwu.jetbrains.refactoring;

import java.awt.*;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */

public class newlyNamedRectangle {
    private int x, y;
    private int width, height;
    private Color fillColor, borderColor;


    public newlyNamedRectangle(int x, int y, int width, int height, Color fillColor, Color borderColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    public static void createAndShowRectangle(){

        new RectangleBuilder().setX(1).setY(2).setWidth(3).setHeight(4).setFillColor(Color.green).setBorderColor(Color.blue).createRectangle().show();
    }

    public void show() {}
}
