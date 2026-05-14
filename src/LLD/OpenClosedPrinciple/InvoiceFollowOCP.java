package LLD.OpenClosedPrinciple;

public class InvoiceFollowOCP {
    private double amount;
    private TaxCalculator taxCalculator;

    public InvoiceFollowOCP(double amount, TaxCalculator taxCalculator) {
        this.amount = amount;
        this.taxCalculator = taxCalculator;
    }

    public double getTotalAmount() {
        return amount + taxCalculator.calculateTax(amount);
    }
}
