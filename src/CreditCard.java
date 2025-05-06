public class CreditCard implements IPayguement {
    private final String cardNumber;
    private final String cardHolderName;
    private final String expiryDate;
    private final String cvv;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void pay(String amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    @Override
    public void SowInfo() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder Name: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
    }
}
