package CommandPattern;

import java.util.Random;

public class Car {
    int speed = 0;
    Random random = new Random();

    public void accelerate(){
        speed += random.nextInt(10);
        System.out.println("Accelerating...your speed is now " + speed + " mph.");
    }

    public void turnRight(){
        System.out.println("Turning right...");
    }

    public void turnLeft(){
        System.out.println("Turning left...");
    }

    public void brake(){
        speed -= random.nextInt(speed);
        System.out.println("Slowing down...your speed is now " + speed + " mph.");
    }
}
