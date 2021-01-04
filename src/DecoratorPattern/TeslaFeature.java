package DecoratorPattern;

/**
 * Interface for features to be appended to Tesla cars
 */
public interface TeslaFeature {
    public int getCost();
    public String addFeature();
}
