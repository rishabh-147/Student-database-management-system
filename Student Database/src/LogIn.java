import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setResizable(false);
		setTitle("Student Database Manager ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Student Database Management");
		title.setForeground(UIManager.getColor("Table.selectionForeground"));
		title.setBounds(5, 16, 424, 29);
		title.setFont(new Font("Times New Roman", Font.BOLD, 24));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(title);
		
		JLabel lblNewLabel = new JLabel("LogIn Page");
		lblNewLabel.setForeground(new Color(72, 61, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(143, 77, 149, 36);
		contentPane.add(lblNewLabel);
		
		JLabel Usernamelbl = new JLabel("Username:");
		Usernamelbl.setBackground(new Color(224, 255, 255));
		Usernamelbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Usernamelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Usernamelbl.setBounds(78, 147, 80, 26);
		contentPane.add(Usernamelbl);
		
		JLabel passwordLbl = new JLabel("Password:");
		passwordLbl.setBackground(new Color(224, 255, 255));
		passwordLbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		passwordLbl.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLbl.setBounds(78, 184, 80, 29);
		contentPane.add(passwordLbl);
		
		user = new JTextField();
		user.setBackground(new Color(224, 255, 255));
		user.setBounds(185, 151, 170, 20);
		contentPane.add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBackground(new Color(224, 255, 255));
		pass.setBounds(185, 189, 170, 20);
		contentPane.add(pass);
		
		JButton Login = new JButton("Log In");
		
		Login.setBackground(new Color(176, 224, 230));
		Login.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Login.setBounds(172, 238, 89, 23);
		contentPane.add(Login);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlShadow);
		panel.setBounds(10, 5, 414, 54);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setBounds(53, 135, 332, 92);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("Table.light"));
		panel_2.setBorder(new LineBorder(UIManager.getColor("Table.sortIconColor"), 3, true));
		panel_2.setBounds(30, 67, 374, 58);
		contentPane.add(panel_2);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 267, 414, 20);
		contentPane.add(textField);
		
		Login.addActionListener(new ActionListener() {
			
		//Here connection with the data base and also User name and Password matching with the table we have
			
			public void actionPerformed(ActionEvent e) {
			//store values entered by the user in the variables
			String username = user.getText();
			String password = pass.getText();
			//inside try- catch, connect to the database.
			// Start the DATABASE first.
				try {	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
					Statement st = conn.createStatement();
					String sql = "Select * from login";
					//connected to the database table name login
								
					ResultSet rs = st.executeQuery(sql);
					while(rs.next())
					{	//get user name and password from the table;
						String un = rs.getString("username");
						String pas = rs.getString("password");
		
						if(un.equals(username) && pas.equals(password)) //check if the value in the table is equal to he value entered by the user on login page.
						{	dispose();
							new welcome_screen().setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null, "Username or Password Incorrect!!");
						}
					}
					
			}
			
			catch(Exception e1){
				JOptionPane.showMessageDialog(null, "Error in establishing connection to the DataBase.");
			}	
		}	
	});
}
}	