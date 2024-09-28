package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Calça", 50.0, 10);
        product.displayProduct();
        product.setPrice(-20.0);
        product.setPrice(70.0);
        product.displayProduct();
        product.setQuantity(5);
        product.displayProduct();

        try {
            product.applyDiscount(20);
            System.out.println("Desconto de 20% aplicado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        product.displayProduct();

        try {
            product.applyDiscount(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}