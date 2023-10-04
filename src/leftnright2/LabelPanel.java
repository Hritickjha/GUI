package leftnright2;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ButtonUI;

public class LabelPanel extends JPanel {
public static JLabel label;
	
	public LabelPanel() {
		label = new JLabel(" ");
		
	     Buttonpanel panel = new Buttonpanel();
		
		add(label);
		add(panel);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(600,60));

}
}