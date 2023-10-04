package combobox;

import javax.swing.JFrame;
public class MAIn {
	public static void main(String[] args) {
		JFrame frame = new
	JFrame("countries and Capitals");
		      comboPanel panel = new
		comboPanel();
		      
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			frame.add(panel);
			frame.pack();
			frame.setVisible(true);
	}
}
