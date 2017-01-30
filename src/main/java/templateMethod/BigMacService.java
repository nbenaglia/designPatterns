package templateMethod;

public class BigMacService extends BurgerService {

    public void prepareBigMac() {
        System.out.println("****Preparing a BigMac****");
        heatMeat(2);
        openBread();
        addMeat();
        addBread();
        addMeat();
        addSalade();
        addCucumber();
    }

    protected void heatMeat(int cookingMinutes) {
        this.cookingMinutes = cookingMinutes;
        System.out.println("Heating meat for " + cookingMinutes + " minutes");
    }
}
