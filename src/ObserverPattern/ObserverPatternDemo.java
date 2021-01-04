package ObserverPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockTracker tsla = new StockTracker("TSLA", 705.67);
        StockTracker appl = new StockTracker("APPL", 132.69);
        Investor investor = new Investor();
        ConservativeInvestor conservativeInvestor = new ConservativeInvestor();
        AggressiveInvestor aggressiveInvestor = new AggressiveInvestor();
        tsla.addObserver(investor);
        tsla.addObserver(aggressiveInvestor);
        appl.addObserver(conservativeInvestor);
        appl.addObserver(aggressiveInvestor);
        appl.addObserver(investor);
        for(int i = 0; i < 10; i++){
            tsla.updatePrice();
            appl.updatePrice();
        }
        System.out.println("Aggressive portfolio: " +
                "\nAPPL: " + aggressiveInvestor.getAPPLShares() +
                "\nTSLA: " + aggressiveInvestor.getTSLAShares());
        System.out.println("Conservative portfolio: " +
                "\nAPPL: " + conservativeInvestor.getAPPLShares() +
                "\nTSLA: " + conservativeInvestor.getTSLAShares());
        System.out.println("Neutral portfolio: " +
                "\nAPPL: " + investor.getAPPLShares() +
                "\nTSLA: " + investor.getTSLAShares());
    }
}
