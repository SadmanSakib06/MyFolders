package builder;

public class Car {
    private String engine;
    private String wheels;
    private String color;
    private String model;

    // Private constructor to ensure Car can only be created through Builder
    Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", color=" + color + ", model=" + model + "]";
    }

    // Getter methods
    public String getEngine() { return engine; }
    public String getWheels() { return wheels; }
    public String getColor() { return color; }
    public String getModel() { return model; }
}
