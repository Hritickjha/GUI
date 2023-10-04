package leftnright;

import java.awt.event.*;
public class leftListener  implements ActionListener{
	public leftListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		LeftRightPanel.label.setText("LEFT");
		
}
}