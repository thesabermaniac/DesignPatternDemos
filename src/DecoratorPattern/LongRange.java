package DecoratorPattern;

public class LongRange extends TeslaDecorator{

    public LongRange(TeslaFeature feature) {
        super(feature);
    }

    public int getCost(){
        return super.getCost() + 10_000;
    }

    public String addFeature(){
        return super.addFeature() + " long range edition";
    }
}
