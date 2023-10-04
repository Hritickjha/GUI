package checkbox;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CheckboxPanel panel = new CheckboxPanel();
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
