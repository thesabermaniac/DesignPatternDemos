package DecoratorPattern;

public class RedPaintJob extends TeslaDecorator{

    public RedPaintJob(TeslaFeature feature){
        super(feature);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2_000;
    }

    @Override
    public String addFeature() {
        return super.addFeature() + " with a red paint job";

    }
}
