package EmployeeManagement;

public class Developer extends Employee {
    private static final double BONUS_PERCENTAGE = 0.10;

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * BONUS_PERCENTAGE;
    }

    @Override
    public void promote() {
        System.out.println(getName() + " has been promoted to Senior Developer.");
    }
}
