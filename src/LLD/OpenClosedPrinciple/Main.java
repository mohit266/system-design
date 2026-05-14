package LLD.OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        double amount = 1000.0;

        InvoiceFollowOCP indiaInvoice = new InvoiceFollowOCP(amount, new IndiaTaxCalculator());
        System.out.println("Total (India): ₹" + indiaInvoice.getTotalAmount());

        InvoiceFollowOCP usInvoice = new InvoiceFollowOCP(amount, new USTaxCalculator());
        System.out.println("Total (US): $" + usInvoice.getTotalAmount());

        InvoiceFollowOCP ukInvoice = new InvoiceFollowOCP(amount, new UKTaxCalculator());
        System.out.println("Total (UK): £" + ukInvoice.getTotalAmount());
    }
}
