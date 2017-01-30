package facade;

public class LightMeter {
    private int speed;

    public LightMeter(int speed) {
        this.speed = speed;
    }

    public double getRecommendedSpeed() {
        return 1.5/60.0;
    }

    public double getRecommendedAperture() {
        return 7;
    }
}
