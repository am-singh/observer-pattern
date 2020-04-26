public class UserInterface implements Observer{
    WeatherStation weatherStation;

    public UserInterface() {
        weatherStation = new WeatherStation();
        weatherStation.registerObserver();
    }

    void display() {

    }

    public void update() {

    }
}
