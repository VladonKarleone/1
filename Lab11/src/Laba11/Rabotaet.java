package Laba11;
//import Laba11.Note;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rabotaet {
	Metod Laboratorka = new Metod();
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
					Rabotaet window = new Rabotaet();
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
	public Rabotaet() {
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
		Add.setBounds(555, 119, 128, 22);
		frame.getContentPane().add(Add);
		Add.setColumns(10);
		
		JTextArea Spisokk = new JTextArea();
		Spisokk.setBounds(10, 11, 535, 169);
		frame.getContentPane().add(Spisokk);
		
		Search = new JTextField();
		Search.setBounds(555, 49, 128, 22);
		frame.getContentPane().add(Search);
		Search.setColumns(10);
		
		Delete = new JTextField();
		Delete.setColumns(10);
		Delete.setBounds(555, 188, 128, 22);
		frame.getContentPane().add(Delete);
		
		// добавление элемента и вывод списка
		JButton btnAdd = new JButton("Addition");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Add.getText();
				Laboratorka.AddToSpisok(str);
				Spisokk.setText(Laboratorka.OutSpisok());
			}
		});
		btnAdd.setBounds(555, 82, 128, 36);
		frame.getContentPane().add(btnAdd);

		
		// поиск по значению
		JButton btnSearch = new JButton("Searching");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Search.getText();
				if(Laboratorka.Search(str)) {
					Spisokk.setText("Такой элемент есть");
				} else {
					Spisokk.setText("Такого элемента нету");
				}
			}
		});
		btnSearch.setBounds(555, 11, 128, 38);
		frame.getContentPane().add(btnSearch);


		// удаление элемента и вывод списка
		JButton btnDelete = new JButton("Deleting");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = Delete.getText();
				Laboratorka.DeletElement (str);
				Spisokk.setText(Laboratorka.OutSpisok());	
			}
		});
		btnDelete.setBounds(555, 152, 128, 36);
		frame.getContentPane().add(btnDelete);
		
		// вывод списка
		JButton btnOutlisthead = new JButton("OutSpisok");
		btnOutlisthead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spisokk.setText(Laboratorka.OutSpisok());
			}
		});
		btnOutlisthead.setBounds(10, 191, 535, 25);
		frame.getContentPane().add(btnOutlisthead);
		
		
	}
}
