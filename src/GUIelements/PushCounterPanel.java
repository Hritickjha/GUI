package GUIelements;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonListener;

import leftnright2.buttonListener;

public class PushCounterPanel extends JPanel {
	private int count;
	private JButton Push;
	private JLabel label;
	
	//-----------------------------------------------------------------
	   //  Constructor: Sets up the GUI.
	   //-----------------------------------------------------------------
	   public PushCounterPanel()
	   {
	      count = 0;

	      Push = new JButton("Push Me!");
	      Push.addActionListener(new buttonListener());
	      add(Push);
	      add(label);
	      setBackground(Color.cyan);
	      setPreferredSize(new Dimension(300, 40));
	   }

	   //*****************************************************************
	   //  Represents a listener for button push (action) events.
	   //*****************************************************************
	   private class ButtonListener implements ActionListener
	   {
	      //--------------------------------------------------------------
	      //  Updates the counter and label when the button is pushed.
	      //--------------------------------------------------------------
	      public void actionPerformed(ActionEvent event)
	      {
	         count++;
	         label.setText("Pushes: " + count);
	      }
	   }
}
