package factoryMethod;

public class Stock implements FinancialProduct{
    @Override
    public String name() {
        return "Stock";
    }
}
