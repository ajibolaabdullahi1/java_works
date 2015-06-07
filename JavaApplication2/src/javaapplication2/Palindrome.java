
package javaapplication2;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 5-digit number: ");
        int num = input.nextInt();
        
        if(num > 99999 || num < 10000){
            System.out.println("Please, enter a 5-digit number");
        }
        else{
            int d1,d2,d3,d4,d5;
            d5 = (num / 1) % 10;
            d4 = (num / 10) % 10;
            d3 = (num / 100) % 10;
            d2 = (num / 1000) % 10;
            d1 = (num / 10000) % 10;
            
            System.out.printf("d1:%d, d2:%d, d3:%d, d4:%d, d5:%d \n", d1,d2,d3,d4,d5);
            
            if(d5 == d1 && d4 == d2){
                System.out.printf("%d is a palindrome \n", num);
            }
            else{
                System.out.printf("%d is not a palindrome \n", num);
            }
            
        }
    }
    
    
}
