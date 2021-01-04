package DecoratorPattern;

public class WhiteInterior extends TeslaDecorator{

    public WhiteInterior(TeslaFeature feature) {
        super(feature);
    }

    public int getCost(){
        return super.getCost() + 1_000;
    }

    public String addFeature(){
        return super.addFeature() + " with white interior";
    }
}
