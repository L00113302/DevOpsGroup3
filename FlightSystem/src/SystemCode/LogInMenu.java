package SystemCode;
/** * Log in Menu
 *
 * @author 		Christopher Doherty
 * L00119571 	Applied Computing
 */

import javax.swing.*;
//import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
//import java.util.*;
//import java.awt.*;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class LogInMenu extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variable Declaration
	JPanel jpLogin;
	//JButton jbtnBack;
	JButton jbtnLogin;
	JLabel jlblUsername;
	JLabel jlblPassword;
	JLabel jlblHiddenErrorMsg;
	JTextField jtfUsername;
	JPasswordField jtfPassword;
	
	/**
	 * Log in menu constructor
	 *
	 */
	public LogInMenu()
	{
		//Initialise Components
		jpLogin = new JPanel();
		//jbtnBack = new JButton("<---");
		jlblUsername =  new JLabel("Username:");
		jtfUsername = new JTextField(15);
		jlblPassword = new JLabel("Password:");
		jlblHiddenErrorMsg = new JLabel("");
		jtfPassword = new JPasswordField(15);
		jtfPassword.setEchoChar('*');
		jbtnLogin = new JButton("Login");
		
		//Add components to panel 
		//jpLogin.add(jbtnBack);
		jpLogin.add(jlblUsername);
		jpLogin.add(jtfUsername);
		jpLogin.add(jlblPassword);
		jpLogin.add(jtfPassword);	
		jpLogin.add(jlblHiddenErrorMsg);
		jpLogin.add(jbtnLogin);		
		
		//Add panel to frame
		this.add(jpLogin, BorderLayout.CENTER);
		
		//Add buttons to ActionListener
		//jbtnBack.addActionListener(this);
		//jbtnLogin.addActionListener(this);
	
	
	jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
		@SuppressWarnings("deprecation")
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			try {
				if(jtfUsername.getText().equals("root") && jtfPassword.getText().equals("password"))
				{
				//Opens MainMenu
					FlightGUI window = new FlightGUI();
					window.frame.setVisible(true);
					dispose();
				//DatabaseHandler dbh = new DatabaseHandler();
				//dbh.connectToDatabase();
				// close database connection
				//dbh.rs.close();
				//dbh.conn.close();
				}
				//incorrect Login
			else
			{
				jlblHiddenErrorMsg.setText("Invalid username or password");
				jlblHiddenErrorMsg.setForeground(Color.RED);
			}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage());
			}
			
		}
			
	});
	}
	
	/**
	 * @param ActionEvent when on of the buttons is pressed
	 *
	 */
	
	
	public static void main(String[] args) 
	{
		LogInMenu frame = new LogInMenu();
		frame.setTitle("Log In");
		frame.setSize(220,220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
