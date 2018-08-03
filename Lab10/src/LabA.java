import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class LabA {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabA window = new LabA();
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
	public LabA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 729, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 451, 229);
		frame.getContentPane().add(textArea);
		
		JTextArea Massive = new JTextArea();
		Massive.setBounds(10, 245, 451, 500);
		frame.getContentPane().add(Massive);
		
		JButton btnLaba = new JButton("LabA");
		btnLaba.setBounds(465, 10, 89, 23);
		btnLaba.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = textArea.getText();
				StringTokenizer st = new StringTokenizer(s, " ");
				StringTokenizer st2 = new StringTokenizer(s, " ");
				StringBuilder sb = new StringBuilder();
				String res = "";
//				int i = st.countTokens();
				int len = 0;
				while (st.hasMoreTokens()) {
					len++;
					st.nextToken();
				}
				
				int n = 0;
				String[] str = new String[len];
				int k;
				
				while (n < len) {
					str[n] = st2.nextToken();
					n++;
				}
				int[] array = Arrays.asList(str).stream().mapToInt(Integer::parseInt).toArray();
				
				for (int g = 0; g < n; g++) {
					res = res + Arrays.toString(array);
					for (int j = 0; j < n - 1; j++) {
							if (array[j] > array[j + 1]) {
								k = array[j];
								array[j] = array[j + 1];
								array[j + 1] = k;	
								}
						}				
					res += "\n";
				}

				Massive.setText(res);
			}

		});
		frame.getContentPane().add(btnLaba);
		
	}
}
