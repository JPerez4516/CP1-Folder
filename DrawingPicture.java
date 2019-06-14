 /**
 * Loop Drawing is one of the most specific and detailed ways of showing loops in a diagram
 *
 * Jaime Perez
 * January 29,2019
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g.setColor(Color.GRAY);
        g.fillOval(0, 0, 250, 250);
        
        g.setColor(Color.ORANGE);
        g.fillArc(0,0,250,250,45,90);
        
        g.setColor(Color.WHITE);
        g.fillOval(25, 25, 200, 200 );
        
        
        g.setColor(Color.GRAY);
        int  x1[] = { 25, 80, 115, 115, 50 };
        int  y1[] = { 150, 125, 75, 150, 200 };
        Polygon p1 = new Polygon(x1, y1, 5);
        g.fillPolygon(p1);
        
        int  x2[] = { 225, 170, 135, 135, 225 };
        int  y2[] = { 150, 125, 75, 150, 200};
        Polygon p2 = new Polygon(x2, y2, 5);
        g.fillPolygon(p2);
        
        
        
        /*drawGrid(g2);*/
    }
    /*
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines`
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);*/
       
        }

