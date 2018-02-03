package factoryMethod;

public class Loan implements FinancialProduct{
    @Override
    public String name() {
        return "Loan";
    }
}
