import javax.swing.JOptionPane;
public class Power{
	public static void main(String[] args) {
		try{
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
			int pow = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a power to raise to: "));
			int ans = num;
			int c = 2;
			while(c <= pow){
				c++;
				ans *= num;				
			}
			JOptionPane.showMessageDialog(null, String.format("%d raised to power %d is: %d", num, pow, ans));
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}