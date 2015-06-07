/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
public class Mystrey
{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer betwen 1 and 20 to draw a square from: ");
        int num = input.nextInt();
        if(num < 1 || num > 20)
            throw new Exception();
        //num = 5;
        int row = 1; 
        
        while(row <= num){
            int column = 1;
            while(column <= num){
                System.out.print("*");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}