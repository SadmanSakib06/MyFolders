package prototype;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 10);
        Shape cloneCircle = circle.clone();

        System.out.println("Original and clone shape: ");
        circle.draw();
        cloneCircle.draw();
    }
}
