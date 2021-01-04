package FacadePattern;

/**
 * An implementation of the Course Interface for the Computer Methodology course.
 * This will be called by the SchoolManager class for any student that's taking
 * this course.
 */
public class ComputerMethodology implements Course{
    String professor = "Professor Michael Cohen";
    int time = 425;

    @Override
    public void attendClass() {
        System.out.println("Going to Computer Methodology with " + professor);
    }

    @Override
    public void takeTest() {
        prayForAGoodScore();
        System.out.println("Time to take the test for Computer Methodology. Good luck!");
        begForABetterScore();
    }

    private void prayForAGoodScore(){
        System.out.println("Please Hashem, let me do well on this Computer Methodology test.");
    }

    private void begForABetterScore(){
        System.out.println("Please " + professor + ", give me a better grade on this Computer Methodology test.");
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public boolean isTestScheduled() {
        return true;
    }
}
