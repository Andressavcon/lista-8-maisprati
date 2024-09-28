package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Joana", 5000.0);
        Employee developer = new Developer("Claudio", 4000.0);

        System.out.println("Informações do Gerente:");
        manager.displayInformation();
        System.out.println("Bônus: R$" + manager.calculateBonus());
        System.out.println();

        System.out.println("Informações do Desenvolvedor:");
        developer.displayInformation();
        System.out.println("Bônus: R$" + developer.calculateBonus());

        manager.work();
        developer.work();
    }
}