public class WeatherStation implements Subject{

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
