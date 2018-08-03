import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class OnoRabotaet {

	private JFrame frame;
	private JTextField Name;
	private JTextField Surname;
	private JTextField MiddleName;
	private JTextField Number;
	private JTextField DelNames;
	private JTextField SearchNames;
	ArrayList<Names> list = new ArrayList<Names>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnoRabotaet window = new OnoRabotaet();
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
	public OnoRabotaet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 960, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		Name = new JTextField();
		Name.setText("Name");
		Name.setBounds(647, 11, 183, 30);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Surname = new JTextField();
		Surname.setText("Surname");
		Surname.setColumns(10);
		Surname.setBounds(647, 52, 183, 30);
		frame.getContentPane().add(Surname);
		
		MiddleName = new JTextField();
		MiddleName.setText("MiddleName");
		MiddleName.setColumns(10);
		MiddleName.setBounds(647, 93, 183, 30);
		frame.getContentPane().add(MiddleName);
		
		Number = new JTextField();
		Number.setText("Number");
		Number.setColumns(10);
		Number.setBounds(647, 134, 183, 30);
		frame.getContentPane().add(Number);
		
		DelNames = new JTextField();
		DelNames.setColumns(10);
		DelNames.setBounds(10, 356, 318, 30);
		frame.getContentPane().add(DelNames);
		
		SearchNames = new JTextField();
		SearchNames.setColumns(10);
		SearchNames.setBounds(328, 356, 309, 30);
		frame.getContentPane().add(SearchNames);
		
		
		JTextArea OutPut = new JTextArea();
		OutPut.setBounds(10, 11, 627, 262);
		frame.getContentPane().add(OutPut);
		
		
		JButton Adding = new JButton("Add");
		Adding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Names names = new Names(Name.getText(), Surname.getText(), MiddleName.getText(), Number.getText());
				list.add(names);
				Name.setText("");
				Surname.setText("");
				MiddleName.setText("");
				Number.setText("");
			}
		});
		Adding.setBounds(647, 175, 183, 30);
		frame.getContentPane().add(Adding);
		
		JButton Deletin = new JButton("Delete");
		Deletin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strDel = DelNames.getText();
				DelNames.setText("");
				for(int i = 0; i < list.size(); i++) {
					Names p = list.get(i);
					if(p.Surname.equals(strDel)) {
						list.remove(i);
						break;
					}
				}
			}
		});
		Deletin.setBounds(10, 326, 318, 30);
		frame.getContentPane().add(Deletin);
		
		JButton Searchin = new JButton("Search");
		Searchin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Iterator<Names> iter = list.iterator();
				String StrSearch = SearchNames.getText();
				SearchNames.setText("");
				String OutStr = "";
				while(iter.hasNext()) {
					Names p = iter.next();
					if(p.Surname.equals(StrSearch)) {
						OutStr += p.Name + "\n" + p.Surname + "\n" + p.MiddleName + "\n" + p.Number + "\n";
						OutStr += "------------------------------------- \n";
					}
				}
				OutPut.setText(OutStr);
			}
		});
		Searchin.setBounds(328, 327, 309, 30);
		frame.getContentPane().add(Searchin);
		
		JButton FromHead = new JButton("FromHead");
		FromHead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator<Names> iter = list.iterator();
				String OutStr = "";
				while(iter.hasNext()) {
					Names p = iter.next();
					OutStr += p.Name + "\n" + p.Surname + "\n" + p.MiddleName + "\n" + p.Number + "\n";
					OutStr += "------------------------------------- \n";
				}
				OutPut.setText(OutStr);
			}
		});
		FromHead.setBounds(10, 284, 318, 30);
		frame.getContentPane().add(FromHead);
		
		JButton FromTail = new JButton("FromTail");
		FromTail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String OutStr = "";
				for(int i = list.size() - 1; i >= 0; i--) {
					Names p = list.get(i);
					OutStr += p.Name + "\n" + p.Surname + "\n" + p.MiddleName + "\n" + p.Number + "\n";
					OutStr += "------------------------------------- \n";
				}
				OutPut.setText(OutStr);
			}
		});
		FromTail.setBounds(328, 284, 309, 30);
		frame.getContentPane().add(FromTail);
		
	}
}