package sandbox.Interfaces;

public class ExternalVendor implements Payable {
    public void processPayment() {
        System.out.println("Mailing check for hourly invoice");
    }
}
