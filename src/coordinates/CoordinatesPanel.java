package coordinates;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class CoordinatesPanel extends JPanel {
	
	private int x,y;
	private final int SIZE = 5;
	public CoordinatesPanel() {
		addMouseListener(new CoordinatesListener());
		
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 400));
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		page.setColor(Color.green);
		page.fillOval(x, y, SIZE, SIZE);
		page.drawString("Coordinates: (" + x + ", " + y + ")", 260, 380);
	}
	
	private class CoordinatesListener implements MouseListener {
		@Override
		public void mousePressed(MouseEvent e) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	
		@Override
		public void mouseClicked(MouseEvent e) {}
	
		@Override
		public void mouseReleased(MouseEvent e) {}
	
		@Override
		public void mouseEntered(MouseEvent e) {}
	
		@Override
		public void mouseExited(MouseEvent e) {}
}
}
	
