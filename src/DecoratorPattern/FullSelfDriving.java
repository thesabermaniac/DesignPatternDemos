package DecoratorPattern;

public class FullSelfDriving extends TeslaDecorator {

    public FullSelfDriving(TeslaFeature feature){
        super(feature);
    }

    @Override
    public int getCost() {
        return super.getCost() + 10_000;
    }

    @Override
    public String addFeature() {
        return super.addFeature() + " with full self-driving";
    }
}
