package gwu.jetbrains.patterns.structural;

/**
 * created by aganezov on 02/01/2016
 */

import java.util.ArrayList;

abstract class Goods {
    protected static StringBuffer indent = new StringBuffer();
    public abstract int getValue();
}

class Product extends Goods {
    private int value;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(int value, String name) {
        this(value);
        this.name = name;
    }

    public Product(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        System.out.println(indent.toString() + "getting value from product " + this.getName() + " : " + String.valueOf(this.value));
        return this.value;
    }
}

class Box extends Goods {
    private int value;
    private String name;
    private ArrayList<Goods> children = new ArrayList<>();

    public Box(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public void addChild(Goods entry){
        this.children.add(entry);
    }

    public void removeChild(int index){
        this.children.remove(index);
    }

    public void removeChild(Goods entry){
        this.children.remove(entry);
    }

    @Override
    public int getValue() {
        System.out.println(indent.toString() + "traversing the box " + "\"" + this.name + "\"" + "\"" + String.valueOf(this.value) + "\"");
        int overallValue = 0;
        indent.append("-- ");
        for (Goods entry: this.children)
            overallValue += entry.getValue();
        indent.setLength(indent.length() - 3);
        return overallValue + this.value;
    }
}



public class CompositeDemo {
    public static void main(String[] args) {


        Box largestBox = new Box(3, "largest box");
        Box smallerBox = new Box(2, "smaller box");
        Box smallerBox2 = new Box(2, "smaller box");
        Box smallestBox = new Box(1, "smallest box");
        Box smallestBox1 = new Box(1, "smallest box");



        Product coffeeMug = new Product(10, "coffee mug");
        Product coffeeBeans = new Product(15, "coffee beans");
        Product frenchPress = new Product(20, "french press");
        Product grinder = new Product(25, "grinder");

        smallestBox.addChild(coffeeMug);
        smallestBox.addChild(coffeeMug);
        smallestBox.addChild(coffeeMug);
        smallestBox.addChild(coffeeMug);

        smallestBox1.addChild(coffeeMug);
        smallestBox1.addChild(coffeeMug);
        smallestBox1.addChild(coffeeMug);
        smallestBox1.addChild(coffeeMug);

        smallerBox.addChild(smallestBox);
        smallerBox.addChild(coffeeBeans);
        smallerBox.addChild(coffeeBeans);

        smallerBox2.addChild(smallestBox1);
        smallerBox2.addChild(coffeeBeans);
        smallerBox2.addChild(coffeeBeans);

        largestBox.addChild(smallerBox);
        largestBox.addChild(smallerBox2);
        largestBox.addChild(frenchPress);
        largestBox.addChild(grinder);

        System.out.println("Overall value: " + String.valueOf(largestBox.getValue()));

    }
}