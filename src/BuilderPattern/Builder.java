package BuilderPattern;

/**
 * Interface to be implemented by a Builder class that will create an object piece-by-piece before ultimately
 * instantiating the object itself.
 */
public interface Builder {
    public Object build();
}
