import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class MMmouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;	
		g2.setColor(Color.black);
sss		Ellipse2D.Double circle2 = new Ellipse2D.Double(50, 50, 100, 100);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(250, 50, 100, 100);	
		g2.fill(circle);
		g2.fill(circle2);
		g2.fill(circle3);
}
}
