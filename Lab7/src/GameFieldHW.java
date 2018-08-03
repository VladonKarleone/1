import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GameFieldHW extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Level = 1;
	int m, n;
	int x_coord;
	int y_coord;
	int array[][];
	//Load Level 1
	public void load_Level_1() {
 
		try {
			Scanner sc = new Scanner(new File("E://GF1.txt"));
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
		repaint();
		
	}
	//Load Level 2
	public void load_Level_2() {
		 
		try {
			Scanner sc = new Scanner(new File("E://GF2.txt"));
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
		repaint();
	}
	//Load Level 3
	public void load_Level_3() {
		 
		try {
			Scanner sc = new Scanner(new File("E://GF38.txt"));
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
		repaint();
	}
	//Load Finish
	public void load_Finish() {
		try {
			Scanner sc = new Scanner(new File("E://Finish.txt"));
			n = sc.nextInt();
			m = sc.nextInt();
			array = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) { 
					array[i][j] = sc.nextInt() ;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		repaint();
	}
	
	public void Left() {
		if (array[y_coord][x_coord - 1] != 1) {
			x_coord--;
			 if (array[y_coord][x_coord] == 2) {
				switch (Level) {
				case 1:
					Level++;
					load_Level_2();
					break;
				case 2:
					Level++;
					load_Level_3();
					break;
				case 3:
					Level++;
					load_Finish();
					break;
				}
			}
		}
		repaint();
	}
	public void Right() {
		if (array[y_coord][x_coord + 1] != 1) {
			x_coord++;
			if (array[y_coord][x_coord] == 2) {
			 	switch (Level) {
				case 1:
					Level++;
					load_Level_2();
					break;
				case 2:
					Level++;
					load_Level_3();
					break;
				case 3:
					Level++;
					load_Finish();
					break;
				}
			}
		}
		repaint();
	}
	public void Up() {
		if (array[y_coord - 1][x_coord] != 1) {
			y_coord--;
			if (array[y_coord][x_coord] == 2) {
				switch (Level) {
				case 1:
					Level++;
					load_Level_2();
					break;
				case 2:
					Level++;
					load_Level_3();
					break;
				case 3:
					Level++;
					load_Finish();
					break;
				}
			}
		}
		repaint();
	}
	public void Down() {
		if (array[y_coord + 1][x_coord] != 1) {
			y_coord++;
			if (array[y_coord][x_coord] == 2) {
				switch (Level) {
				case 1:
					Level++;
					load_Level_2();
					break;
				case 2:
					Level++;
					load_Level_3();
					break;
				case 3:
					Level++;
					load_Finish();
					break;
				}
			}
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
					g.fillRect(x, y, 12, 12);
				}
				
				if (array[i][j] == 1) {
					Color blackColor = new Color(0, 0, 0);
					g.setColor(blackColor);
					g.fillRect(x, y, 12, 12);
				}
				
				if (array[i][j] == 2) {
					Color yellowColor = new Color(255, 255, 0);
					g.setColor(yellowColor);
					g.fillRect(x, y, 12, 12);
				}
				
				x += 12;
			}
			
			x = 0;
			y += 12;
		}
		Color greenColor = new Color(0, 255, 0);
		g.setColor(greenColor);
		g.fillRect(x_coord * 12, y_coord * 12, 12, 12);
		
	} 
}           