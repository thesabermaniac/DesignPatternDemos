package StrategyPattern;

public class StrategyExecutor {
    private Strategy strategy;

    public StrategyExecutor(Strategy s){
        strategy = s;
    }

    public void changeStrategy(Strategy s){
        strategy = s;
    }

    public void executeStrategy(){
        strategy.execute();
    }
}
