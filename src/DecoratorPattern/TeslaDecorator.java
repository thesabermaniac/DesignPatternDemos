package DecoratorPattern;

/**
 * Abstract decorator class for features to extend from.
 * All added feature classes (excluding the base model classes)
 * must extend from this class.
 */
public abstract class TeslaDecorator implements TeslaFeature{
    TeslaFeature teslaFeature;

    public TeslaDecorator(TeslaFeature feature){
        teslaFeature = feature;
    }

    @Override
    public int getCost() {
        return teslaFeature.getCost();
    }

    @Override
    public String addFeature() {
        return teslaFeature.addFeature();
    }
}
