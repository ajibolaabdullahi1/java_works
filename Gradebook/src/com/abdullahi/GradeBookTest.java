
package com.abdullahi;

/**
 *
 * @author abdullahi
 */
public class GradeBookTest {
    public static void main(String[] args){
        GradeBook gradeBook = new GradeBook("Physics");
        gradeBook.displayMessage();
        gradeBook.setCourseName("Python");
        gradeBook.displayMessage();
        
        gradeBook.determineClassAverage();
        
    }
}
