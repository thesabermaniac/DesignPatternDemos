package StrategyPattern;

public class SacrificeBunt implements Strategy{


    @Override
    public void execute() {
        System.out.println("The hitter squares up to bunt...and it's a beauty down the 3rd base line." +
                " Fielded by the pitcher, who squares and throws a strike to first for the out.");
    }
}
