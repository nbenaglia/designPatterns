package facade;

public class AutomaticPictureFacade {
    private Shutter shutter;
    private Aperture aperture;
    private Film film;

    public AutomaticPictureFacade() {
        film = new Film();
        aperture = new Aperture();
        shutter = new Shutter();
    }

    // builds actions to execute
    public void takePicture() {
        LightMeter lightMeter = new LightMeter(film.getSpeed());
        shutter.setSeconds(lightMeter.getRecommendedSpeed());
        aperture.setSize(lightMeter.getRecommendedAperture());
        shutter.trigger();
    }
}
