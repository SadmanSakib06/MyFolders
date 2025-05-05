package Composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee emp1 = new Manager("John", "Engineering");
        Employee emp2 = new Developer("David", "Developer");
        
        Team team = new Team();
        team.addEmployee(emp1);
        team.addEmployee(emp2);
        team.showDetails();
    }
}
