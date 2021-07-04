import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Student_Module extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Module frame = new Student_Module();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Student_Module() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setTitle("Student Module");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Stud_mod = new JLabel("Operations Present");
		Stud_mod.setForeground(SystemColor.textHighlightText);
		Stud_mod.setBackground(SystemColor.control);
		Stud_mod.setHorizontalAlignment(SwingConstants.CENTER);
		Stud_mod.setFont(new Font("Times New Roman", Font.BOLD, 20));
		Stud_mod.setBounds(50, 26, 321, 29);
		contentPane.add(Stud_mod);
		
		JButton add_stud = new JButton("Add Student");
		add_stud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add_Stud().setVisible(true);
				dispose();
			}
		});
		add_stud.setBackground(UIManager.getColor("Button.light"));
		add_stud.setForeground(new Color(0, 0, 0));
		add_stud.setFont(new Font("Times New Roman", Font.BOLD, 18));
		add_stud.setBounds(123, 89, 169, 86);
		contentPane.add(add_stud);
		
		JButton btnNewButton_1 = new JButton("Student Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Student_Details_Module2().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(123, 282, 169, 86);
		contentPane.add(btnNewButton_1);
		
		JButton Update_Rec = new JButton("Update Record");
		Update_Rec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Update_Student().setVisible(true);
				dispose();
			}
		});
		Update_Rec.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Update_Rec.setBounds(123, 185, 168, 86);
		contentPane.add(Update_Rec);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new welcome_screen().setVisible(true);
				dispose();
			}
		});
		Back.setForeground(SystemColor.activeCaptionText);
		Back.setBackground(SystemColor.inactiveCaption);
		Back.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Back.setBounds(336, 360, 89, 23);
		contentPane.add(Back);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(10, 11, 415, 58);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.controlShadow, 3, true));
		panel_1.setBounds(87, 76, 236, 305);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 388, 415, 20);
		contentPane.add(textField);
	}
}
