package leftnright2;
import javax.swing.*;

public class Main {
	public static void main(String[] args){
	      JFrame frame = new JFrame("Left OR Right");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	      LabelPanel panel = new LabelPanel();
	      
	      frame.add(panel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}
