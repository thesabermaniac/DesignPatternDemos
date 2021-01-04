package FacadePattern;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Facade class that simplifies all the complex code that's
 * going on under the hood. This is the only class the user will
 * have to call directly. The rest is all taken care of under the hood.
 */
public class SchoolManager {
    ComputerMethodology cm;
    ObjectOriented oo;
    OperatingSystems os;
    ArrayList<Course> courses = new ArrayList<>();

    /*
    Sorts courses based on their respective start times, earliest to latest.
     */
    Comparator<Course> courseComparator = new Comparator<Course>() {
        @Override
        public int compare(Course o1, Course o2) {
            return Integer.compare(o1.getTime(), o2.getTime());
        }
    };

    /**
     * Creates all relevant courses and adds them to the courses ArrayList,
     * then sorts the list based on the courseComparator
     */
    public SchoolManager(){
        cm = new ComputerMethodology();
        oo = new ObjectOriented();
        os = new OperatingSystems();
        courses.add(cm);
        courses.add(oo);
        courses.add(os);
        courses.sort(courseComparator);
    }

    /**
     * Iterates through the courses ArrayList and performs all relevant actions on each course
     */
    public void goToClasses(){
        for(Course c : courses){
            c.attendClass();
            if(c.isTestScheduled()){
                c.takeTest();
            }
            System.out.println();
        }
    }
}
