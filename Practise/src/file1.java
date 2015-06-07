import java.util.Scanner;

public class file1 {
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            
            int num1, num2;
            
            System.out.print("Enter the first number: ");
            num1 = input.nextInt();
         
            System.out.print("Enter the second number: ");
            num2 = input.nextInt();
            
            if(num1 > num2)
                System.out.println(num1 + " is greater than " + num2);
            if(num1 < num2)
                System.out.println(num1 + " is less than " + num2);
            if(num1 >= num2)
                System.out.println(num1 + " is greater than or equal to " + num2);
            if(num1 <= num2)
                System.out.println(num1 + " is less than or equal to " + num2);
            if(num1 == num2)
                System.out.println(num1 + " is equal to " + num2);
            if(num1 != num2)
                System.out.println(num1 + " is not equal to " + num2);
	}
}