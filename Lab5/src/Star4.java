import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Star4 extends JPanel {
	public void paint(Graphics g) {
		Star4(200, 200, 50, g, 3);
		
	}
	private void Star4(int x, int y, int r, Graphics g, int d) {
		while (d > 0) {
			g.drawLine(x - r / 3, y - r / 3, x, y - r);
			g.drawLine(x, y - r, x + r / 3, y - r / 3);
			g.drawLine(x + r / 3, y - r / 3, x + r, y);
			g.drawLine(x + r, y, x + r / 3, y + r / 3);
			g.drawLine(x + r / 3, y + r / 3, x, y + r);
			g.drawLine(x, y + r, x - r / 3, y + r / 3);
			g.drawLine(x - r / 3, y + r / 3, x - r, y);
			g.drawLine(x - r, y, x - r / 3, y - r / 3);
			Star4(x, y - r, r / 2, g, d - 1);
			Star4(x + r, y, r / 2, g, d - 1);
			Star4(x, y + r, r / 2, g, d - 1);
			Star4(x - r, y, r / 2, g, d - 1);
			d--;
		}

	}
}
