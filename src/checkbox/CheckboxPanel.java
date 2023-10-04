package checkbox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckboxPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label, sizeLabel;
	int fontSize;
	JCheckBox italic, bold;
	JTextField size;
	int style;
	
	public CheckboxPanel() {
		label = new JLabel("Say it with Style!");
		fontSize = 36;
		style = Font.PLAIN;
		label.setFont(new Font("Comic Sans", style, fontSize));
		
		italic = new JCheckBox("italic");
		bold = new JCheckBox("bold");
		sizeLabel = new JLabel("Set Size: ");
		size = new JTextField(3);

		StyleListener listener1 = new StyleListener();
		FieldListener listener2 = new FieldListener();
		
		italic.addItemListener(listener1);
		bold.addItemListener(listener1);
		size.addActionListener(listener2);
		
		add(label);
		add(italic);
		add(bold);
		add(sizeLabel);
		add(size);
		
		setPreferredSize(new Dimension(700, 100));
	}
	
	private class FieldListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String text = size.getText();
			fontSize = Integer.parseInt(text);
			label.setFont(new Font("Comic Sans", style, fontSize));
		}
	}
	
	private class StyleListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (bold.isSelected() && italic.isSelected()) {
				style = Font.BOLD | Font.ITALIC;
			} else if (bold.isSelected()) {
				style = Font.BOLD;
			} else if (italic.isSelected()) {
				style = Font.ITALIC;
			} else {
				style = Font.PLAIN;
			}
			
			label.setFont(new Font("Comic Sans", style, fontSize));;
		}
	}

}
	
