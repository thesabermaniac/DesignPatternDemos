package StrategyPattern;

/**
 * Notice how the strategy can be easily changed based on the
 * circumstances provided by the program.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        System.out.println("And the first hitter steps up to begin the bottom of the 7th.");
        StrategyExecutor se = new StrategyExecutor(new SwingAway());
        se.executeStrategy();
        System.out.println("Runner on first, no outs. And that brings up the dangerous number 2 hitter.");
        se.changeStrategy(new Take());
        se.executeStrategy();
        System.out.println("Trouble for the away team, with runners on first and second, nobody out, and the number 3 hitter coming to the plate.");
        se.changeStrategy(new SacrificeBunt());
        se.executeStrategy();
        System.out.println("So that brings up the cleanup hitter with a chance to do some serious damage." +
                " Runners on second and third with one man out.");
        se.changeStrategy(new PowerSwing());
        se.executeStrategy();
        System.out.println("And just like that the home team takes a 6-4 lead in the late innings of this Game 7 of the World Series!");
    }
}
