package ObserverPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class for tracking the price of stocks and updating its observers
 * when there's a change in price.
 */
public class StockTracker implements Subject, Stock{
    String ticker;
    double price;
    ArrayList<Observer> observers = new ArrayList<>();

    public StockTracker(String ticker, double price){
        this.ticker = ticker;
        this.price = price;
    }

    public void updatePrice(){
        Random random = new Random();
        int num = random.nextInt(20) - 10;
        price += num;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this);
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void buy() {
        System.out.println("1 share of " + ticker + " purchased.");
    }

    @Override
    public void sell() {
        System.out.println("1 share of " + ticker + " sold.");
    }
}
