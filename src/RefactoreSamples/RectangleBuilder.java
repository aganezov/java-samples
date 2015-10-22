package RefactoreSamples;

import java.awt.*;

/* Builder pattern implementation for Rectangle class created by invoking (in Rectangle Class)
*               Ctrl + T -> Replace with Builder
* */
public class RectangleBuilder {
    private int x = 0;
    private int y = 0;
    private int width;
    private int height;
    private Color fillColor;
    private Color borderColor;

    public RectangleBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public RectangleBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public RectangleBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public RectangleBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public RectangleBuilder setFillColor(Color fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public RectangleBuilder setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Rectangle createRectangle() {
        return new Rectangle(x, y, width, height, fillColor, borderColor);
    }
}