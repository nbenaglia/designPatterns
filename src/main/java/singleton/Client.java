package singleton;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentService.getInstance();
        paymentService.pay("John", 3);
        paymentService.receive("Mary", 2);
    }
}
