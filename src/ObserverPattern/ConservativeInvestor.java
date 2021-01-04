package ObserverPattern;

/**
 * Conservative investor that gets updates from a stock object and determines
 * whether to buy or sell based on its price. This investor has a lower risk
 * tolerance than the neutral investor
 */
public class ConservativeInvestor implements Observer{
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
        System.out.println("Conservative Investor: " + stock.getTicker() + " price: " + stock.getPrice());
        if(stock.getTicker().equals("APPL")){
            if(stock.getPrice() <= 125.00) {
                stock.buy();
                APPLShares++;
            }
            else if(stock.getPrice() >= 135.00 && APPLShares > 0){
                stock.sell();
                APPLShares--;
            }
        }
        else if(stock.getTicker().equals("TSLA")){
            if(stock.getPrice() <= 695.00){
                stock.buy();
                TSLAShares++;
            }
            else if(stock.getPrice() >= 707.00 && TSLAShares > 0){
                stock.sell();
                TSLAShares--;
            }
        }
    }
}
