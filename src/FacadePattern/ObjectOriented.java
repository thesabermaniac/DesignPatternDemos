package FacadePattern;

/**
 * An implementation of the Course Interface for the Object Oriented course.
 * This will be called by the SchoolManager class for any student that's taking
 * this course.
 */
public class ObjectOriented implements Course{
    String professor = "Professor Yoni Robinson";
    int time = 555;

    @Override
    public void attendClass() {
        System.out.println("Going to Object Oriented with " + professor);
    }

    @Override
    public void takeTest() {
        System.out.println("Time to take the test for Object Oriented. Good luck!");
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public boolean isTestScheduled() {
        return false;
    }
}
