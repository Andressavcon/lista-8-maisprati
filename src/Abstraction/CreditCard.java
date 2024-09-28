package Abstraction;

public class CreditCard extends PaymentMethod {
    private String cardNumber;
    private String expirationDate;
    private String cvv;

    public CreditCard(String cardNumber, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePayment() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Pagamento de R$ " + amount + " processado com sucesso via Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do pagamento com Cartão de Crédito.");
        }
    }
}
