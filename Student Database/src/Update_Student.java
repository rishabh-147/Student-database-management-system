import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.server.UID;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Update_Student extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Student frame = new Update_Student();
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
	public Update_Student() {
		setTitle("Updation Form");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Detail Updation Form");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(237, 25, 252, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(78, 166, 87, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mother  :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(78, 261, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(78, 301, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(78, 386, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E-Mail :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(78, 436, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Course :");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(78, 477, 84, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Section :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(80, 526, 58, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("U.I.D :");
		lblNewLabel_9.setForeground(SystemColor.window);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(76, 104, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("D.O.B :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(78, 341, 73, 14);
		contentPane.add(lblNewLabel_10);
		
		JTextArea uid_txt = new JTextArea();
		uid_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		uid_txt.setBounds(144, 99, 178, 22);
		contentPane.add(uid_txt);
		
		JTextArea firstname_txt = new JTextArea();
		firstname_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		firstname_txt.setBounds(159, 166, 217, 22);
		contentPane.add(firstname_txt);
		
		JTextArea dob_txt = new JTextArea();
		dob_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		dob_txt.setBounds(159, 336, 217, 22);
		contentPane.add(dob_txt);
		
		JTextArea father_txt = new JTextArea();
		father_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		father_txt.setBounds(159, 296, 217, 22);
		contentPane.add(father_txt);
		
		JTextArea mail_txt = new JTextArea();
		mail_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mail_txt.setBounds(159, 431, 217, 22);
		contentPane.add(mail_txt);
		
		JTextArea mother_txt = new JTextArea();
		mother_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		mother_txt.setBounds(159, 257, 217, 22);
		contentPane.add(mother_txt);
		
		JTextArea contact_txt = new JTextArea();
		contact_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		contact_txt.setBounds(159, 381, 217, 22);
		contentPane.add(contact_txt);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Computer Science Engineering", "ISDF", "IT", "EEE", "Civil Engineering", "Mechanical engineering", "Chemical Engineering", "Bio-Technology"}));
		comboBox.setBounds(159, 474, 217, 28);
		contentPane.add(comboBox);
		
		JTextArea section_txt = new JTextArea();
		section_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		section_txt.setBounds(159, 524, 217, 22);
		contentPane.add(section_txt);

		
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(78, 213, 98, 22);
		contentPane.add(lblNewLabel_1_1);
		
		JTextArea lastname_txt = new JTextArea();
		lastname_txt.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lastname_txt.setBounds(159, 213, 217, 22);
		contentPane.add(lastname_txt);
		
		Checkbox checkbox = new Checkbox("Confirm");
		checkbox.setBackground(SystemColor.controlDkShadow);
		checkbox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		checkbox.setBounds(499, 416, 89, 52);
		contentPane.add(checkbox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(checkbox.getState() == false) {
						JOptionPane.showMessageDialog(null,"Please confirm to proceed.");
					}
					else {
						//Get the input selected by the user in the comboBox of State and Course Field.
						
						
						String course = (String)comboBox.getSelectedItem();
						
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
					    
						String query = "UPDATE `stud_details` SET `UID`=?, `First_name`=?,`last_name`=?,`Father`=?,`Mother`=?,`DOB`=?,`Contact`=?,`E-Mail`=?,`Course`=?,`Section`=?";
					    PreparedStatement ptstmt = conn.prepareStatement(query);
					   
					    		//to be used in future updates......
					    //(firstname_txt.getText(0, 3).toString().toUpperCase()) + (lastname_txt.getText(0, 3).toString().toUpperCase()) + (dob_txt.getText(3,2)) + (dob_txt.getText(0,2)); //Getting the text entered in First Name from 0th index to 3rd index....making UNIQUE ID. This will generate a UID like FOR Rishabh Tiwari born on 18/01/2001 UID will be RISTIW0118.
					    ptstmt.setString(1, uid_txt.getText());
					    ptstmt.setString(2, firstname_txt.getText()); //Converting input to string and then storing them in UPPER CASE.
					    ptstmt.setString(3, lastname_txt.getText());
					    ptstmt.setString(4, father_txt.getText());
					    ptstmt.setString(5, mother_txt.getText());
					    ptstmt.setString(6, dob_txt.getText());
					    ptstmt.setString(7, contact_txt.getText());
					    ptstmt.setString(8, mail_txt.getText());
					    ptstmt.setString(9, course);
					    ptstmt.setString(10, section_txt.getText());
					   
					    ptstmt.executeUpdate();
					    JOptionPane.showMessageDialog(null, "Successfully Updated the Student's details in the record.");
					    conn.close();
				}
				}
					catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
				
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(497, 498, 123, 52);
		contentPane.add(btnNewButton);
		
		JButton search_button_lbl = new JButton("Search");
		search_button_lbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Establish Connection with the stud_details and get entries for the respective UID. and also with the fee detail table.
				//Print the details in the text boxes using "uid_txt.setText("TEXT_HERE");"
				
				ResultSet resultset = null; //to get the set of values for the given UID.
				// Establish the connection with the stud_details table
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "");
					try {
					String query = "SELECT * FROM stud_details WHERE UID =?"; //Query for the UID created.
					PreparedStatement ptsmt = conn.prepareStatement(query);
					ptsmt.setString(1, uid_txt.getText());
					resultset = ptsmt.executeQuery(); // Set of values for the Uid got.
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "No Data Found for this U.I.D");
					}
					
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null, E);
				}
				
				//Now, since we have the set of the values corresponding to the given UID, we will now send this data to the JText
				try {
				if(resultset.next()) 
					{
					uid_txt.setText(resultset.getString("UID"));
					firstname_txt.setText(resultset.getString("First_name"));
					lastname_txt.setText(resultset.getString("last_name"));
					father_txt.setText(resultset.getString("Father"));
					mother_txt.setText(resultset.getString("Mother"));
					dob_txt.setText(resultset.getString("DOB"));
					contact_txt.setText(resultset.getString("Contact"));
					mail_txt.setText(resultset.getString("E-Mail"));
					section_txt.setText(resultset.getString("Section"));
					} 
				}
				catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}	
			}
			
		});
		search_button_lbl.setFont(new Font("Times New Roman", Font.BOLD, 14));
		search_button_lbl.setBounds(380, 100, 89, 23);
		contentPane.add(search_button_lbl);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Student_Module().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(566, 25, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 76, 660, 67);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBounds(10, 11, 653, 52);
		contentPane.add(panel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.textInactiveText, 8, true));
		panel.setBounds(54, 152, 350, 420);
		contentPane.add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlDkShadow);
		panel_3.setBorder(new LineBorder(SystemColor.desktop, 2, true));
		panel_3.setBounds(444, 366, 215, 205);
		contentPane.add(panel_3);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(10, 594, 660, 20);
		contentPane.add(textField);
		
		
	
	}
}
