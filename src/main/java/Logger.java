public class Logger implements Observer {
    WeatherStation weatherStation;

    public Logger() {
        weatherStation = new WeatherStation();
        weatherStation.registerObserver();
    }

    public void update() {

    }

    void log() {

    }
}
