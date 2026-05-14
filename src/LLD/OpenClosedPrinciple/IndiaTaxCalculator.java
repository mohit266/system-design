package LLD.OpenClosedPrinciple;

public class IndiaTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return 0.18 * amount;
    }
}
