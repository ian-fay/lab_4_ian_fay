package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course{
    public IntroToProgrammingCourse(String courseName, String courseNumber, int credits) {
        super(courseName, courseNumber,credits);
    }

    @Override
    public String toString() {
        return super.toString() + "IntroToProgrammingCourse{}";
    }
}
