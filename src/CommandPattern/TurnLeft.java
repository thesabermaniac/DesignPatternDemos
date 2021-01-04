package CommandPattern;

public class TurnLeft implements Command{
    Car car;

    public TurnLeft(Car c){
        car = c;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }
}
