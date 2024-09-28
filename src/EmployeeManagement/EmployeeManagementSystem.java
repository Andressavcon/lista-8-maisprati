package EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    private final List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalPayroll() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.calculatePayroll();
        }
        return total;
    }

    public void promoteEmployee(Employee employee) {
        employee.promote();
    }
}
