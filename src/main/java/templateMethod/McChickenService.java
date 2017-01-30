package templateMethod;

public class McChickenService extends BurgerService {

    public void prepareMcChicken() {
        System.out.println("\n**** Preparing a McChicken ****");
        heatMeat(3);
        openBread();
        addMeat();
        addSalade();
    }

    protected void heatMeat(int cookingMinutes) {
        this.cookingMinutes = cookingMinutes;
        System.out.println("Heating chicken for " + cookingMinutes + " minutes");
    }
}
