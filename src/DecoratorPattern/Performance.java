package DecoratorPattern;

public class Performance extends TeslaDecorator{

    public Performance(TeslaFeature feature) {
        super(feature);
    }

    public int getCost(){
        return super.getCost() + 20_000;
    }

    public String addFeature(){
        return super.addFeature() + " performance edition";
    }
}
