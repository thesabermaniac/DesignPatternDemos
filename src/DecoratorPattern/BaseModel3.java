package DecoratorPattern;

/**
 * Base class for the model 3. Notice that it has no constructor
 * and therefore doesn't accept any parameters. It also doesn't
 * extend the decorator class as that's strictly for decorators
 * which will be added onto one of the base classes.
 */
public class BaseModel3 implements TeslaFeature{
    @Override
    public int getCost() {
        return 35_000;
    }

    @Override
    public String addFeature() {
        return "Tesla Model 3";
    }
}
