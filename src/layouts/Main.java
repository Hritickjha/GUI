package layouts;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class Main {
	public static void main (String[] args) {
		JFrame frame = new JFrame("Layouts");
		JTabbedPane tab = new JTabbedPane();
		
		tab.addTab("Intro", new IntroPanel());
		tab.addTab("Flow", new Flowpanel());
		tab.addTab("Border", new BorderPanel());
		tab.addTab("Grid", new GridPanel());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(tab);
		frame.pack();
		frame.setVisible(true);

      }
}