package CommandPattern;

public class Accelerate implements Command{
    Car car;

    public Accelerate(Car c){
        car = c;
    }

    @Override
    public void execute() {
        car.accelerate();
    }
}
