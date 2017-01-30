package observer.classic;

public class StockView implements Observer {
    private Stock stock;

    public StockView(Stock stock) {
        this.stock = stock;
        stock.attach(this);
    }

    public void update() {
        System.out.println(stock.getSymbol() + " has a sell price of " + stock.getPrice());
    }
}
