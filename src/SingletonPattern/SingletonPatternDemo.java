package SingletonPattern;

/**
 * Notice the name of the Singleton doesn't change when it's
 * printed the second time, indicating that it's not possible
 * to create a second instance of the class.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //The following line will throw an exception due to the private constructor in the Singleton class
        //Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
