package leftnright2;
import java.awt.*;
import javax.swing.*;

public class Buttonpanel extends JPanel {
	public static JButton left;
	public static JButton right;
	
	public Buttonpanel() {
		left = new JButton("Left");
		right = new JButton("Right");
		
		left.addActionListener(new buttonListener());
		right.addActionListener(new buttonListener());		
		
		add(left);
		add(right);
		
		setBackground(Color.blue);
		setPreferredSize(new Dimension(600,40));
	}
}

