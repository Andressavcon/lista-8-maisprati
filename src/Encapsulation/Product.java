package Encapsulation;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("A quantidade não pode ser negativa.");
        }
    }

    public void applyDiscount(double percentage) throws IllegalArgumentException {
        if (percentage > 50) {
            throw new IllegalArgumentException("Desconto não pode ser maior que 50%");
        }
        if (percentage < 0) {
            throw new IllegalArgumentException("Desconto não pode ser negativo");
        }
        this.price = this.price - (this.price * (percentage / 100));
    }

    public void displayProduct() {
        System.out.println("Nome: " + name);
        System.out.println("Preço: R$" + price);
        System.out.println("Quantidade em estoque: " + quantity);
    }
}
