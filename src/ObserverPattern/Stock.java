package ObserverPattern;

/**
 * Interface to be implemented by classes designed to track stock prices
 */
public interface Stock {
    public double getPrice();
    public void updatePrice();
    public String getTicker();
    public void buy();
    public void sell();
}
