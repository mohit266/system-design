package LLD.OpenClosedPrinciple;

public class USTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double amount) {
        return 0.08 * amount;
    }
}
