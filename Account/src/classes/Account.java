
package classes;
import javax.swing.JOptionPane;

/**
 *
 * @author abdullahi
 */
public class Account {
    private double balance;    
    
    public Account(double balance){
        if(balance > 0.0)
            this.balance = balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void debit(double amount){
//        if(amount < balance){
//            JOptionPane.showMessageDialog(null, 111);
//            return;
//        }
//        
//            JOptionPane.showMessageDialog(null, 222);
        if(amount > balance){
            JOptionPane.showMessageDialog(null,String.format("Enter an amount within the range of your balance!"));
            return;
        }        
        balance = balance - amount;
        JOptionPane.showMessageDialog(null,String.format("Debited %.2f, new balance is %.2f", amount, getBalance()));
        
        
    }
    
    public double getBalance(){
        return balance;
    }
    
    
}
