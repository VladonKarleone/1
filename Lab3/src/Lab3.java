import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab3 {

	private JFrame frmWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab3 window = new Lab3();
					window.frmWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWindow = new JFrame();
		frmWindow.setTitle("Window");
		frmWindow.setBounds(100, 100, 450, 536);
		frmWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWindow.getContentPane().setLayout(null);
		
		final JSpinner spinner = new JSpinner();
		spinner.setToolTipText("");
		spinner.setBounds(198, 465, 127, 20);
		frmWindow.getContentPane().add(spinner);
		
		final JTextArea txtrText = new JTextArea();
		txtrText.setBounds(10, 11, 414, 401);
		frmWindow.getContentPane().add(txtrText);
		
		JButton btnDo = new JButton("Do");
		btnDo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 1, j = 1, a = (int)spinner.getValue() * 2;
				while (i <= (int)spinner.getValue()) {
					while (j <= a) {
						s = s + Integer.toString(j) + " ";
						j += 2;
					}
					s = s + "\n";
					i++;
					a++;
					j = i;
				}
				
				txtrText.setText(s);
			}
		});
		
		JButton btnLab = new JButton("Lab2.2");
		btnLab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 1, j = 1;
				while (i <= (int)spinner.getValue()) {
					while (j <= i) {
						s = s + Integer.toString(j) + " ";
						j++;
					}
					s = s + "\n";
					i++;
					j = 1;
				}
				
				txtrText.setText(s);
			}
		});
		
		JButton btnLab_1 = new JButton("Lab2.3");
		btnLab_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 1, j = 1, a = (int)spinner.getValue();
				while (i <= (int)spinner.getValue()) {
					while (j <= a) {
						s = s + Integer.toString(j) + " ";
						j++;
					}
					s = s + "\n";
					i++;
					a--;
					j = 1;
				}
				
				txtrText.setText(s);
			}
		});
		btnLab.setBounds(99, 464, 89, 23);
		frmWindow.getContentPane().add(btnLab);
		
		btnDo.setBounds(335, 464, 89, 23);
		frmWindow.getContentPane().add(btnDo);
		
		
		btnLab_1.setBounds(0, 464, 89, 23);
		frmWindow.getContentPane().add(btnLab_1);
		
		JButton btnLab_2 = new JButton("Lab2.4");
		btnLab_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				int i = 1, j = (int)spinner.getValue(), a = 1;
				while (i <= (int)spinner.getValue()) {
					while (j >= a) {
						s = s + Integer.toString(j) + " ";
						j--;
					}
					s = s + "\n";
					i++;
					j = (int)spinner.getValue();
					a++;
				}
				
				txtrText.setText(s);
			}
		});
		btnLab_2.setBounds(0, 423, 89, 23);
		frmWindow.getContentPane().add(btnLab_2);
		

		

	}
}