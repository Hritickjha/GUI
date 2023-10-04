package GUIelements;
import javax.swing.*;

public class JukeBox {
	//-----------------------------------------------------------------
	   //  Creates and displays the controls for a juke box.
	   //-----------------------------------------------------------------
	   public static void main(String[] args)
	   {
	      JFrame frame = new JFrame("Java Juke Box");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      frame.getContentPane().add(new JukeBoxControls());

	      frame.pack();
	      frame.setVisible(true);
	   }

}
