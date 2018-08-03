import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;


public class Pinguin extends JPanel {
	
	public void getEye(Graphics e, int x, int y, int w, int h, int r, int g, int b) {
		Color myColor = new Color(r, g, b);
		Color blackColor = new Color(0, 0, 0);
		e.setColor(myColor);
		e.fillOval(x, y, w, h);
		e.setColor(blackColor);
		e.drawOval(x - w / 2, y - h / 2, w * 2, h * 2);
		e.fillOval(x + w / 4, y + h / 4, w / 2, h / 2);
	}
	
	public void getHead(Graphics e, int x, int y, int w, int h) {
		Graphics2D e2D = (Graphics2D)e;
		Color blackColor = new Color(0, 0, 0);
		BasicStroke pen5 = new BasicStroke(5); //Толщина линии = 5
		e2D.setStroke(pen5);
		e.fillOval(x, y, w, h);
		e.setColor(blackColor);
		e.drawOval(x - w, y - h * 2, w * 6, h * 6);
		BasicStroke pen2 = new BasicStroke(2); //Толщина линии = 2
		e2D.setStroke(pen2);
		
	}
	
	public void getNeb(Graphics e, int x, int y, int w, int h) {
		
		Color yellowColor = new Color(255, 255, 0);
		e.setColor(yellowColor);
		e.fillOval(x + w / 2, y + h * 2, w * 3, h / 2);
	}
	
	public void getHair(Graphics e, int x, int y, int w, int h) {
		Color blackColor = new Color(0, 0, 0);
		e.setColor(blackColor);
		int i = 1, n = 13;
		while (i < n) {
			e.drawLine(x - 2, y - h, x - 2, y - h * 2);
			i++;
			x += 2;
			y -= 1;
		}
		while (i < n * 2) {
			e.drawLine(x - 2, y - h, x - 2, y - h * 2 + 1);
			i++;
			x += 2;
			y += 1;
		}
		
	}  
	
	public void getBody(Graphics e, int x, int y, int w, int h) {
		Graphics2D e2D = (Graphics2D)e;
		Color blackColor = new Color(0, 0, 0);
		BasicStroke pen5 = new BasicStroke(5); //Толщина линии = 5
		e2D.setStroke(pen5);
		e.setColor(blackColor);
		e.drawOval(x - w, y + h * 4, w * 6, h * 10);
		BasicStroke pen2 = new BasicStroke(2); //Толщина линии = 2
		e2D.setStroke(pen2);
	}
	
	public void getWings(Graphics e, int x, int y, int w, int h) {
		Graphics2D e2D = (Graphics2D)e;
		Color blackColor = new Color(0, 0, 0);
		BasicStroke pen10 = new BasicStroke(10); //Толщина линии = 10
		e2D.setStroke(pen10);
		e.setColor(blackColor);
		e.drawOval(x - w * 6, y + h * 5, w * 6, h);
		e.drawOval(x + w * 4, y + h * 5, w * 6, h);
		BasicStroke pen2 = new BasicStroke(2); //Толщина линии = 2
		e2D.setStroke(pen2);
	}
	

	
	public void getLegs(Graphics e, int x, int y, int w, int h) {
		Graphics2D e2D = (Graphics2D)e;
		Color yellowColor = new Color(255, 255, 0);
		BasicStroke pen5 = new BasicStroke(5); //Толщина линии = 5
		e2D.setStroke(pen5);
		e.setColor(yellowColor);
		e.drawLine(x, y + h * 13, x - w / 2, y + h * 15);
		e.drawLine(x - w / 2, y + h * 15, x + w / 5, y + h * 14);
		e.drawLine(x + w / 5, y + h * 14, x + w / 4, y + h * 16);
		e.drawLine(x + w / 4, y + h * 16, x + w / 2, y + h * 14);
		e.drawLine(x + w / 2, y + h * 14, x + w, y + h * 15);
		e.drawLine(x + w, y + h * 15, x + w, y + h * 14);
		
		e.drawLine(x + w * 3, y + h * 14, x + w * 3, y + h * 15);
		e.drawLine(x + w * 3, y + h * 15, x + w * 7 / 2, y + h * 14);
		e.drawLine(x + w * 7 / 2, y + h * 14, x + w * 4, y + h * 16);
		e.drawLine(x + w * 4, y + h * 16, x + w * 10 / 3, y + h * 14);
		e.drawLine( x + w * 10 / 3, y + h * 14, x + w * 5, y + h * 15);
	}
	public void getSnow(Graphics e, int x, int y, int w, int h) {
		Color SnowColor = new Color(100, 186, 253);
		e.setColor(SnowColor);
		e.fillOval(x, y, w, h);
		}
	
	public void getSun(Graphics e, int x, int y, int w, int h) {
		Color yellowColor = new Color(255, 255, 0);
		e.setColor(yellowColor);
		e.fillOval(x, y, w, h);
		int i = 0, n = 10;
	}
	
	public void getBird(Graphics e, int x, int y) {
		Color blackColor = new Color(0, 0, 0);
		e.setColor(blackColor);
		e.drawLine(x, y, x + 3, y - 5);
		e.drawLine(x + 3, y - 5, x + 6, y);
		e.drawLine(x + 6, y, x + 9, y - 5);
		e.drawLine(x + 9, y - 5, x + 12, y);
	}
	
	public void getLake(Graphics e, int x, int y) {
		Color blueColor = new Color(0, 0, 100);
		e.setColor(blueColor);
		e.fillOval(x, y, 400, 200);
	}
	
	public void getFish(Graphics e, int x, int y, int r, int g, int b) {
		Graphics2D e2D = (Graphics2D)e;
		BasicStroke pen5 = new BasicStroke(5); //Толщина линии = 5
		e2D.setStroke(pen5);
		Color userColor = new Color(r, g, b);
		Color blackColor = new Color(0, 0, 0);
		e.setColor(userColor);
		e.fillOval(x, y, 40, 10);
		e.drawLine(x, y + 3, x - 5, y - 3);
		e.drawLine(x - 5, y - 3, x - 5, y + 10);
		e.drawLine(x - 5, y + 10, x, y + 3);
		e.drawLine(x + 17, y, x + 20, y - 3);
		e.drawLine(x + 20, y - 3, x + 23, y);
		e.setColor(blackColor);
		e.fillOval(x + 35, y + 3, 2, 2);
	}
	
	public void paint(Graphics g) {
		int x = 200, y = 260, h = 10, w = 10, n = 1000, i = 0, xs = 750, ys = 100, ws = 100, hs = 100;
		Color SnowColor = new Color(100, 186, 253);
		g.setColor(SnowColor);
		g.fillRect(0, 400, 1366, 468);
		getSun(g, xs, ys, ws, hs);
		getBird(g, 50, 50);
		getBird(g, 510, 150);
		getBird(g, 150, 10);
		getBird(g, 540, 250);
		getBird(g, 650, 350);
		getBird(g, 1000, 300);
		getBird(g, 1500, 111);
		getBird(g, 1111, 111);
		getHead(g, x, y, w, h);
		getEye(g, x, y, w, h, 55, 255, 1);
		getEye(g, x + h * 3, y, w, h, 55, 255, 1);
		getNeb(g, x, y, w, h);
		getHair(g, x, y, w, h);
		getBody(g, x, y, w, h);
		getWings(g, x, y, w, h);
		getLegs(g, x, y, w, h);
		getLake(g, 900, 500);
		getFish(g, 1000, 600, 255, 255, 0);
		getFish(g, 1240, 590, 255, 255, 0);
		getFish(g, 1101, 640, 255, 255, 0);
		getFish(g, 1150, 650, 255, 255, 0);
		getFish(g, 1190, 600, 255, 255, 0);
		getFish(g, 1009, 620, 255, 255, 0);
		getFish(g, 1050, 550, 255, 255, 0);
		getFish(g, 1100, 600, 255, 255, 0);
		
		while (i < n) {
			int x1, y1, w1 = 3, h1 = 3;
			final Random random = new Random();
			x1 = random.nextInt(1366);
			y1 = random.nextInt(768);
			getSnow(g, x1, y1, w1, h1);
			i++;
		}
		
		}
}