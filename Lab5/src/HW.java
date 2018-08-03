import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class HW {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HW window = new HW();
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
	public HW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 */
	double sum = 1;
	double primer(double a, int b) {
		
		if (b > 0) {		
			sum += Math.pow(a, b);
			
			primer(a, b - 1);
			b--;
			//System.out.println(sum);
		}

		return sum;
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 0, 397, 222);
		frame.getContentPane().add(textArea);
		
		JButton btnAnswer = new JButton("Answer");
		btnAnswer.setBounds(20, 227, 89, 23);
		frame.getContentPane().add(btnAnswer);
		
		JTextArea txtrX = new JTextArea();
		txtrX.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 x = (-1;1)");
		txtrX.setBounds(119, 233, 108, 17);
		frame.getContentPane().add(txtrX);
		
		JTextArea txtrN = new JTextArea();
		txtrN.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 n");
		txtrN.setBounds(238, 233, 108, 17);
		frame.getContentPane().add(txtrN);
		btnAnswer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String res = "";
				double x = Double.parseDouble(txtrX.getText());
				int n = Integer.parseInt(txtrN.getText());
				//System.out.print(res);
				//primer(x, n);
				sum = 1;
				res = String.valueOf(primer(x, n));
				textArea.setText(res);
			}
		});
		
		
	}
}
