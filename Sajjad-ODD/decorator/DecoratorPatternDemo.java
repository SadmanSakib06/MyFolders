package decorator;

// Component
interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete Component
class Margherita implements Pizza {
    public String getDescription() {
        return "Margherita";
    }

    public double getCost() {
        return 5.0;
    }
}

// Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; // the object we're decorating

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete Decorators
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}

class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}

// Client
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza pizza = new Margherita();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);

        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
        // Output: Margherita, Cheese, Olives, Pepperoni Cost: $9.5
    }
}
