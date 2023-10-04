package leftnright;
import java.awt.event.*;
public abstract class RightListener implements ActionListener {
	
	public RightListener() {
		
	}
	public void actionPerfprmed(ActionEvent e) {
	LeftRightPanel.label.setText("RIGHT");
}
	
}
