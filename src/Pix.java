public class Pix implements IPayment {
    private final String pixKey;
    private final String accountHolderName;
    private final String bankName;

    public Pix(String pixKey, String accountHolderName, String bankName) {
        this.pixKey = pixKey;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
    }

    @Override
    public void pay(String amount) {
        System.out.println("Paid " + amount + " using Pix.");
    }

    @Override
    public void SowInfo() {
        System.out.println("Pix Key: " + pixKey);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Bank Name: " + bankName);
    }
}
