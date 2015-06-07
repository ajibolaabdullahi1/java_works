
package com.abdullahi;
import javax.swing.JOptionPane;

/**
 *
 * @author abdullahi
 */
public class Dialog1 {
    public static void main(String[] args){
//        JOptionPane.showMessageDialog(null, "Welcome \n to \n Java");
//        JOptionPane.showConfirmDialog(null, "Hi!");
        String name = JOptionPane.showInputDialog("Enter yout name:");
        JOptionPane.showMessageDialog(null, String.format("Welcome %s", name), "title", J);
    }
}
