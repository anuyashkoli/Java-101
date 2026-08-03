package sandbox.Products.TerminalShop;

public class UtilityBill implements Payable {
    String Company;
    int payableAmount;

    //Constructor
    public UtilityBill(String companyName, int amount) {
        Company = companyName;
        payableAmount = amount;
    }

    public void processPayment() {
        System.out.println("Wiring funds to utility company: " + Company);
    }
}
