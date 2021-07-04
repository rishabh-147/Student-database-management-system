import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.Checkbox;
import java.awt.Rectangle;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
public class Student_Details_Module2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Details_Module2 frame = new Student_Details_Module2();
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
	public Student_Details_Module2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\tiwar\\Downloads\\T__1_-removebg-preview.png"));
		setTitle("Student Detail");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Detail");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(229, 11, 252, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(69, 151, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mother  :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(69, 204, 58, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(74, 257, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(69, 356, 74, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E-Mail :");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_5.setBounds(74, 404, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Section :");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_7.setBounds(69, 500, 74, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Fees Due :");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_8.setBounds(69, 595, 74, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("U.I.D :");
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_9.setBounds(40, 87, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("D.O.B :");
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_10.setBounds(74, 304, 64, 14);
		contentPane.add(lblNewLabel_10);
		
		JTextArea uid_txt = new JTextArea();
		uid_txt.setBounds(108, 82, 167, 22);
		contentPane.add(uid_txt);
		
		JTextArea name_txt = new JTextArea();
		name_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		name_txt.setEditable(false);
		name_txt.setBounds(137, 146, 230, 26);
		contentPane.add(name_txt);
		
		JTextArea dob_txt = new JTextArea();
		dob_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		dob_txt.setEditable(false);
		dob_txt.setBounds(137, 295, 230, 26);
		contentPane.add(dob_txt);
		
		JTextArea father_txt = new JTextArea();
		father_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		father_txt.setEditable(false);
		father_txt.setBounds(137, 248, 230, 26);
		contentPane.add(father_txt);
		
		JTextArea mail_txt = new JTextArea();
		mail_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		mail_txt.setEditable(false);
		mail_txt.setBounds(137, 395, 230, 26);
		contentPane.add(mail_txt);
		
		JTextArea Section_txt = new JTextArea();
		Section_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		Section_txt.setEditable(false);
		Section_txt.setBounds(137, 491, 230, 26);
		contentPane.add(Section_txt);
		
		JTextArea mother_txt = new JTextArea();
		mother_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		mother_txt.setEditable(false);
		mother_txt.setBounds(137, 195, 230, 26);
		contentPane.add(mother_txt);
		
		JTextArea contact_txt = new JTextArea();
		contact_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		contact_txt.setEditable(false);
		contact_txt.setBounds(137, 347, 230, 26);
		contentPane.add(contact_txt);
		
		JTextArea fee_due_txt = new JTextArea();
		fee_due_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		fee_due_txt.setEditable(false);
		fee_due_txt.setBounds(137, 591, 230, 26);
		contentPane.add(fee_due_txt);
		
		JLabel lblNewLabel_6_1 = new JLabel("Course :");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1.setBounds(69, 447, 84, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JTextArea course_txt = new JTextArea();
		course_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		course_txt.setEditable(false);
		course_txt.setBounds(137, 443, 230, 26);
		contentPane.add(course_txt);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Address :");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6_1_1.setBounds(69, 545, 84, 14);
		contentPane.add(lblNewLabel_6_1_1);
		
		JTextArea address_txt = new JTextArea();
		address_txt.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		address_txt.setLineWrap(true);
		address_txt.setWrapStyleWord(true);
		address_txt.setTabSize(10);
		address_txt.setEditable(false);
		address_txt.setBounds(137, 541, 230, 26);
		contentPane.add(address_txt);
		
		
		
	    JButton done_button = new JButton("Done");
		done_button.setBackground(new Color(204, 255, 153));
		done_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			
			}
			
		});
		done_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		done_button.setBounds(497, 528, 161, 59);
		contentPane.add(done_button);
		
		JButton search_button = new JButton("Search");
		search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Establish Connection with the stud_details and get entries for the respective UID. and also with the fee detail table.
				//Print the details in the text boxes using "uid_txt.setText("TEXT_HERE");"
				
				ResultSet resultset1 = null; //to get the set of values for the given UID.
				ResultSet resultset2 = null;
				// Establish the connection with the stud_details table
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "");
					try {
					String query1 = "SELECT * FROM stud_details WHERE UID =?"; //Query for the UID created.
					PreparedStatement ptsmt = conn.prepareStatement(query1);
					ptsmt.setString(1, uid_txt.getText());
					resultset1 = ptsmt.executeQuery(); // Set of values for the Uid got.
					
					//For the fee details...
					String query2 = "SELECT * FROM fee_details WHERE UID =?"; //Query for the UID created.
					PreparedStatement ptsmt2 = conn.prepareStatement(query2);
					ptsmt2.setInt(1, Integer.parseInt(uid_txt.getText()));
					resultset2 = ptsmt2.executeQuery();
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
				try 
					{
				if(resultset1.next()) 
					{
					uid_txt.setText(resultset1.getString("UID"));
					name_txt.setText(resultset1.getString("First_name") + resultset1.getString("last_name"));
					father_txt.setText(resultset1.getString("Father"));
					mother_txt.setText(resultset1.getString("Mother"));
					dob_txt.setText(resultset1.getString("DOB"));
					contact_txt.setText(resultset1.getString("Contact"));
					mail_txt.setText(resultset1.getString("E-Mail"));
					address_txt.setText(resultset1.getString("Address"));
					course_txt.setText(resultset1.getString("Course"));
					Section_txt.setText(resultset1.getString("Section"));
					
					}
				if(resultset2.next())
				{
					fee_due_txt.setText(""+ (resultset2.getDouble("sem1_fee") + resultset2.getDouble("sem2_fee")));
				}
				}
				catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}	
			}
		});
		search_button.setBounds(318, 82, 89, 23);
		contentPane.add(search_button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Search", TitledBorder.LEADING, TitledBorder.BELOW_TOP, null, null));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(21, 52, 653, 71);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					new Student_Module().setVisible(true);
				}catch(Exception e2){
					JOptionPane.showMessageDialog(null, e2);
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(577, 23, 97, 26);
		contentPane.add(btnNewButton);
		
		Checkbox check_del = new Checkbox("Confirm");
		check_del.setBounds(new Rectangle(15, 15, 0, 0));
		check_del.setBackground(Color.LIGHT_GRAY);
		check_del.setFont(new Font("Times New Roman", Font.BOLD, 14));
		check_del.setBounds(497, 387, 161, 32);
		contentPane.add(check_del);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(check_del.getState()==false)
					{
						JOptionPane.showMessageDialog(null, "Please check the confirmation box, \n to delete the record.");
						
					}
					else {
						try {
							
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "root", "");
							String query = "DELETE FROM stud_details WHERE stud_details.UID = '"+uid_txt.getText()+"'";
							PreparedStatement ptsmt = conn.prepareStatement(query);
							ptsmt.execute();
							JOptionPane.showMessageDialog(null, "The record has been successfully deleted.");
							
						}catch(Exception e1){
							JOptionPane.showMessageDialog(null,e1);
						}
					}
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(255, 153, 153));
		btnNewButton_1.setBounds(495, 421, 161, 50);
		contentPane.add(btnNewButton_1);
		
		JTextPane txtpnCheckTheConfirmation = new JTextPane();
		txtpnCheckTheConfirmation.setBackground(SystemColor.control);
		txtpnCheckTheConfirmation.setFont(new Font("Arial", Font.ITALIC, 12));
		txtpnCheckTheConfirmation.setText("# Check the confirmation and press the delete button, to delete this record.");
		txtpnCheckTheConfirmation.setBounds(496, 322, 162, 59);
		contentPane.add(txtpnCheckTheConfirmation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.controlHighlight);
		panel_1.setBorder(new LineBorder(SystemColor.controlText, 3, true));
		panel_1.setBounds(42, 128, 358, 508);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.scrollbar);
		panel_2.setBorder(new LineBorder(SystemColor.textInactiveText, 3, true));
		panel_2.setBounds(464, 299, 213, 336);
		contentPane.add(panel_2);
		
		textField = new JTextField();
		textField.setText("© Rishabh Tiwari\r\n      E-Mail: onlinestuff.rishabh@gmail.com ");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.menu);
		textField.setBounds(40, 641, 636, 20);
		contentPane.add(textField);
		
		
	}
}
