import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameHW {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHW window = new GameHW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameHW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GameFieldHW panel = new GameFieldHW();
		frame = new JFrame();
		frame.addKeyListener(new KeyAdapter() {
		//	@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					panel.Left();
					break;
				case KeyEvent.VK_RIGHT:
					panel.Right();
					break;
				case KeyEvent.VK_UP:
					panel.Up();
					break;
				case KeyEvent.VK_DOWN:
					panel.Down();
					break;
				}
			}	
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel.load_Level_1();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
	}

}

