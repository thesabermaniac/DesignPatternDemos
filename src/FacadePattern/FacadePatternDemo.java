package FacadePattern;

public class FacadePatternDemo {

    /**
     * This is all the user needs to run this facade pattern.
     * Notice how simplified it is compared to the relatively complex
     * functionality that's being executed under the hood.
     * @param args
     */
    public static void main(String[] args) {
        SchoolManager sm = new SchoolManager();
        sm.goToClasses();
    }
}
