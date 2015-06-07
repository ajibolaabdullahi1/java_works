
import java.util.Scanner;

public class EstimateE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer for an estimate of E: ");
        int num = input.nextInt();

        System.out.print("1 +");
        int c = 1, d;
        double est = 1.0;
        while (c <= num) {
            d = 1;
            int fact = 1;
            while (d <= c) {
                fact *= d;
                ++d;
            }
            est = est + (1 / (double) fact);
            System.out.printf(" 1/%d!(%d) + ", c, fact);
            c++;
        }
        System.out.println();
        System.out.printf("The estimate of E using %d is %f%n", num, est);
    }
}
