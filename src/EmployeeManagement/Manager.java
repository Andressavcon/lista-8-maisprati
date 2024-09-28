package EmployeeManagement;

public class Manager extends Employee {
    private static final double BONUS_PERCENTAGE = 0.20;

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * BONUS_PERCENTAGE;
    }

    @Override
    public void promote() {
        System.out.println(getName() + " has been promoted to Senior Manager.");
    }
}
