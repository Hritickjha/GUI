package coordinates;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Left or Right");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      CoordinatesPanel panel = new CoordinatesPanel();
	      
	      frame.add(panel);
	      frame.pack();
	      frame.setVisible(true);
	}

}
