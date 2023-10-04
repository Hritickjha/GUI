package leftnright2;
import java.awt.Button;
import java.awt.event.*;

public class buttonListener implements ActionListener{
	
	public buttonListener() {
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() ==  Buttonpanel.left) {
			LabelPanel.label.setText("LEFT");
		}
		else {
			LabelPanel.label.setText("RIGHT");
		}  
	}

}
