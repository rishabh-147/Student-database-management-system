import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Checkbox;
import java.awt.Panel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Pay_Now_Module extends JFrame {

	private JPanel contentPane;
	private JTextField Amount_txt;
	private JTextField Ben_name_txt;
	private JTextField name_txt;
	private JTextField course_txt;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay_Now_Module frame = new Pay_Now_Module();
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
	public Pay_Now_Module() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setTitle("Fee Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel due_txt = new JLabel("Total Due: ");
		due_txt.setForeground(UIManager.getColor("TextField.highlight"));
		due_txt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		due_txt.setBounds(37, 312, 89, 22);
		contentPane.add(due_txt);
		
		JLabel paid_txt = new JLabel("Amount Paid:");
		paid_txt.setForeground(UIManager.getColor("TextField.highlight"));
		paid_txt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		paid_txt.setBounds(37, 359, 89, 22);
		contentPane.add(paid_txt);
		
		JLabel balance_txt = new JLabel("Balance :");
		balance_txt.setForeground(UIManager.getColor("TextField.highlight"));
		balance_txt.setFont(new Font("Times New Roman", Font.BOLD, 14));
		balance_txt.setBounds(44, 409, 75, 47);
		contentPane.add(balance_txt);
		
		JTextArea Due_txt = new JTextArea();
		Due_txt.setBackground(SystemColor.controlHighlight);
		Due_txt.setLineWrap(true);
		Due_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Due_txt.setEditable(false);
		Due_txt.setBounds(129, 312, 209, 22);
		contentPane.add(Due_txt);
		
		JTextArea Balance_txt = new JTextArea();
		Balance_txt.setBackground(SystemColor.controlHighlight);
		Balance_txt.setEditable(false);
		Balance_txt.setBounds(129, 409, 209, 47);
		contentPane.add(Balance_txt);
		
		Amount_txt = new JTextField();
		Amount_txt.setFont(new Font("Times New Roman", Font.BOLD, 13));
		Amount_txt.setHorizontalAlignment(SwingConstants.LEFT);
		Amount_txt.setBounds(129, 360, 209, 22);
		contentPane.add(Amount_txt);
		Amount_txt.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Benificiary :");
		lblNewLabel_1.setForeground(UIManager.getColor("TextField.highlight"));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(37, 140, 115, 22);
		contentPane.add(lblNewLabel_1);
		
		Ben_name_txt = new JTextField();
		Ben_name_txt.setBackground(SystemColor.scrollbar);
		Ben_name_txt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Ben_name_txt.setBounds(129, 142, 206, 22);
		contentPane.add(Ben_name_txt);
		Ben_name_txt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Payer Name: ");
		lblNewLabel_1_1.setForeground(UIManager.getColor("TextField.highlight"));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(37, 183, 115, 22);
		contentPane.add(lblNewLabel_1_1);
		
		name_txt = new JTextField();
		name_txt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		name_txt.setColumns(10);
		name_txt.setBackground(SystemColor.scrollbar);
		name_txt.setBounds(129, 182, 206, 22);
		contentPane.add(name_txt);
		
		JLabel lblName = new JLabel("Course:");
		lblName.setForeground(UIManager.getColor("TextField.highlight"));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblName.setBounds(37, 225, 77, 22);
		contentPane.add(lblName);
		
		JLabel lblSection = new JLabel("Section:");
		lblSection.setForeground(UIManager.getColor("TextField.highlight"));
		lblSection.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSection.setBounds(37, 272, 77, 22);
		contentPane.add(lblSection);
		
		JTextArea section_txt = new JTextArea();
		section_txt.setBackground(SystemColor.controlHighlight);
		section_txt.setLineWrap(true);
		section_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		section_txt.setEditable(false);
		section_txt.setBounds(129, 272, 209, 22);
		contentPane.add(section_txt);
		
		JLabel lblNewLabel_9 = new JLabel("U.I.D :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(29, 81, 60, 14);
		contentPane.add(lblNewLabel_9);
		
		JTextArea uid_txt = new JTextArea();
		uid_txt.setBounds(87, 77, 173, 22);
		contentPane.add(uid_txt);
		
		JButton search_button = new JButton("Search");
		search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
				
					//Retrieve data from the stud_details table
					
					String query1 = "SELECT * FROM stud_details WHERE UID= ?";
					PreparedStatement ptsmt = conn.prepareStatement(query1);
					ptsmt.setDouble(1, Integer.parseInt(uid_txt.getText()));
					
					//Retrieve data from the fee_details table
					String query2 = "SELECT * FROM fee_details WHERE UID= ?";
					PreparedStatement ptsmt1 = conn.prepareStatement(query2);
					ptsmt1.setDouble(1, Integer.parseInt(uid_txt.getText()));
					
					ResultSet rs1 = ptsmt.executeQuery();
					ResultSet rs2 = ptsmt1.executeQuery();
					
					if(rs1.next())
					{
						Ben_name_txt.setText("Braking Norms School");
						name_txt.setText(rs1.getString("First_name") + " " +rs1.getString("last_name"));
						course_txt.setText(rs1.getString("Course"));
						section_txt.setText(rs1.getString("Section"));
					}
					
					if(rs2.next())
					{
						Double due =  Double.parseDouble(rs2.getString("sem1_fee")) +  Double.parseDouble(rs2.getString("sem2_fee")) + Double.parseDouble(rs2.getString("exam_fee"));
						Due_txt.setText((""+ due));
					}
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1);
				}
				
			}
		});
		search_button.setBounds(297, 77, 89, 23);
		contentPane.add(search_button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Search", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, null));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 46, 560, 71);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Fee Payment");
		lblNewLabel.setBounds(208, 11, 110, 24);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		course_txt = new JTextField();
		course_txt.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		course_txt.setColumns(10);
		course_txt.setBackground(SystemColor.controlHighlight);
		course_txt.setBounds(129, 225, 209, 22);
		contentPane.add(course_txt);
		
		Checkbox checkbox = new Checkbox("Confirm");
		checkbox.setBackground(UIManager.getColor("Table.light"));
		checkbox.setFont(new Font("Times New Roman", Font.BOLD, 13));
		checkbox.setBounds(279, 505, 95, 22);
		contentPane.add(checkbox);
		
		Checkbox sem1_check = new Checkbox("Semester 1");
		sem1_check.setBackground(SystemColor.controlHighlight);
		sem1_check.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sem1_check.setBounds(413, 261, 115, 39);
		contentPane.add(sem1_check);
		
		Checkbox sem2_check = new Checkbox("Semester 2");
		sem2_check.setBackground(SystemColor.controlHighlight);
		sem2_check.setFont(new Font("Times New Roman", Font.BOLD, 14));
		sem2_check.setBounds(413, 324, 115, 39);
		contentPane.add(sem2_check);
		
		Checkbox exam_check = new Checkbox("Exam Fee");
		exam_check.setBackground(SystemColor.controlHighlight);
		exam_check.setFont(new Font("Times New Roman", Font.BOLD, 14));
		exam_check.setBounds(414, 385, 114, 39);
		contentPane.add(exam_check);
		
		JButton Pay_button = new JButton("Pay");
		Pay_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			try {	Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
			
				String query3 = "SELECT * FROM fee_details WHERE UID= ?";
				PreparedStatement ptsmt1 = conn.prepareStatement(query3);
				ptsmt1.setDouble(1, Integer.parseInt(uid_txt.getText()));
				
				//Updation Query
				
				
				ResultSet rs1 = ptsmt1.executeQuery();
				
				if(checkbox.getState()==true) {
					if(sem1_check.getState()==true) {
						if(rs1.next()) {
						double sem1 = rs1.getDouble("sem1_fee");
						double balance = sem1 - Double.parseDouble(Due_txt.getText());
						Balance_txt.setText("Rs. "+ balance);
						String query4= "UPDATE fee_details SET sem1_fee = ? WHERE fee_details.UID = ?";
						PreparedStatement ptsmtUpdate = conn.prepareStatement(query4);
						ptsmtUpdate.setDouble(1, balance);
						ptsmtUpdate.setInt(2,Integer.parseInt(uid_txt.getText()));
						ptsmtUpdate.execute();
						}
					}
					else if(sem2_check.getState()==true) {
						if(rs1.next()) {
						double sem2 = rs1.getDouble("sem2_fee");
						double balance = sem2 - Double.parseDouble(Due_txt.getText());
						String query4= "UPDATE fee_details SET sem2_fee = ? WHERE fee_details.UID = ?";
						PreparedStatement ptsmtUpdate = conn.prepareStatement(query4);
						ptsmtUpdate.setDouble(1, balance);
						ptsmtUpdate.setInt(2,Integer.parseInt(uid_txt.getText()));
						ptsmtUpdate.execute();
						}
					}
					
					else if(exam_check.getState()==true) {
						if(rs1.next()) {
						double exam = rs1.getDouble("exam_fee");
						double balance = exam - Double.parseDouble(Due_txt.getText());
						Balance_txt.setText("Rs. "+ balance);
						String query4= "UPDATE fee_details SET exam_fee = ? WHERE fee_details.UID = ?";
						PreparedStatement ptsmtUpdate = conn.prepareStatement(query4);
						ptsmtUpdate.setDouble(1, balance);
						ptsmtUpdate.setInt(2,Integer.parseInt(uid_txt.getText()));
						ptsmtUpdate.execute();
				}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please check the box for the type of fees \n --> Sememster 1\n --> Sememster 2\n --> Exam Fee");
					}
					
					JOptionPane.showMessageDialog(null, "Your fees has been submitted!!\n------------------------------\n\t Thank You");
			}
				else {
					JOptionPane.showMessageDialog(null, "Please check the box for confirmation,\n to proceed.");	
				}
			}
			catch(Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
			}
			}
		});
		Pay_button.setBackground(new Color(255, 255, 224));
		Pay_button.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Pay_button.setBounds(453, 505, 89, 33);
		contentPane.add(Pay_button);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setBounds(394, 236, 154, 215);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(SystemColor.controlShadow, 3, true));
		panel_2.setBounds(388, 231, 166, 226);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(UIManager.getColor("TextField.inactiveBackground"), 4, true));
		panel_3.setBackground(UIManager.getColor("TextField.darkShadow"));
		panel_3.setBounds(20, 125, 343, 352);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(UIManager.getColor("Table.light"));
		panel_4.setBorder(new LineBorder(UIManager.getColor("TextField.foreground"), 1, true));
		panel_4.setBounds(244, 488, 326, 61);
		contentPane.add(panel_4);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 561, 564, 20);
		contentPane.add(textField);
		
		
		
			
	}
	
	public void add_fee_data(String uid, String name){
		int UID = Integer.parseInt(uid);
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "");
			
			String query = "INSERT INTO fee_details VALUE (?,?,?,?,?)";
			
			PreparedStatement ptsmt = conn.prepareStatement(query);
			ptsmt.setInt(1,UID);
			ptsmt.setString(2, name);
			ptsmt.setDouble(3, 48000.00);
			ptsmt.setDouble(4, 48000.00);
			ptsmt.setDouble(5, 2750.00);
			
			ptsmt.execute();
			conn.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
