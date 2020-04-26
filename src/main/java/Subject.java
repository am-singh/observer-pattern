import java.util.List;

public interface Subject {

    void registerObserver();

    void removeObserver();

    void notifyObservers();
}
