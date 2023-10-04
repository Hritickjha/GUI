package GUIelements;
 import javax.swing.JFrame;

import pushcounter.PushCounterpanel;
public class PushCounterExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PushCounterpanel panel = new PushCounterpanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}

}
