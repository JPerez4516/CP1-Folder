import javax.swing.*;

public class DrawingFrame
{
    public static void main(String[] args){
	
        
        JFrame frame = new JFrame("Frame for Picture");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DrawingPicture picture = new DrawingPicture();
        frame.add(picture);
        
        frame.setVisible(true);
    }
}
