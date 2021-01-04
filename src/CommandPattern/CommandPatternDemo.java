package CommandPattern;

import java.util.ArrayList;

/**
 * Demo for command pattern. Notice how you can add multiple commands in
 * various orders, depending on the needs of your program.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Executor executor = new Executor();
        Car car = new Car();

        executor.addCommand(new TurnRight(car));
        executor.addCommand(new Accelerate(car));
        executor.addCommand(new Accelerate(car));
        executor.addCommand(new Accelerate(car));
        executor.addCommand(new SlowDown(car));
        executor.addCommand(new SlowDown(car));
        executor.addCommand(new TurnLeft(car));
        executor.addCommand(new Accelerate(car));
        executor.addCommand(new Accelerate(car));
        executor.executeAll();
    }
}
