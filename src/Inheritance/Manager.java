package Inheritance;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void work() {
        System.out.println(name + " está gerenciando a equipe.");
    }
}
