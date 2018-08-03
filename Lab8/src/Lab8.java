import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Lab8 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab8 window = new Lab8();
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
	public Lab8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 1366, 675);
		frame.getContentPane().add(textArea);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(0, 675, 1366, 30);
		frame.getContentPane().add(btnChange);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				String s = "";
				StringBuilder sb = new StringBuilder();
				try(BufferedReader br = new BufferedReader (new FileReader("E:\\Lab8EnterData.txt")))
		        {
		            while((s=br.readLine())!=null){
		                 sb.append(s + "\r\n");
		               
		            }
		        }
		        catch(IOException ex){
		             
		            System.out.println(ex.getMessage());
		        }
				textArea.setText(sb.toString());
				for  (int i = 0; i < sb.length() - 1; i++) {
					if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'a'||sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'a'|| sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'A' || sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'A') {
						sb.replace(i, i + 2, "*");
					}
				}
				


				try(BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Lab8ExitData.txt")))
		        {
		            bw.write(sb.toString());
		        }
		        catch(IOException ex){
		             
		            System.out.println(ex.getMessage());
		        } 
			}
		});
		
	}
}
