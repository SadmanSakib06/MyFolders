package builder;


public class CarBuilder {
    // Attributes to build a car
    String engine;
    String wheels;
    String color;
    String model;

    // Methods for setting optional fields
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    // Method to build the Car object
    public Car build() {
        return new Car(this);
    }
}
