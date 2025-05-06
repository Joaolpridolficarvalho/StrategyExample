public class Main {
    public static void main(String[] args) {
        // Create a CreditCard object
        CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "John Doe", "12/25", "123");
        creditCard.pay("100.00");
        creditCard.SowInfo();

        // Create a Pix object
        Pix pix = new Pix("pix-key-123", "Jane Doe", "Bank XYZ");
        pix.pay("50.00");
        pix.SowInfo();

        // Create a Pay object
        Pay pay = new Pay("200.00", "Credit Card");
        pay.processPayment();
        pay.showInfo();
    }
}