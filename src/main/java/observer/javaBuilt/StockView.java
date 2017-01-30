package observer.javaBuilt;

import java.util.Observable;
import java.util.Observer;

public class StockView implements Observer {
    private Stock stock;

    public StockView(Stock stock) {
        this.stock = stock;
        stock.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        System.out.println(stock.getSymbol() + " has a sell price of " + stock.getPrice());
    }
}
