package DecoratorPattern;

public class SportWheels extends TeslaDecorator{

    public SportWheels(TeslaFeature feature) {
        super(feature);
    }

    public int getCost(){
        return super.getCost() + 1_500;
    }

    public String addFeature(){
        return super.addFeature() + " with 19\" sports wheels";
    }
}
