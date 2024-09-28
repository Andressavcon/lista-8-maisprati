package Inheritance;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return 0;
    }

    public void work() {
        System.out.println(name + " está trabalhando.");
    }

    public void displayInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Salário: R$" + salary);
    }
}
