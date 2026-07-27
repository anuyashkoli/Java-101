package sandbox.Interfaces;

public class Main {
    public static void main(String[] Args) {
        FullTimeStaff fullTimeStaff = new FullTimeStaff();
        ExternalVendor externalVendor = new ExternalVendor();

        fullTimeStaff.processPayment();
        externalVendor.processPayment();
    }
}
