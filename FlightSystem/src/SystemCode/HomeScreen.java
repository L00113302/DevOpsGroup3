package SystemCode;

/**
 * HomeScreen for Flight System
 *
 * @author 		Mark Glenn
 * L00113302 	Cloud
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;

public class HomeScreen {

	private JFrame frmGAirways;

	/**
	 * @param args Launch the application.
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
		// frmGAirways.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		/**
		 * Add action listener to Main Menu JButton.
		 */
		btnLogIn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {

					// Opens MainMenu
					JFrame frame = new LogInMenu();
					frame.setVisible(true);
					frame.setSize(220, 220);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}

		});

		/**
		 * Add action listener to Register JButton.
		 */
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		panel.add(btnRegister);

		btnRegister.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {

					// Opens Register Menu
					JFrame frame = new RegisterMenu();
					frame.setVisible(true);
					frame.setSize(220, 400);

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});

		JLabel label = new JLabel("");
		label.setBounds(103, 82, 46, 14);
		frmGAirways.getContentPane().add(label);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HomeScreen.class.getResource("/SystemCode/Plane2.PNG")));
		lblNewLabel.setBounds(-10, 0, 569, 322);
		frmGAirways.getContentPane().add(lblNewLabel);
	}

}
