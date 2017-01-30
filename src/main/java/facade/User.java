package facade;

public class User {
    public static void main(String[] args) {
        userManual();
        userAuto();
    }

    public static void userAuto(){
        AutomaticPictureFacade facade = new AutomaticPictureFacade();
        facade.takePicture();
    }

    public static void userManual(){
        Aperture aperture = new Aperture();
        Film film = new Film();
        Shutter shutter = new Shutter();

        // need to set all parameter before taking the picture
        int speed = film.getSpeed();
        if (speed > 300.0) {
            aperture.setSize(6);
            shutter.setSeconds(1);
        } else if (speed < 100.0) {
            aperture.setSize(4);
            shutter.setSeconds(3);
        } else {
            aperture.setSize(2);
            shutter.setSeconds(2);
        }

        shutter.trigger();
    }
}
