package Composite;

public class Developer implements Employee {
    private String name;
    private String role;

    public Developer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showDetails() {
        System.out.println("Developer: " + name + ", " + role);
    }
}
