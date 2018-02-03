package factoryMethod;

public class User {

    public static void userWants(FinancialProduct product) {
        System.out.println("User wants to buy a " + product.name());
    }

    public static void main(String[] args) {
        FinancialProduct loan = FinancialProductFactory.createProduct("loan");
        userWants(loan);

        FinancialProduct stock = FinancialProductFactory.createProduct("stock");
        userWants(stock);

        FinancialProduct bond = FinancialProductFactory.createProduct("bond");
        userWants(bond);
    }
}
