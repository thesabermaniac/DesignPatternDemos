package StrategyPattern;

public class SwingAway implements Strategy{

    @Override
    public void execute() {
        System.out.println("Line drive up the middle...and it falls for a base hit.");
    }
}
