package Composite;

import java.util.ArrayList;
import java.util.List;

// Composite class - Team (Can contain multiple employees)
class Team implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}
