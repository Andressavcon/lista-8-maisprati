package EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Employee manager = new Manager("Alice", 8000.00);
        Employee developer = new Developer("Bob", 6000.00);
        Employee intern = new Intern("Charlie", 2000.00);

        system.addEmployee(manager);
        system.addEmployee(developer);
        system.addEmployee(intern);

        double totalPayroll = system.calculateTotalPayroll();
        System.out.println("Total Payroll: R$ " + totalPayroll);

        system.promoteEmployee(intern);

        totalPayroll = system.calculateTotalPayroll();
        System.out.println("Total Payroll after Promotion: R$ " + totalPayroll);
    }
}
