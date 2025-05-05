package bridge;

// The 'Implementor' hierarchy
interface Color {
    void applyColor();
}

// Concrete Implementors
class RedColor implements Color {
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class BlueColor implements Color {
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}

// The 'Abstraction' hierarchy
abstract class Shape {
    protected Color color; // bridge

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Refined Abstractions
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Circle and ");
        color.applyColor();
    }
}

class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Rectangle and ");
        color.applyColor();
    }
}

// Client code
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueRectangle = new Rectangle(new BlueColor());

        redCircle.draw();       // Output: Drawing Circle and Applying red color
        blueRectangle.draw();    // Output: Drawing Rectangle and Applying blue color
    }
}

