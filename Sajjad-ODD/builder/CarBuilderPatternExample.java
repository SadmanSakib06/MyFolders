package builder;


public class CarBuilderPatternExample {

    public static void main(String[] args) {
        // Using the builder to create a car object
        Car car1 = new CarBuilder()
                .setEngine("V8 Engine")
                .setWheels("Alloy Wheels")
                .setColor("Red")
                .setModel("Sports Car")
                .build();

        System.out.println(car1);

        // Creating another car with different properties
        Car car2 = new CarBuilder()
                .setEngine("Electric Engine")
                .setWheels("Steel Wheels")
                .setColor("Blue")
                .setModel("SUV")
                .build();

        System.out.println(car2);
    }
}
