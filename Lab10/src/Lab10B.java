import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lab10B {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab10B window = new Lab10B();
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
	public Lab10B() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 451, 229);
		frame.getContentPane().add(textArea);
		
		JTextArea Massive = new JTextArea();
		Massive.setBounds(10, 245, 451, 500);
		frame.getContentPane().add(Massive);
		
		JButton btnLab10B = new JButton("Lab10B");
		btnLab10B.setBounds(465, 10, 89, 23);
		btnLab10B.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = textArea.getText();
				StringTokenizer st = new StringTokenizer(s, "\n");
				StringTokenizer st2 = new StringTokenizer(s, "\n");
				String res = "";
				int len = 0;
				while (st.hasMoreTokens()) {
					len++;
					st.nextToken();
				}
				int n = 0;
				String[] str = new String[len];
				String k;
				
				while (n < len) {
					str[n] = st2.nextToken();
					n++;
				}
				
				for (int g = 0; g < n; g++) {
					res = res + Arrays.toString(str);
					for (int j = 0; j < n - 1; j++) {
						int result = str[j].compareTo(str[j + 1]);
						if (result > 0) {
							k = str[j];
							str[j] = str[j + 1];
							str[j + 1] = k;
							}
						}	
					
					res += "\n";
				}

				Massive.setText(res);
			}

		});
		frame.getContentPane().add(btnLab10B);
		
	}
}

