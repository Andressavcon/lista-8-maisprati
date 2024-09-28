package Abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentCard = new CreditCard("1234567812345678", "12/25", "123");
        PaymentMethod paymentSlip = new Boleto("01234567890123456789012345678901234567890123456");
        PaymentMethod paymentPix = new Pix("email@example.com");

        paymentCard.processPayment(750.00);
        paymentSlip.processPayment(157.15);
        paymentPix.processPayment(550.40);
    }
}
