import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class welcome_screen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome_screen frame = new welcome_screen();
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
	public welcome_screen() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setTitle("Menu ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Menu = new JLabel("Basic Functionalities ");
		Menu.setBackground(new Color(255, 255, 153));
		Menu.setForeground(SystemColor.window);
		Menu.setBounds(121, 23, 272, 50);
		Menu.setHorizontalAlignment(SwingConstants.CENTER);
		Menu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(Menu);
		
		JButton studmod = new JButton("Student Module");
		studmod.setBackground(new Color(176, 224, 230));
		studmod.setBounds(44, 132, 182, 81);
		studmod.setFont(new Font("Times New Roman", Font.BOLD, 18));
		studmod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Student_Module().setVisible(true);	
				dispose();
			}
		});
		contentPane.add(studmod);
		
		JButton btnNewButton = new JButton("Fee Payment");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Pay_Now_Module().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(286, 132, 182, 81);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1_1 = new JButton("Log Out");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogIn().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setForeground(SystemColor.desktop);
		btnNewButton_1_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(393, 277, 91, 25);
		contentPane.add(btnNewButton_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textInactiveText);
		panel.setBounds(10, 11, 488, 72);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		panel_1.setBounds(24, 112, 460, 125);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 313, 488, 20);
		contentPane.add(textField);
	}
}
