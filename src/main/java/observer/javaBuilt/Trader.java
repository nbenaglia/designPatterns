package observer.javaBuilt;

import java.util.Observable;

public class Trader implements java.util.Observer {
    private Stock stock;
    private double sellPrice;

    public Trader(Stock stock, double sellPrice) {
        this.stock = stock;
        this.sellPrice = sellPrice;
        stock.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (stock.getPrice() >= sellPrice) {
            System.out.println("It's time to sell " + stock.getSymbol() + " !!!");
        }
    }
}
