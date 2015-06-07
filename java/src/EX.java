import java.util.Scanner;
class EX{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of terms to calculate for e^x: ");
                /*we want to calculate e^x = 1 + x/1! + x^2/2! + x^3/3! ... + x^x/n!
                * so we need three things:
                * 1. x (wc is d inputed no) power, from 1 to x
                * 2. factor from 1 to x
                * 3. the sum of 1 + the above(after division)
                */
                
                //this is d number, x
		int num = input.nextInt();
                
                //this is the initial sum
		double sum = 1;
                
                //this is d counter to keep track from 1 to x
		int c = 1;
                
                
		int pow, count, d, fact;

		System.out.print("1 +");

                // we are loopoing from c=1 to num wc is x
		while(c <= num){
                    //first is to find the power of c at each point, let's assume c is 3 here, 
                    // that would be power = 3^3 = 3 * 3 * 3
                    int temp_counter = 1;
                    int temp_power = 1; // since n^0=1
                    int temp_fact = 1; // multiplicative is 1
                    while(temp_counter <= c){
                        temp_power = temp_power * c;
                        temp_fact = temp_fact * temp_counter;
                        temp_counter++;
                    }
                    //System.out.printf("power of %d to itself: %d, factorial of %d: %d.%n", c,temp_power,c,temp_fact);
                    System.out.printf(c==num?"%d^%d/%d! ": "%d^%d/%d! + ", c,c,c);
                    sum = sum + (double)temp_power/temp_fact;
                    
                    {
                    //note that d next directive has been incorporated into d previous since they use almost d same logic,
                    //power is multiplying d number by itself while factorial is multiplying the number by all ints lesser than it
                    // eg 3^3=3*3*3, and 3!=1*2*3
                    // after we find the power of each c^c
                    // next is to find c!, wc is 1*2*3 assuming c is at 3
//                     temp_counter = 1;
//                    int temp_fact = 1; // multiplicative is 1
//                    while(temp_counter <= c){
//                        temp_fact = temp_fact * temp_counter;
//                        temp_counter++;
//                    }
                    //System.out.println("factorial of " + c + "is " + temp_fact);
                    }
                    c++;
		}
		System.out.printf("%nAnswer: %f%n", sum);

	}
}