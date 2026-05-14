package LLD.OpenClosedPrinciple;

public class UKTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return  0.12 * amount;
    }
}
