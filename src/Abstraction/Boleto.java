package Abstraction;

public class Boleto extends PaymentMethod {
    private String barcode;

    public Boleto(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public boolean validatePayment() {
        return barcode.length() == 47;
    }

    @Override
    public void processPayment(double amount) {
        if (validatePayment()) {
            System.out.println("Boleto gerado no valor de R$ " + amount + ". Pague até a data de vencimento.");
        } else {
            System.out.println("Falha na validação do boleto.");
        }
    }
}
