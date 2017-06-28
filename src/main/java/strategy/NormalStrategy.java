package strategy;

/**
 * Created by nicola on 28/06/17.
 */
// Normal billing strategy (unchanged price)
class NormalStrategy implements BillingStrategy {

	public double getActPrice(final double rawPrice) {
		return rawPrice;
	}

}
