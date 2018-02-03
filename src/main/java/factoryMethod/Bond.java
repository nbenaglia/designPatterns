package factoryMethod;

public class Bond implements FinancialProduct{
    @Override
    public String name() {
        return "Bond";
    }
}
