package leftnright;

import java.awt.*;
import javax.swing.*;
public class LeftRightPanel extends JPanel{
	public JButton left;
	private JButton right;
	public static JLabel label;
	
	public LeftRightPanel() {
		left = new JButton("left");
		right = new JButton("right");
		left.addActionListener(new leftListener());
		right.addActionListener(new leftListener());
		
		label = new JLabel();
		
		add(left);
		add(right);
		add(label);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(600,40));
		
	}

}
