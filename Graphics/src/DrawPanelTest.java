import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args){
        
        // create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();
        
        // create a frame to hold the panel
        JFrame app = new JFrame("My Application.");
        
        // set the frame to exit when it is closed
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(panel);  // add the panel to the frame
        app.setSize(250, 250);  // set the size of the frame
        app.setVisible(true);  // make the frame visible
                
    }
}
