import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observerCollection;

    public WeatherStation() {
        this.observerCollection = new ArrayList<Observer>();
    }

    void temperature() {

    }

    void windSpeed() {

    }

    void pressure() {
    }

    public void registerObserver() {
        System.out.println("... registerObserver");
    }

    public void removeObserver() {
        System.out.println("... removeObserver");
    }

    public void notifyObservers() {
        System.out.println("... notifyObservers");
    }
}
