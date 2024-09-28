package Abstraction;

public class Pix extends PaymentMethod {
    private String pixKey;

    public Pix(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public boolean validatePayment() {
        return pixKey.length() >= 5;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Pagamento de R$ " + amount + " processado com sucesso via Pix.");
        } else {
            System.out.println("Falha na validação da chave Pix.");
        }
    }
}
