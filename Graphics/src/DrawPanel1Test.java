import javax.swing.JFrame;

public class DrawPanel1Test {
    
    public static void main(String[] args){
        DrawPanel1 panel = new DrawPanel1();
        
        JFrame app = new JFrame("Title");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.add(panel);
        app.setSize(500, 500);
        app.setVisible(true);
    }
}
