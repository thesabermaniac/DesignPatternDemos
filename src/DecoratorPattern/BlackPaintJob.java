package DecoratorPattern;

public class BlackPaintJob extends TeslaDecorator{

    public BlackPaintJob(TeslaFeature feature){
        super(feature);
    }

    @Override
    public int getCost() {
        return super.getCost() + 1_000;
    }

    @Override
    public String addFeature() {
        return super.addFeature() + " with a black paint job";

    }
}
