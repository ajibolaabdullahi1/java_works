import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;

public class DrawPanel1 extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
//        int width = 0;
//        int height = getHeight();
//        
//        int i = 15;
//        int j = 1;
//        while(i >= 1 && j <= 15){
//            g.drawLine(0, 0, width, height );
//            
//            i = i-1;
//            j = j+1;
//            
//            height = height - ((i/15) );
//            width =  width + ((j/15) );
//        }
        
        
        g.drawLine(0, 0, getWidth(), getHeight());
    }
        
        
}
