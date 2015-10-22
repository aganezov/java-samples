package RefactoreSamples;

import java.awt.*;

/**
 * Created by aganezov on 10/22/15.
 * JetBrains GWU
 */
public class Rectangle {
    private int x, y;
    private int width, height;
    private Color fillColor, borderColor;

    public Rectangle(int x, int y, int width, int height, Color fillColor, Color borderColor) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void show() {}
}
