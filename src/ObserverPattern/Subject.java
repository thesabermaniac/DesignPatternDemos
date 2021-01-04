package ObserverPattern;

/**
 * Interface to be implemented by Subject objects designed to handle observers
 * and update them when appropriate.
 */
public interface Subject {
    public void addObserver(Observer o);
    public void notifyObservers();
}
