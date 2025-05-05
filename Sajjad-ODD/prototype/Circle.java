package prototype;



public class Circle implements Shape {
    private String color;
    private int radius;
    
    public Circle(String color, int radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }

    @Override
    public Shape clone(){
        return new Circle(this.color, this.radius);
    }

    @Override
    public void draw(){
        System.out.println("Drawing Circle with color: " + color + " and radius: " + radius);
    }

}
