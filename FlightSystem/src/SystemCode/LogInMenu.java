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

public class LogInMenu extends JFrame {
	/**
	 * Components
	 */
	private static final long serialVersionUID = 1L;
	// Variable Declaration
	JPanel jpLogin;
	// JButton jbtnBack;
	JButton jbtnLogin;
	JLabel jlblUsername;
	JLabel jlblPassword;
	JLabel jlblHiddenErrorMsg;
	JTextField jtfUsername;
	JPasswordField jtfPassword;

	/**
	 * Initialize the contents of the frame.
	 */
	public LogInMenu() {
		// Initialise Components
		jpLogin = new JPanel();
		// jbtnBack = new JButton("<---");
		jlblUsername = new JLabel("Username:");
		jtfUsername = new JTextField(15);
		jlblPassword = new JLabel("Password:");
		jlblHiddenErrorMsg = new JLabel("");
		jtfPassword = new JPasswordField(15);
		jtfPassword.setEchoChar('*');
		jbtnLogin = new JButton("Login");

		// Add components to panel
		// jpLogin.add(jbtnBack);
		jpLogin.add(jlblUsername);
		jpLogin.add(jtfUsername);
		jpLogin.add(jlblPassword);
		jpLogin.add(jtfPassword);
		jpLogin.add(jlblHiddenErrorMsg);
		jpLogin.add(jbtnLogin);
		// Add panel to frame
		this.add(jpLogin, BorderLayout.CENTER);

		/**
		 * Add action listener to log in button determine if username and password
		 * correct
		 */
		jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					if (jtfUsername.getText().equals("root") && jtfPassword.getText().equals("password")) {
						// Opens MainMenu
						FlightGUI window = new FlightGUI();
						window.frame.setVisible(true);
						dispose();

					}
					// incorrect Login
					else {
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
	 * Launch the application window.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LogInMenu frame = new LogInMenu();
		frame.setTitle("Log In");
		frame.setSize(220, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
