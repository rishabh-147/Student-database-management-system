import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Checkbox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import java.awt.Panel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Add_Stud extends JFrame {

	private JPanel contentPane;
	private JTextField firstName_txt;
	private JTextField lastName_txt;
	private JTextField FatherName_txt;
	private JTextField MotherName_txt;
	private JTextField section_txt;
	private JTextField dob_txt;
	private JTextField address_txt;
	private JTextField contact_txt;
	private JTextField Email_txt;
	private static int UID_var = 202101001;
	private JTextField Uid_txt;
	private JTextField txtRishabhTiwari;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Stud frame = new Add_Stud();
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
	public Add_Stud() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setFont(new Font("Times New Roman", Font.BOLD, 18));
		setTitle("Add Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 128, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fname_lable = new JLabel("First Name:");
		fname_lable.setBackground(new Color(224, 255, 255));
		fname_lable.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fname_lable.setBounds(62, 139, 86, 30);
		contentPane.add(fname_lable);
		
		JLabel mothersname_lbl = new JLabel("Mother:");
		mothersname_lbl.setBackground(new Color(224, 255, 255));
		mothersname_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		mothersname_lbl.setBounds(62, 228, 123, 30);
		contentPane.add(mothersname_lbl);
		
		JLabel address_lbl = new JLabel("Address: ");
		address_lbl.setBackground(new Color(224, 255, 255));
		address_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		address_lbl.setBounds(62, 430, 101, 30);
		contentPane.add(address_lbl);
		
		JLabel state_lbl = new JLabel("State: ");
		state_lbl.setBackground(new Color(224, 255, 255));
		state_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		state_lbl.setBounds(62, 471, 66, 30);
		contentPane.add(state_lbl);
		
		JLabel lastname_lbl = new JLabel("Last Name: ");
		lastname_lbl.setBackground(new Color(224, 255, 255));
		lastname_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		lastname_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lastname_lbl.setBounds(62, 180, 101, 30);
		contentPane.add(lastname_lbl);
		
		JLabel fathername_lbl = new JLabel("Father:");
		fathername_lbl.setBackground(new Color(224, 255, 255));
		fathername_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fathername_lbl.setBounds(62, 269, 101, 30);
		contentPane.add(fathername_lbl);
		
		JLabel course_lbl = new JLabel("Course:");
		course_lbl.setBackground(new Color(224, 255, 255));
		course_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		course_lbl.setBounds(62, 515, 86, 30);
		contentPane.add(course_lbl);
		
		JLabel section_lbl = new JLabel("Section:");
		section_lbl.setBackground(new Color(224, 255, 255));
		section_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		section_lbl.setBounds(62, 556, 80, 30);
		contentPane.add(section_lbl);
		
		Checkbox check = new Checkbox("Confirm");
		check.setFont(new Font("Times New Roman", Font.BOLD, 14));
		check.setBackground(SystemColor.control);
		check.setBounds(533, 476, 107, 52);
		contentPane.add(check);
		
		firstName_txt = new JTextField();
		firstName_txt.setBounds(158, 139, 229, 26);
		contentPane.add(firstName_txt);
		firstName_txt.setColumns(10);
		
		lastName_txt = new JTextField();
		lastName_txt.setColumns(10);
		lastName_txt.setBounds(158, 186, 229, 24);
		contentPane.add(lastName_txt);
		
		FatherName_txt = new JTextField();
		FatherName_txt.setColumns(10);
		FatherName_txt.setBounds(158, 275, 229, 24);
		contentPane.add(FatherName_txt);
		
		MotherName_txt = new JTextField();
		MotherName_txt.setColumns(10);
		MotherName_txt.setBounds(158, 228, 229, 24);
		contentPane.add(MotherName_txt);
		
		section_txt = new JTextField();
		section_txt.setColumns(10);
		section_txt.setBounds(158, 562, 229, 30);
		contentPane.add(section_txt);
		
		JComboBox State_combbox = new JComboBox();
		State_combbox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		State_combbox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Jammu & Kashmir", "Chandigarh", "Punjab", "Delhi", "Haryana", "Uttarakhand", "Uttar Pradesh", "Rajashthan", "Bihar", "Gujrat", "West Bengal", "Arunanchal Pradesh", "Sikkim", "Meghalaya", "Tripura", "Mizoram", "Nagaland", "Madhya Pradesh", "Goa", "Maharastra", "Telangana", "Odisha", "Karnatka", "Tamil Nadu", "Pondicherry", "Kerala"}));
		State_combbox.setMaximumRowCount(30);
		State_combbox.setBounds(158, 471, 229, 26);
		contentPane.add(State_combbox);
		
		
		
		
		JComboBox Course_combbox = new JComboBox();
		Course_combbox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		Course_combbox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Computer Science Engineering", "ISDF", "IT", "EEE", "Civil Engineering", "Mechanical engineering", "Chemical Engineering", "Bio-Technology"}));
		Course_combbox.setMaximumRowCount(30);
		Course_combbox.setBounds(158, 512, 229, 30);
		contentPane.add(Course_combbox);
		

		JLabel dob_lbl = new JLabel("D.O.B:");
		dob_lbl.setHorizontalAlignment(SwingConstants.LEFT);
		dob_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		dob_lbl.setBackground(new Color(224, 255, 255));
		dob_lbl.setBounds(62, 310, 101, 30);
		contentPane.add(dob_lbl);
		
		dob_txt = new JTextField();
		dob_txt.setToolTipText("dd-mm-yyyy");
		dob_txt.setHorizontalAlignment(SwingConstants.LEFT);
		dob_txt.setColumns(10);
		dob_txt.setBounds(158, 316, 229, 24);
		contentPane.add(dob_txt);
		

		address_txt = new JTextField();
		address_txt.setColumns(10);
		address_txt.setBounds(159, 431, 228, 24);
		contentPane.add(address_txt);
		
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					if(check.getState()==false) {
						JOptionPane.showMessageDialog(null,"Please confirm to proceed.");
					}
					else {
						//Get the input selected by the user in the comboBox of State and Course Field.
						
						String state = (String)State_combbox.getSelectedItem();
						String course = (String)Course_combbox.getSelectedItem();
						
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
					    
						String query = "INSERT INTO stud_details VALUE(?,?,?,?,?,?,?,?,?,?,?,?)";
//[TO BE USED IN FUTURE UPDATES.....]
						//String Uid = (firstName_txt.getText(0, 3).toString().toUpperCase()) + (lastName_txt.getText(0, 3).toString().toUpperCase()) + (dob_txt.getText(3,2)) + (dob_txt.getText(0,2)); //Getting the text entered in First Name from 0th index to 3rd index....making UNIQUE ID. This will generate a UID like FOR Rishabh Tiwari born on 18/01/2001 UID will be RISTIW0118.
					    
					    PreparedStatement ptstmt = conn.prepareStatement(query);
					    ptstmt.setString(1, Uid_txt.getText().toUpperCase());  
					    ptstmt.setString(2, firstName_txt.getText().toUpperCase()); //Converting input to string and then storing them in UPPER CASE.
					    ptstmt.setString(3, lastName_txt.getText().toUpperCase());
					    ptstmt.setString(4, FatherName_txt.getText().toUpperCase());
					    ptstmt.setString(5, MotherName_txt.getText().toUpperCase());
					    ptstmt.setString(6, dob_txt.getText().toUpperCase());
					    ptstmt.setString(7, contact_txt.getText().toUpperCase());
					    ptstmt.setString(8, Email_txt.getText().toUpperCase());
					    ptstmt.setString(9, address_txt.getText().toUpperCase());
					    ptstmt.setString(10, state);
					    ptstmt.setString(11, course);
					    ptstmt.setString(12, section_txt.getText().toUpperCase());
					   
					    ptstmt.executeUpdate();
					    String name = firstName_txt.getText() + " " + lastName_txt.getText();
					    
					    new Pay_Now_Module().add_fee_data(Uid_txt.getText(), name);
					    
					    JOptionPane.showMessageDialog(null, "Successfully Added the Student in the record.");
					    conn.close();
				}
				}
					catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,e1);
				}
			}
		});
		
		submit.setBackground(SystemColor.info);
		submit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		submit.setBounds(532, 551, 108, 40);
		contentPane.add(submit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 486, 46, -67);
		contentPane.add(comboBox);
											
		JLabel Contact_lbl = new JLabel("Contact: ");
		Contact_lbl.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Contact_lbl.setBackground(new Color(224, 255, 255));
		Contact_lbl.setBounds(62, 351, 101, 30);
		contentPane.add(Contact_lbl);
		
		JLabel address_lbl_2 = new JLabel("E-Mail : ");
		address_lbl_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		address_lbl_2.setBackground(new Color(224, 255, 255));
		address_lbl_2.setBounds(62, 392, 101, 30);
		contentPane.add(address_lbl_2);
		
		contact_txt = new JTextField();
		contact_txt.setColumns(10);
		contact_txt.setBounds(158, 351, 229, 24);
		contentPane.add(contact_txt);
		
		Email_txt = new JTextField();
		Email_txt.setColumns(10);
		Email_txt.setBounds(158, 392, 229, 24);
		contentPane.add(Email_txt);			
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Student_Module().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(566, 33, 89, 26);
		contentPane.add(btnNewButton);
		
		JLabel fname_lable_1 = new JLabel("U.I.D:");
		fname_lable_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		fname_lable_1.setBackground(new Color(224, 255, 255));
		fname_lable_1.setBounds(62, 96, 86, 30);
		contentPane.add(fname_lable_1);
		
		Uid_txt = new JTextField();
		Uid_txt.setColumns(10);
		Uid_txt.setBounds(158, 96, 229, 26);
		contentPane.add(Uid_txt);
		
		JLabel lblNewLabel = new JLabel("Student Registration Form");
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 3, 467, 70);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(109, 109, 109), 3, true));
		panel.setBounds(27, 77, 407, 535);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(492, 459, 171, 152);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textInactiveText);
		panel_2.setBounds(26, 8, 645, 62);
		contentPane.add(panel_2);
		
		txtRishabhTiwari = new JTextField();
		txtRishabhTiwari.setHorizontalAlignment(SwingConstants.CENTER);
		txtRishabhTiwari.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		txtRishabhTiwari.setEditable(false);
		txtRishabhTiwari.setBackground(SystemColor.menu);
		txtRishabhTiwari.setBounds(27, 630, 636, 20);
		contentPane.add(txtRishabhTiwari);
		txtRishabhTiwari.setColumns(10);
				
		
	}
}
