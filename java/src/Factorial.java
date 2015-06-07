import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to find its factorial: ");
		int num = input.nextInt();
		int c = num;
		int fact = 1;

		while(c >= 1){
			fact = fact * c;
			c--;
		}

		System.out.printf("The factorial of %d is %d\n", num, fact);
	}
}