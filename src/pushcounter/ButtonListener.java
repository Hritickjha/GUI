package pushcounter;
import java.awt.event.*;

public class ButtonListener implements ActionListener {
	
	private int count;
	public ButtonListener() {
		count = 0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
	PushCounterpanel.label.setText("push Counter: " + count);
		
	}
}
