package SystemCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HomeScreen {

	private JFrame frmGAirways;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frmGAirways.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGAirways = new JFrame();
		frmGAirways.setTitle("HOME");
		frmGAirways.setBounds(100, 100, 569, 407);
		frmGAirways.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGAirways.getContentPane().setLayout(null);
		
		JLabel lblGAirways = new JLabel(" G3 Airways");
		lblGAirways.setForeground(Color.RED);
		lblGAirways.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 35));
		lblGAirways.setBounds(33, 49, 291, 47);
		frmGAirways.getContentPane().add(lblGAirways);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 318, 553, 50);
		frmGAirways.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		btnLogIn.setBackground(Color.LIGHT_GRAY);
		panel.add(btnLogIn);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		panel.add(btnRegister);
		
		JLabel label = new JLabel("");
		label.setBounds(103, 82, 46, 14);
		frmGAirways.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomeScreen.class.getResource("/SystemCode/Plane2.PNG")));
		lblNewLabel.setBounds(-10, 0, 569, 322);
		frmGAirways.getContentPane().add(lblNewLabel);
	}
}
