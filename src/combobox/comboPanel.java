package combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class comboPanel extends JPanel {
	JComboBox combobox;
	JLabel label;
	
	public void ComboPanel() {
		String[] countries = {"Nepal", "India", "Bhutan", "Pakistan", "China"};
		
		combobox = new JComboBox(countries);
		label = new JLabel("Capital: ");
		
		setBackground(Color.yellow);
		setPreferredSize(new Dimension(100000,800));
		
		add(combobox);
		add(label);
		
		combobox.addActionListener(new ComboListener());
	}
	
	private class ComboListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			switch (combobox.getSelectedIndex()) {
			case 0:
				label.setText("Capital: Kathmandu");
				break;
			case 1:
				label.setText("Capital: New Delhi");
				break;
			case 2:
				label.setText("Capital: Thimphu");
				break;
			case 3:
				label.setText("Capital: Islamabad");
				break;
			case 4:
				label.setText("Capital: Beijing");
			}
		}
	}
}

