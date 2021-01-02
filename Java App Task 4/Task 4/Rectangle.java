import java.awt.Graphics;   // import class Graphics
import javax.swing.*;       // import package javax.swing
import java.awt.*;
// Tolu Adu - Ta480

public class Rectangle extends JPanel {
    
    private String inputheight;
    private Double numheight;
    private Double numwidth;
    int width;
    int height;
    
    
    public void init()
    {
       //Prompt the user to enter their desired height.
        //Convert height from a string to double.
        //Golden ratio calculation computes the width, which is rounded.
        
        inputheight = JOptionPane.showInputDialog("Enter the height of the rectangle");
       numheight = Double.parseDouble(inputheight);
       numwidth = numheight * (Math.sqrt(5)+1)/2;
       width = (int) Math.round(numwidth);
       height = (int) Math.round(numheight);
        
        
        
    }
    
    public void paintComponent(Graphics g)
    {
        init();
        super.paintComponent(g);
       g.drawString("You entered a height of " + inputheight + " pixels",20,20);
       g.drawString("The Golden Ratio width is " + width + " pixels",20,40);
       
       // Draw the Golden rectangle as well as other comparison rectangles
       g.setColor( new Color(255,0,0));
       g.fillRect( 20,60,width,height);
       g.drawRect(20,60,width,height);
       
        g.setColor( new Color(0,128,0));
       g.drawRect(20,80 + height + 10,220,50);
       g.fillRect(20,80 + height + 10,220,50 );
       
        g.setColor( new Color(0,0,255));
       g.drawRect(20,80 + height + 50 + 50,180,110);
       g.fillRect(20,80 + height + 50 + 50,180,110);
       
        g.setColor( new Color(255,0,255));
       g.drawRect(20,80 + height + 50 + 50 +110 +30,100,30);
          g.fillRect(20,80 + height + 50 + 50 +110 +30,100,30);
       
       
       
       
       
        
    }
    
    
    
 }