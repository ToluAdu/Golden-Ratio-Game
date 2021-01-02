import java.awt.Graphics;   // import class Graphics
import javax.swing.*;       // import package javax.swing
// Tolu Adu - Ta480



public class Rectangle extends JPanel {
    
    private String height;
    private Double numheight;
    private Double numwidth;
    int width;
    
    
    public void init()
    {
        //Prompt the user to enter their desired height.
        //Convert height from a string to double.
        //Golden ratio calculation computes the width, which is rounded.
       height = JOptionPane.showInputDialog("Enter the height of the rectangle");
       numheight = Double.parseDouble(height);
       numwidth = numheight * (Math.sqrt(5)+1)/2;
       width = (int) Math.round(numwidth);
        
        
        
    }
    
    public void paintComponent(Graphics g)
    {
        init();
        super.paintComponent(g);
        
       
        
        
        // Draw the rectangles width 
       g.drawString("You entered a height of " + height + " pixels",20,20);
       g.drawString("The Golden Ratio width is " + width + " pixels",20,40);
       g.drawRect(20,60,width,0);
       
        
    }
    
    
    
 }