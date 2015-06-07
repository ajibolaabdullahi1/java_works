import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Account myAcc = new Account();
        
        System.out.printf("Initial name is: %s%n%n", myAcc.getName());
        
        String name;
        System.out.print("Enter a name: ");
        name = input.nextLine();
        
        myAcc.setName(name);
        System.out.printf("Account Name is: %s%n%n", myAcc.getName());
        
    }
}
