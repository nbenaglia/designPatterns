package strategy;

/**
 * Created by nicola on 28/06/17.
 */
// Strategy for Happy hour (50% discount)
class HappyHourStrategy implements BillingStrategy {

	public double getActPrice(final double rawPrice) {
		return rawPrice*0.5;
	}

}
