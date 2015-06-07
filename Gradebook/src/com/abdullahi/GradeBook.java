package com.abdullahi;
import java.util.Scanner;

/**
 *
 * @author abdullahi
 */
public class GradeBook {
    
    private String courseName;
    
    public GradeBook(String name){
        courseName = name;
    }
    
    public void setCourseName(String name){
        courseName = name;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void displayMessage(){
        System.out.printf("Welcome to grade book for %s\n", getCourseName());
    }
    
    public void determineClassAverage(){
        Scanner input = new Scanner(System.in);
        
        int total, gradeCounter, grade;
        double average;
        
        total = 0;
        gradeCounter = 0;
        System.out.print("Enter a grade or -1 to exit: ");
        grade = input.nextInt();
        while(grade != -1){
            gradeCounter += 1;
            total += grade;
            System.out.print("Enter a grade or -1 to exit: ");
            grade = input.nextInt();
            
            
        }
        
        if(gradeCounter != 0){
        average = (double) total / gradeCounter;  // note that integer division results to integer.
        
        System.out.printf("\nThe total of %d grades is: %d%n", gradeCounter, total);
        System.out.printf("The class average is: %f%n", average);
        }
        else{
            System.out.printf("No grades were entered \n");
        }
    }
    
}
