package StrategyPattern;

public class Take implements Strategy{
    @Override
    public void execute() {
        System.out.println("Taking all the way...and it's low and away for ball 4.");
    }
}
