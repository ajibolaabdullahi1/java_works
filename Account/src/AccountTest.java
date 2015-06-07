
import classes.Account;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class AccountTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account acc1 = new Account(60);
        Account acc2 = new Account(-7);
        
//        System.out.printf("Initial acc1 balance is: %.2f%n" , acc1.getBalance());
//        System.out.printf("Initial acc2 balance is: %.2f%n" , acc2.getBalance());
//        
//        System.out.print("Enter a new deposit amount for acc1: ");
//        double amount;
//        amount = input.nextDouble();
//        acc1.deposit(amount);
//        
//        System.out.print("Enter a new deposit amount for acc2: ");
//        
//        amount = input.nextDouble();
//        acc2.deposit(amount);
//                
//        System.out.printf("New acc1 balance is: %.2f%n" , acc1.getBalance());
//        System.out.printf("New acc2 balance is: %.2f%n" , acc2.getBalance());
        
        JOptionPane.showMessageDialog(null, String.format("Initial acc1 balance is: %.2f%n" , acc1.getBalance()));
        JOptionPane.showMessageDialog(null,String.format("Initial acc2 balance is: %.2f%n" , acc2.getBalance()));
        
        double amount = Double.parseDouble(JOptionPane.showInputDialog(null,String.format("Enter a new deposit amount for acc1: ")));
        acc1.deposit(amount);
        
        amount = Double.parseDouble(JOptionPane.showInputDialog(null,String.format("Enter a new deposit amount for acc2: ")));
        acc2.deposit(amount);
        
        JOptionPane.showMessageDialog(null, String.format("New balance for acc1 is: %.2f", acc1.getBalance()));
        JOptionPane.showMessageDialog(null, String.format("New balance for acc2 is: %.2f", acc2.getBalance()));
        
        amount = Double.parseDouble(JOptionPane.showInputDialog(null,String.format("Enter a debit amount for acc1: ")));
        acc1.debit(amount);
        
        amount = Double.parseDouble(JOptionPane.showInputDialog(null,String.format("Enter a debit amount for acc2: ")));
        acc2.debit(amount);
        
        
        
        
    }
}
