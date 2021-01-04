package SingletonPattern;

/**
 * Singleton class that only allows one instance to be instantiated
 * every time this class is called.
 */
public class Singleton {
    private static Singleton singleton;

    //This constructor is private to prevent users from instantiating the class without calling the getInstance() method
    private Singleton(){

    }

    // NOT THREAD-SAFE
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //THREAD-SAFE - notice the synchronized block
    public static Singleton getThreadSafeInstance(){
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
