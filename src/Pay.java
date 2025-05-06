public class Pay {
    private final String amount;
    private final String paymentMethod;

    public Pay(String amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        System.out.println("Processing payment of " + amount + " using " + paymentMethod);
    }

    public void showInfo() {
        System.out.println("Payment Amount: " + amount);
        System.out.println("Payment Method: " + paymentMethod);
    }
}
