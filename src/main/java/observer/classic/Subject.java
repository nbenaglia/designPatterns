package observer.classic;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List observers = new ArrayList();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Object object : observers) {
            Observer observer = (Observer) object;
            observer.update();
        }
    }
}
