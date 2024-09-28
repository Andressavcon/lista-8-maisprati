package Abstraction;

public abstract class PaymentMethod {
    public abstract void processPayment(double amount);

    public abstract boolean validatePayment();
}
