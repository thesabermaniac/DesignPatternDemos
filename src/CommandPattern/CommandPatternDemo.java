package CommandPattern;

import java.util.ArrayList;

/**
 * Demo for command pattern. Notice how you can add multiple commands in
 * various orders, depending on the needs of your program.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        ArrayList<Command> commands = new ArrayList<>();
        Car car = new Car();

        commands.add(new TurnRight(car));
        commands.add(new Accelerate(car));
        commands.add(new Accelerate(car));
        commands.add(new Accelerate(car));
        commands.add(new SlowDown(car));
        commands.add(new SlowDown(car));
        commands.add(new TurnLeft(car));
        commands.add(new Accelerate(car));
        commands.add(new Accelerate(car));

        for(Command command:commands){
            command.execute();
        }
    }
}
