package strategy;

public class StrategyWithLambdas {

    // With lambdas (from Java 8) the boilerplate code of the strategy pattern is avoidable.

    public static void main(final String[] arguments) {
        Customer firstCustomer = new Customer(i -> i);   // set strategy with lambda: no discount, full price
        firstCustomer.add(1.2, 10);
        firstCustomer.printBill();

        // change strategy
        firstCustomer.setStrategy(i -> i*0.4);  // 60% of discount (pay 40% of the prize)
        firstCustomer.add(1, 20);
        firstCustomer.printBill();
    }
}
