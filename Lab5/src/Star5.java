import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Star5 extends JPanel {
	public void paint(Graphics g) {
		Star(200, 200, 100, g, 4);
		
	}
	private void Star(int x, int y, int r, Graphics g, int d) {
		while (d > 0) {
			g.drawLine(x, y - r, x + r / 3, y - r / 3);
			g.drawLine(x + r / 3, y - r / 3, x + r, y - r / 3);
			g.drawLine(x + r, y - r / 3, x + 2 * r / 3, y + r / 4);
			g.drawLine(x + 2 * r / 3, y + r / 4, x + r , y + r);
			g.drawLine(x + r , y + r, x, y + 2 * r / 3);
			g.drawLine(x, y - r, x - r / 3, y - r / 3);
			g.drawLine(x - r / 3, y - r / 3, x - r, y - r / 3);
			g.drawLine(x - r, y - r / 3, x - 2 * r / 3, y + r / 4);
			g.drawLine(x - 2 * r / 3, y + r / 4, x - r , y + r);
			g.drawLine(x - r , y + r, x, y + 2 * r / 3);
			
			Star(x, y - r, r / 3, g, d - 1);
			Star(x + r, y - r / 3, r / 3, g, d - 1);
			Star(x + r , y + r, r / 3, g, d - 1);
			Star(x - r, y - r / 3, r / 3, g, d - 1);
			Star(x - r , y + r, r / 3, g, d - 1);
			d--;
		}

	}
}
