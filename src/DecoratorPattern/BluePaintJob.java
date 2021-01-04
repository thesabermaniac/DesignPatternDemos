package DecoratorPattern;

public class BluePaintJob extends TeslaDecorator{

    public BluePaintJob(TeslaFeature feature){
        super(feature);
    }

    @Override
    public int getCost() {
        return super.getCost() + 1_000;
    }

    @Override
    public String addFeature() {
        return super.addFeature() + " with a blue paint job";

    }
}
