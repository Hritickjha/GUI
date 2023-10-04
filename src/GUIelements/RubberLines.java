package GUIelements;
import javax.swing.JFrame;
public class RubberLines {
	   //-----------------------------------------------------------------
	   //  Creates and displays the application frame.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Rubber Lines");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new RubberLinespanel());

	      frame.pack();
	      frame.setVisible(true);
	   }
	}
