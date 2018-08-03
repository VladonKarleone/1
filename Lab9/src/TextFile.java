import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextFile {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFile window = new TextFile();
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
	public TextFile() {
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
		
		JButton btnChange = new JButton("Send");
		btnChange.setBounds(0, 675, 1366, 30);
		frame.getContentPane().add(btnChange);
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				
				try {
		            Scanner sc = new Scanner(new File("E:\\Lab9.txt"));
		            while (sc.hasNextLine()) {
		            	s = s + sc.nextLine();
		            }
		            sc.close();
		        }
		        catch(IOException ex){
		             
		            System.out.println(ex.getMessage());
		        }
				textArea.setText(s);
				String find = " s";
				char[] f = find.toCharArray();
				int n = 0;
				int k = 0;
				StringTokenizer st = new StringTokenizer(s, " ");			
				while (st.hasMoreTokens()) {
					char[] stMas = st.nextToken().toCharArray();
					int i = 0;
					n = 0;
					if (stMas.length >= find.length()) {
						while (i < find.length()) {
							if (stMas[i] == f[i] || stMas[0] == 's') {
								n++;
							}
							i++;
						}
					}
					if (n == find.length()) {
						k++;
					}
				}
					//System.out.println(n);
				
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Lab9.html")))
		        {
		            bw.write("<html>");
		            bw.write("<head>");
		            bw.write("<title>");
		            bw.write("Lab9");
		            bw.write("</title>");
		            bw.write("</head>");
		            bw.write("<body>");
		            bw.write("<b> <p align = center>");
		            bw.write("Лабораторная работа № 9");
		            bw.write("</b><br>");
		            bw.write("Вариант A");
		            bw.write("<br>");
		            bw.write("Выполнил студент группы ИВТВМбд-11 ");
		            bw.write("<b><i>");
		            bw.write("Осипов В. Ю.");
		            bw.write("</i></b><br>");
		            bw.write("Файл: ");
		            bw.write("<b>");
		            bw.write("Lab9.txt");
		            bw.write("</b><br>");
		            bw.write("Количество найденных слов: ");
		            bw.write("<b>");
		            bw.write(String.valueOf(k));
		            bw.write("</b></p>");
		            bw.write("</body>");
		            bw.write("</html>");
		        }
		        catch(IOException ex){
		              
		            System.out.println(ex.getMessage());
		        } 
			}
		});
		
	}
}

