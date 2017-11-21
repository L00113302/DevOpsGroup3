package SystemCode;
/**
 * Register Menu
 *
 * @author Christopher Doherty
 */

import javax.swing.*;

import java.awt.BorderLayout;
import java.util.*;

public class RegisterMenu extends JFrame {
	JPanel jpRegister;
	JButton jbtnRegister;
	JLabel jlblFname;
	JLabel jlblLname;
	JLabel jlblCountry;
	JLabel jlblEmail;
	JLabel jlblUsername;
	JLabel jlblPassword;
	JLabel jlblReenterPassword;
	JTextField jtfFname;
	JTextField jtfLname;
	JTextField jtfCountry;
	JTextField jtfEmail;
	JTextField jtfUsername;
	JTextField jtfPassword;
	JTextField jtfReenterPassword;
	
	public RegisterMenu()
	{
		jpRegister = new JPanel();
		jlblFname =  new JLabel("First Name:");
		jtfFname = new JTextField(15);
		jlblLname =  new JLabel("Last Name:");
		jtfLname = new JTextField(15);
		jlblCountry =  new JLabel("Country:");
		jtfCountry = new JTextField(15);
		jlblEmail =  new JLabel("Email:");
		jtfEmail = new JTextField(15);
		jlblUsername =  new JLabel("Username:");
		jtfUsername = new JTextField(15);
		jlblPassword = new JLabel("Password:");
		jtfPassword = new JTextField(15);
		jlblReenterPassword = new JLabel("Re-Enter Password:");
		jtfReenterPassword = new JTextField(15);
		jbtnRegister = new JButton("Register");

		//GridLayout newGridLayout = new GridLayout(3,3); 
		jpRegister.add(jlblFname);
		jpRegister.add(jtfFname);
		jpRegister.add(jlblLname);
		jpRegister.add(jtfLname);
		jpRegister.add(jlblCountry);
		jpRegister.add(jtfCountry);
		jpRegister.add(jlblEmail);
		jpRegister.add(jtfEmail);
		jpRegister.add(jlblUsername);
		jpRegister.add(jtfUsername);
		jpRegister.add(jlblPassword);
		jpRegister.add(jtfPassword);	
		jpRegister.add(jlblReenterPassword);
		jpRegister.add(jtfReenterPassword);
		jpRegister.add(jbtnRegister);		
		
		this.add(jpRegister, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) 
	{
		RegisterMenu frame = new RegisterMenu();
      frame.setTitle("Register");
      frame.setSize(220,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
	}
	
}
