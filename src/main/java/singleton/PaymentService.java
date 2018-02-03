package singleton;

public class PaymentService {

    private static PaymentService instance = null;

    private PaymentService() {
        System.out.println("Bow me, I am your payment service!");
    }

    public synchronized static PaymentService getInstance() {
        if (instance == null) {
            instance = new PaymentService();
        }
        return instance;
    }

    public void pay(String name, int amount) {
        System.out.println("I am going to pay " + name + " " + amount + " BTC.");
    }

    public void receive(String name, int amount) {
        System.out.println("I am receiving " + amount + " BTC from "  + name + ".");
    }
}

