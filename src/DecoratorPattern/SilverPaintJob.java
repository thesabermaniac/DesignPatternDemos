package DecoratorPattern;

public class SilverPaintJob extends TeslaDecorator{

    public SilverPaintJob(TeslaFeature feature){
        super(feature);
    }

    @Override
    public int getCost() {
        return super.getCost() + 1_000;
    }

    @Override
    public String addFeature() {
        return super.addFeature() + " with a silver paint job";

    }
}
