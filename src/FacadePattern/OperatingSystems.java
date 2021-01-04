package FacadePattern;

/**
 * An implementation of the Course Interface for the Operating Systems course.
 * This will be called by the SchoolManager class for any student that's taking
 * this course.
 */
public class OperatingSystems implements Course{
    String professor = "Professor Meir Fried";
    int time = 300;

    @Override
    public void attendClass() {
        System.out.println("Going to Operating Systems with " + professor);
    }

    @Override
    public void takeTest() {
        System.out.println("Time to take the test for Computer Methodology. Good luck!");
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
