package gwu.jetbrains.patterns.structural;

/**
 * Code is taken from "Software Design Patterns Explain Simply"
 */

class LegacyLine {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')');
    }
}


class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
    }
}



interface Shape {
    void draw(int x1, int y1, int x2, int y2);
}

class Line implements Shape {
    public Line() {
        this.line = new LegacyLine();
    }
    LegacyLine line;

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
           this.line.draw(x1, y1, x2, y2);
    }
}

class Rectangle implements Shape {
    public Rectangle() {
        this.rectangle = new LegacyRectangle();
    }

    LegacyRectangle rectangle;

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        this.rectangle.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
    }
}

public class AdapterDemo {
    public static void main(String[] args) {

        LegacyLine legacyLine = new LegacyLine();
        LegacyRectangle legacyRectangle = new LegacyRectangle();

        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        legacyLine.draw(x1, y1, x2, y2);
        legacyRectangle.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));

        Line line = new Line();
        Rectangle rectangle = new Rectangle();

        line.draw(x1, y1, x2, y2);
        rectangle.draw(x1, y1, x2, y2);

    }
}
