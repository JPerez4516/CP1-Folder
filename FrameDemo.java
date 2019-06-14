
import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //Creates title of the frame. 
		//Creating a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates program 
		frame.setSize(400, 400); //Sets the width and heigth 
		Shapes r = new Shapes(); // Creating the Shapes Object
		frame.add(r);// adding r to the frame
		frame.setVisible(true); // Show frame
	}
}
