package EmployeeManagement;

public class Intern extends Employee {
    private static final double BONUS_PERCENTAGE = 0.05; // 5% bonus

    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * BONUS_PERCENTAGE;
    }

    @Override
    public void promote() {
        System.out.println(getName() + " has been promoted to Junior Developer.");
        setSalary(getSalary() * 1.10);
    }
}
