import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameField extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int m, n;
	int x_coord;
	int y_coord;
	int array[][];
	public void load() {
 
		try {
			Scanner sc = new Scanner(new File("E://GameField.txt"));
			n = sc.nextInt();
			m = sc.nextInt();
			x_coord = sc.nextInt();
			y_coord = sc.nextInt();
			array = new int[m][n];
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					array[i][j] = sc.nextInt();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Left() {
		if (array[y_coord][x_coord - 1] != 1) {
			x_coord--;
		}
		repaint();
	}
	public void Right() {
		if (array[y_coord][x_coord + 1] != 1) {
			x_coord++;
		}
		repaint();
	}
	public void Up() {
		if (array[y_coord - 1][x_coord] != 1) {
			y_coord--;
		}
		repaint();
	}
	public void Down() {
		if (array[y_coord + 1][x_coord] != 1) {
			y_coord++;
		}
		repaint();
	}

	public void paint(Graphics g) {
		int x = 0, y = 0;

		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == 0) {
					Color whiteColor = new Color(255, 255, 255);
					g.setColor(whiteColor);
					g.fillRect(x, y, 30, 30);
				}
				
				if (array[i][j] == 1) {
					Color blackColor = new Color(0, 0, 0);
					g.setColor(blackColor);
					g.fillRect(x, y, 30, 30);
				}
				
				x += 30;
			}
			
			x = 0;
			y += 30;
		}
		Color greenColor = new Color(0, 255, 0);
		g.setColor(greenColor);
		g.fillRect(x_coord * 30, y_coord * 30, 30, 30);
		
	}
}