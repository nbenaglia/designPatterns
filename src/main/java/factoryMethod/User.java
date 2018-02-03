package factoryMethod;

public class User {
    public static void main(String[] args) {
        FinancialProduct loan = FinancialProductFactory.createProduct("loan");
        System.out.println("User wants to buy a " + loan.name());

        FinancialProduct stock = FinancialProductFactory.createProduct("stock");
        System.out.println("User wants to buy a " + stock.name());

        FinancialProduct bond = FinancialProductFactory.createProduct("bond");
        System.out.println("User wants to buy a " + bond.name());
    }
}
