import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.GREEN);
		
		g.drawLine(10, 100, 300, 100);
		g.drawLine(300, 100, 300, 300);
		g.drawLine(300, 300, 10, 300);
		g.drawLine(10, 300, 10, 100);
		
		g.drawLine(1, 100, 150, 50);
		g.drawLine(150, 50, 309, 100);
		g.drawLine(309, 100, 1, 100);
		
		g.drawLine(160, 53, 160, 30);
		g.drawLine(160, 30, 180, 30);
		g.drawLine(180, 30, 180, 60);
		
		g.drawLine(75, 125, 75, 200);
		g.drawLine(75, 200, 105, 200);
		g.drawLine(105, 200, 105, 125);
		g.drawLine(105, 125, 75, 125);
		
		g.drawLine(115, 125, 115, 200);
		g.drawLine(115, 200, 145, 200);
		g.drawLine(145, 200, 145, 125);
		g.drawLine(145, 125, 115, 125);
		
		g.drawLine(210, 150, 290, 150);
		g.drawLine(290, 150, 290, 300);
		g.drawLine(290, 300, 210, 300);
		g.drawLine(210, 300, 210, 150);
		
		
		
		g.setColor(Color.RED);
		int x = 400, y = 600;
		int x2 = 300, y2 = 700;
		while(x <= y2) {
			g.drawLine(x, y, x2, y2);
			x += 20;
			y += 15;
			y2 -= 12;
		}
		
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
