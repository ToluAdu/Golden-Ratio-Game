// Creating JFrame to display RectanglePanel
import javax.swing.JFrame;


public class RectangleTest

{
    
    
    
    public static void  main(String[] args)
    {
        
        Rectangle panel = new Rectangle();
        
        JFrame application = new JFrame();
        
        application.add(panel);
        application.setSize(600,500);
        application.setVisible(true);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
    }
    
    
    
 }