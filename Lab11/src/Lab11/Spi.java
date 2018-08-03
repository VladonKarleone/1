package Lab11;
import Lab11.Note;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Spi {
	Spisok Laboratorka = new Spisok();
	private JFrame frame;
	private JTextField Add;
	private JTextField Search;
	private JTextField Delete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spi window = new Spi();
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
	public Spi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 740, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Add = new JTextField();
		Add.setBounds(218, 284, 128, 22);
		frame.getContentPane().add(Add);
		Add.setColumns(10);
		
		JTextArea Spisokk = new JTextArea();
		Spisokk.setBounds(10, 11, 535, 169);
		frame.getContentPane().add(Spisokk);
		
		Search = new JTextField();
		Search.setBounds(10, 285, 116, 22);
		frame.getContentPane().add(Search);
		Search.setColumns(10);

		JTextArea Element = new JTextArea();
		Element.setBounds(555, 81, 57, 36);
		frame.getContentPane().add(Element);
		
		Delete = new JTextField();
		Delete.setColumns(10);
		Delete.setBounds(431, 284, 116, 22);
		frame.getContentPane().add(Delete);
		
		// добавление элемента и вывод списка
		JButton btnAdd = new JButton("Addition");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Add.getText();
				Laboratorka.addToSpisok(str);
				Spisokk.setText(Laboratorka.outSpisok());
			}
		});
		btnAdd.setBounds(218, 247, 128, 36);
		frame.getContentPane().add(btnAdd);
		
		// следующий элемент
		JButton btnView = new JButton("Next");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Element.getText();
				int i = Laboratorka.getIndexForElement(str);
				String sled = "";
				if (i == 0) {
					sled = Laboratorka.getByIndex(i);
					Element.setText(sled);
				}else
					Element.setText(Laboratorka.getByIndex(i));
			}
		});
		btnView.setBounds(555, 11, 57, 30);
		frame.getContentPane().add(btnView);
		
		// поиск по значению
		JButton btnSearch = new JButton("Searching");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Search.getText();
				if(Laboratorka.search(str)) {
					Spisokk.setText("Есть такой!");
				} else {
					Spisokk.setText("Нет такого");
				}
			}
		});
		btnSearch.setBounds(10, 247, 116, 38);
		frame.getContentPane().add(btnSearch);
		
		// предыдущий элемент
		JButton btnPrevel = new JButton("Prev");
		btnPrevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Element.getText();
				
				int i = Laboratorka.getIndexForElement(str);
				String pred = "";
				if (i == 0) {
					int f = Laboratorka.getMaxIndex();
					pred = Laboratorka.getByIndex(f-1);
					Element.setText(pred);
				}else
					Element.setText(Laboratorka.getByIndex(i-2));
			}
		});
		btnPrevel.setBounds(555, 150, 57, 30);
		frame.getContentPane().add(btnPrevel);

		// удаление элемента и вывод списка
		JButton btnDelete = new JButton("Deleting");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Delete.getText();
				Laboratorka.deletElement (str);
				Spisokk.setText(Laboratorka.outSpisok());	
			}
		});
		btnDelete.setBounds(431, 248, 116, 36);
		frame.getContentPane().add(btnDelete);
		
		// вывод списка
		JButton btnOutlisthead = new JButton("OutSpisokHead");
		btnOutlisthead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spisokk.setText(Laboratorka.outSpisok());
			}
		});
		btnOutlisthead.setBounds(10, 209, 535, 25);
		frame.getContentPane().add(btnOutlisthead);
		
		// вывод списка
		JButton btnOutlisttail = new JButton("OutSpisokTail");
		btnOutlisttail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spisokk.setText(Laboratorka.outSpisoktail());
			}
		});
		btnOutlisttail.setBounds(10, 182, 535, 25);
		frame.getContentPane().add(btnOutlisttail);
		
	}
}