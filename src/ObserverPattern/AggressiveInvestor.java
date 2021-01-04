package ObserverPattern;

/**
 * Aggressive investor that gets updates from a stock object and determines
 * whether to buy or sell based on its price. This investor has a higher risk
 * tolerance than the neutral investor
 */
public class AggressiveInvestor implements Observer{
    int APPLShares = 0;
    int TSLAShares = 0;

    public int getAPPLShares(){
        return APPLShares;
    }

    public int getTSLAShares(){
        return TSLAShares;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Aggressive Investor: " + stock.getTicker() + " price: " + stock.getPrice());
        if(stock.getTicker().equals("APPL")){
            if(stock.getPrice() <= 132.00) {
                stock.buy();
                APPLShares++;
            }
            else if(stock.getPrice() >= 140.00 && APPLShares > 0){
                stock.sell();
                APPLShares--;
            }
        }
        else if(stock.getTicker().equals("TSLA")){
            if(stock.getPrice() <= 703.00){
                stock.buy();
                TSLAShares++;
            }
            else if(stock.getPrice() >= 720.00 && TSLAShares > 0){
                stock.sell();
                TSLAShares--;
            }
        }
    }
}
