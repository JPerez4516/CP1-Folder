import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class Shapes extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;//Importing graphics 3d 

		Rectangle box = new Rectangle(5, 10, 50, 30);//creating a box/rectangle 		//at x:5 y:10 width:20 height:30
		g2.draw(box);//draw a rectangle

		g2.setColor(Color.blue);//Sets the color to blue

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 200, 200);
		//making an ellipse as a circle
		g2.fill(circle);//fill in the circle/ellipse

	}
}
