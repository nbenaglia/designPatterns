package templateMethod;

public abstract class BurgerService {

    protected int cookingMinutes;

    // list of protected methods, subclasses may override them.
    protected void addSalade() {
        System.out.println("Adding salad");
    }

    protected abstract void heatMeat(int cookingMinutes);

    protected void addCucumber() {
        System.out.println("Adding cucumber");
    }

    protected void openBread() {
        System.out.println("Opening bread");
    }

    protected void addMeat() {
        System.out.println("Adding a slice of meat");
    }

    protected void addBread() {
        System.out.println("Adding a slice of bread");
    }


}
