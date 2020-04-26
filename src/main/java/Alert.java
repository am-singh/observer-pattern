public class Alert implements Observer{
    WeatherStation weatherStation;

    public Alert() {
        weatherStation = new WeatherStation();
        weatherStation.registerObserver();
    }

    public void update() {

    }

    void alert() {

    }
}
