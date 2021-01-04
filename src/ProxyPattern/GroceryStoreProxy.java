package ProxyPattern;

import java.util.ArrayList;

/**
 * Proxy to handle all the heavy-lifting logic for the store class.
 * Notice how big this class is compared to the GroceryStore class.
 */
public class GroceryStoreProxy implements Store{
    private final boolean IS_COVID = true;
    private final int MAX_PATRONS_ALLOWED;
    GroceryStore groceryStore;
    ArrayList<Person> currentPatrons = new ArrayList<>();
    ArrayList<Person> waitingList = new ArrayList<>();

    public GroceryStoreProxy(GroceryStore store){
        groceryStore = store;
        if(IS_COVID){
            MAX_PATRONS_ALLOWED = 5;
        }
    }

    @Override
    public void enter(Person patron) {
        if(currentPatrons.size() < MAX_PATRONS_ALLOWED){
            groceryStore.enter(patron);
            currentPatrons.add(patron);
        }
        else {
            System.out.println(patron.getName() + " could not enter the store due to COVID-19.");
            waitingList.add(patron);
        }
    }

    @Override
    public void leave(Person patron) {
        if(currentPatrons.contains(patron)) {
            groceryStore.leave(patron);
            currentPatrons.remove(patron);
            Person firstInLine = waitingList.remove(0);
            groceryStore.enter(firstInLine);
            currentPatrons.add(firstInLine);
        }
        else {
            System.out.println(patron.getName() + " is not currently in the store.");
        }
    }
}
