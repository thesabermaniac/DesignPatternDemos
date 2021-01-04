package FacadePattern;

/**
 * Interface for creating a Course class. Such a class requires these four methods
 *  and will be implemented by any class that wants to be treated as a Course.
 */
public interface Course {
    public void attendClass();
    public void takeTest();
    public int getTime();
    public boolean isTestScheduled();
}
