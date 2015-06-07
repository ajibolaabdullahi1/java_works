package javaapplication2;
import javax.swing.JOptionPane;

public class Binary{
    public static void main(String[] args){
        /*
        *This program converts a binary number into decimal, e.g 11011 =
        * (1*2^0) + (1*2^1) + (0*2^2) + (1*2^3) + (1*2^4)
        * So the 3 major tasks are to split the bits into 1 1, and find squares for each, and add them up
        */
        
        try{
            int binary = Integer.parseInt(JOptionPane.showInputDialog("Enter the binary number to convert to decimal: "));
            JOptionPane.showMessageDialog(null, String.format("The binary number inputed is: %d.", binary));
            
            //split the bits into individual bits starting from the rightmost.
            //at the beginning what is (on the) left is the number itself
            int left = binary;
            //each bit starting from the right
            int right;
            
            //a var to keep count of each bit on the right starting from 0
            int counter = 0;
            
            //the digit itself
            int digit = 0;
            
            //a var to hold the power
            int power;
            
            int counter1;
            
            while(left > 0){
                right = left % 10;
                left = left / 10;
                
                //throw error if d number isn't a 0 or 1
                if(right != 0 && right != 1){
                    throw new NumberFormatException();
                }
                
                System.out.println("left is " + left + ", right is " + right);
                
                //we start from 2 since 2^1 is still 2
                counter1 = 2;
                // handle 2^0=1 and 2^1=2;
                power = counter==0? 1:2;
                while(counter1 <= counter){
                    power = power * 2;
                    
                    counter1++;
                }
                
                System.out.printf("%n + %d*2^%d + %n", right, counter);
                digit =digit + right * power;
                
                // keeps count of each bit
                counter++;                
            }
            
            
            JOptionPane.showMessageDialog(null, String.format("The decimal equivalent of %d is %d: ", binary, digit));
            System.out.printf("%nThe total no of bits is: %d%n", counter);
        }
        catch(Exception e){
            System.err.printf("An error occured \n");
        }
        finally{
            System.out.printf("I will always be executed. \n");
        }
        
        
                
    }
}