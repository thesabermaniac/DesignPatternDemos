package CommandPattern;

/**
 * Interface to be implemented by Command classes.
 * In our case, these class will be class that act
 * on our Car object and perform various actions on it.
 */
public interface Command {
    public void execute();
}
