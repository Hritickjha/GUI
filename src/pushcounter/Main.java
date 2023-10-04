package pushcounter;
import java.awt.Component;

import javax.swing.*;

public class Main {
	public static <pushcounterpanel> void main(String[] args) {
		JFrame frame = new JFrame("push counter");
		
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	PushCounterpanel panel = new PushCounterpanel();
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	}

}
