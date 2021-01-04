package CommandPattern;

public class TurnRight implements Command{
    Car car;

    public TurnRight(Car c){
        car = c;
    }

    @Override
    public void execute() {
        car.turnRight();
    }
}
