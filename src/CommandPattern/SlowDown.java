package CommandPattern;

public class SlowDown implements Command{
    Car car;

    public SlowDown(Car c){
        car = c;
    }

    @Override
    public void execute() {
        car.brake();
    }
}
