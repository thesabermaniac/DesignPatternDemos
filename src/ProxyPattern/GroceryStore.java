package ProxyPattern;

public class GroceryStore implements Store{

    @Override
    public void enter(Person patron) {
        System.out.println(patron.getName() + " enters the store.");
    }

    @Override
    public void leave(Person patron) {
        System.out.println(patron.getName() + " leaves the store.");
    }
}
