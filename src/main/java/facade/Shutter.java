package facade;

public class Shutter {
    private double seconds;

    public void setSeconds(double seconds) {
        this.seconds = seconds;
    }

    public void trigger() {
        System.out.format("Shutter opens for %.3f seconds\n", seconds);
    }
}
