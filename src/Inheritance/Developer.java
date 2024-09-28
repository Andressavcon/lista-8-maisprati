package Inheritance;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void work() {
        System.out.println(name + " está escrevendo código.");
    }
}