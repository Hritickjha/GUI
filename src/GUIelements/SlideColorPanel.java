package GUIelements;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SlideColorPanel extends JPanel {

	private JPanel controls,colorpanel;
	private JSlider rSlider, gSlider, bSlider;
	   private JLabel rLabel, gLabel, bLabel;

	   //-----------------------------------------------------------------
	   //  Sets up the sliders and their labels, aligning them along
	   //  their left edge using a box layout.
	   //-----------------------------------------------------------------
	   public SlideColorPanel()
	   {
	      rSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	      rSlider.setMajorTickSpacing(50);
	      rSlider.setMinorTickSpacing(10);
	      rSlider.setPaintTicks(true);
	      rSlider.setPaintLabels(true);
	      rSlider.setAlignmentX(Component.LEFT_ALIGNMENT);		
	      gSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	      gSlider.setMajorTickSpacing(50);
	      gSlider.setMinorTickSpacing(10);
	      gSlider.setPaintTicks(true);
	      gSlider.setPaintLabels(true);
	      gSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

	      bSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	      bSlider.setMajorTickSpacing(50);
	      bSlider.setMinorTickSpacing(10);
	      bSlider.setPaintTicks(true);
	      bSlider.setPaintLabels(true);
	      bSlider.setAlignmentX(Component.LEFT_ALIGNMENT);

	      SliderListener listener = new SliderListener();
	      rSlider.addChangeListener(listener);
	      gSlider.addChangeListener(listener);
	      bSlider.addChangeListener(listener);

	      rLabel = new JLabel("Red: 0");
	      rLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	      gLabel = new JLabel("Green: 0");
	      gLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	      bLabel = new JLabel("Blue: 0");
	      bLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

	      controls = new JPanel();
	      BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
	      controls.setLayout(layout);
	      controls.add(rLabel);
	      controls.add(rSlider);
	      controls.add(Box.createRigidArea(new Dimension (0, 20)));
	      controls.add(gLabel);
	      controls.add(gSlider);
	      controls.add(Box.createRigidArea(new Dimension (0, 20)));
	      controls.add(bLabel);
	      controls.add(bSlider);

	      colorpanel = new JPanel();
	      colorpanel.setPreferredSize(new Dimension(100, 100));
	      colorpanel.setBackground(new Color(0, 0, 0));
	      
	      add(controls);
	      add(colorpanel);
	   }

	   //*****************************************************************
	   //  Represents the listener for all three sliders.
	   //*****************************************************************
	   private class SliderListener implements ChangeListener
	   {
	      private int red, green, blue;
	      //--------------------------------------------------------------
	      //  Gets the value of each slider, then updates the labels and
	      //  the color panel.
	      //--------------------------------------------------------------
	      public void stateChanged(ChangeEvent event)
	      {
	         red = rSlider.getValue();
	         green = gSlider.getValue();
	         blue = bSlider.getValue();

	         rLabel.setText("Red: " + red);
	         gLabel.setText("Green: " + green);
	         bLabel.setText("Blue: " + blue);

	         colorpanel.setBackground(new Color(red, green, blue));
	      }
	   }
	}		
