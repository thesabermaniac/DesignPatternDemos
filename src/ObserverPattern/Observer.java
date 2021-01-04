package ObserverPattern;

/**
 * Interface for classes that will be implemented to observer and get updates
 * from subject classes. In this case, the subjects must implement from the
 * stock interface.
 */
public interface Observer {
    public void update(Stock stock);
}
