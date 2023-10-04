package leftnright;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("left OR Right");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LeftRightPanel Panel = new LeftRightPanel();
		
		frame.add(Panel);
		frame.pack();
		frame.setVisible(true);
	}

}
