import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class Lab3HW {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab3HW window = new Lab3HW();
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
	public Lab3HW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(121, 416, 112, 20);
		frame.getContentPane().add(spinner);
		

				
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 690, 394);
		frame.getContentPane().add(textArea);
		
		JButton btnHwlab = new JButton("HWLab2-10");
		btnHwlab.setBounds(10, 415, 89, 23);
		frame.getContentPane().add(btnHwlab);
		btnHwlab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 1, j;
				while (i <= (int)spinner.getValue()) {
					if (i % 2 == 0) {
						j = 1;
						while (j <= i) {
							s = s + Integer.toString(j) + ' ';
							j++;
						}
						s = s + "\n";
						} else {
							j = i;
							while (j >= 1) {
								s = s + Integer.toString(j) + ' ';
								j--;
							}
							s = s + "\n";
						}
					i++;
					}
				
				textArea.setText(s);
			}
		});
		

	}
}
