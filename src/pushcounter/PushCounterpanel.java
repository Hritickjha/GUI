package pushcounter;

import java.awt.*;
import javax.swing.*;

public class PushCounterpanel  extends JPanel{
	private JButton Button;
	public static JLabel label;
	
	public PushCounterpanel() {
		Button = new JButton("push me, senpai!");
		Button.addActionListener(new ButtonListener());
		
		label = new JLabel("push counter :");
		
		add(Button);
		add(label);
		
		setBackground(Color.lightGray);
		setPreferredSize(new Dimension(600,40));
	}

}
