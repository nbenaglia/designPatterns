package observer.classic;

public class ObserverTest {
    public static void main(String[] args) {
        Stock stock = new Stock("GOOAV", 101.99);
        StockView stockView = new StockView(stock);

        // Instantiate trader with target selling price for the stock
        Trader trader = new Trader(stock, 120.10);

        stock.setPrice(110.10);
        stock.setPrice(115.80);
        stock.setPrice(125.20);
    }
}
