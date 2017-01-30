package observer.classic;

public class Trader implements Observer {
    private Stock stock;
    private double sellPrice;

    public Trader(Stock stock, double sellPrice) {
        this.stock = stock;
        this.sellPrice = sellPrice;
        stock.attach(this);
    }

    public void update() {
        if (stock.getPrice() >= sellPrice) {
            System.out.println("It's time to sell " + stock.getSymbol() + " !!!");
        }
    }
}
