package DecoratorPattern;

/**
 * Demo of decorators in action. Notice the ability to mix and match
 * different features at will. The only caveat is that the base
 * model must be the first class instantiated (i.e. the inner-most parentheses)
 * as they don't accept any parameters
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BaseModel3 model3 = new BaseModel3();
        TeslaDecorator model3Decorator = new SportWheels(new BlackPaintJob(new FullSelfDriving(model3)));
        System.out.println(model3Decorator.addFeature());
        System.out.println(model3Decorator.getCost());

        BaseModelS modelS = new BaseModelS();
        TeslaDecorator modelSDecorator = new RedPaintJob(new WhiteInterior(new FullSelfDriving(new SportWheels(new Performance(modelS)))));
        System.out.println(modelSDecorator.addFeature());
        System.out.println(modelSDecorator.getCost());

        BaseModelX modelX = new BaseModelX();
        TeslaDecorator modelXDecorator = new SilverPaintJob(new LongRange(modelX));
        System.out.println(modelXDecorator.addFeature());
        System.out.println(modelXDecorator.getCost());

        BaseModelY modelY = new BaseModelY();
        TeslaDecorator modelYDecorator = new BluePaintJob(new SportWheels(new FullSelfDriving(modelY)));
        System.out.println(modelYDecorator.addFeature());
        System.out.println(modelYDecorator.getCost());
    }
}
