package layouts;

import java.awt.Color;
import java.awt.color.*;
import javax.swing.*;

public class IntroPanel extends JPanel {
	
	public IntroPanel() {
		JLabel label = new JLabel("This program demonstrate many layouts.");
		add(label);
		
		setBackground(Color.cyan);
	}

}
