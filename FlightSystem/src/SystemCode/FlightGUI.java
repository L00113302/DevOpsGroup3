package SystemCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class FlightGUI {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightGUI window = new FlightGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FlightGUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setForeground(Color.BLUE);
		lblDestination.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDestination.setBounds(31, 66, 149, 23);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setForeground(Color.BLUE);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClass.setBounds(31, 119, 149, 23);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setForeground(Color.BLUE);
		lblTotalCost.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotalCost.setBounds(31, 171, 149, 23);
		frame.getContentPane().add(lblTotalCost);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Dublin", "New York", "Sidney", "Amsterdam", "Nairobi"}));
		comboBox.setToolTipText("Choose your destination");
		comboBox.setBounds(196, 67, 149, 23);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Business", "Personal"}));
		comboBox_1.setToolTipText("Choose your class");
		comboBox_1.setBounds(196, 120, 149, 23);
		frame.getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(196, 172, 149, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Proceed To Checkout");
		btnNewButton.setToolTipText("Proceed to payment");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(122, 216, 176, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					
					DatabaseHandler dbh = new DatabaseHandler();
					dbh.connectToDatabase();
					

					// close database connection
					dbh.rs.close();
					dbh.conn.close();
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});
		
		JLabel lblNewLabel = new JLabel("          G3 Airways");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(31, 11, 374, 44);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
