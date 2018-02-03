package factoryMethod;

public class FinancialProductFactory {

    public static FinancialProduct createProduct(String name){
        switch(name){
            case "loan": return new Loan();
            case "stock": return new Stock();
            case "bond": return new Bond();
            default: throw new RuntimeException("No such product " + name);
        }
    }

}
