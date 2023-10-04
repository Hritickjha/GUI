package square;
import javax.swing.*;

public class Main {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("square of Number");
		SquarePanel panel = new SquarePanel();
		
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
