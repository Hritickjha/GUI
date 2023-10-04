package square;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.transform.Result;

public class SquarePanel extends JPanel{
	private JLabel promptLabel, resultLabel, result;
	private JTextField input;
	private ResultPanel panel1;
	private ButtonPanel panel2;
	private JButton button;
	private String inputText;
	private int inputValue;
	
	public SquarePanel() {
		promptLabel = new JLabel("Enter a number: ");
		input = new JTextField(5);
		panel1 = new ResultPanel();
		panel2 = new ButtonPanel();
		
		input.addActionListener(new Listener());
		
		add(promptLabel);
		add(input);
		add(panel1);
		add(panel2);
		
		setPreferredSize(new Dimension(500,100));
	}
	
	private class ResultPanel extends JPanel {
		public ResultPanel() {
			resultLabel = new JLabel("Square of the number: ");
			result = new JLabel(" ");
			
			add(resultLabel);
			add(result);
			
			setPreferredSize(new Dimension(500,25));
		}
	}
	
	private class ButtonPanel extends JPanel {
		public ButtonPanel() {
			button = new JButton("Convert");
			
			button.addActionListener(new Listener());
			
			add(button);
			
			setPreferredSize(new Dimension(500,30));
		}
	}
	
	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			inputText = input.getText();
			
			try {
				inputValue = Integer.parseInt(inputText);
				result.setText("" + (int)Math.pow(inputValue,2));
			} 
			catch(NumberFormatException exception) {
				result.setText("Please enter an integer");
			}
		}	
	}
}
