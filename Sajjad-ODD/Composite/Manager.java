package Composite;

public class Manager implements Employee {
    private String name;
    private String dept;

    public Manager(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void showDetails() {
        System.out.println("Manager: " + name + ", " + dept);
    }
}
