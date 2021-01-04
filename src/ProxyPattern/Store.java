package ProxyPattern;

/**
 * Interface for Store objects that allow patrons to enter and leave
 */
public interface Store {
    public void enter(Person patron);
    public void leave(Person patron);
}
