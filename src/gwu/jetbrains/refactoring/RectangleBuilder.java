package gwu.jetbrains.refactoring;

import java.awt.*;


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

    /* Method signature and code is changed (Rectangle -> newlyNamedRectangle) by    Ctrl + T -> Rename (in Rectangle class)  */
    public newlyNamedRectangle createRectangle() {
        return new newlyNamedRectangle(x, y, width, height, fillColor, borderColor);
    }
}