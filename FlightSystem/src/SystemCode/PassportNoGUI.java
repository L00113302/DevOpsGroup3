package SystemCode;
/**
 * @author Mark Glenn
 * 
 * L00113302 Cloud
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Desktop;
import java.net.URI;
import java.net.URI.*;
import java.net.URL;
import java.awt.Color;
import java.awt.Font;

public class PassportNoGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * @param args
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassportNoGUI window = new PassportNoGUI();
					window.getFrame().setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PassportNoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 350, 242);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(76, 82, 161, 20);
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblPleaseEnterYour = new JLabel("Enter Your Passport Number");
		lblPleaseEnterYour.setBounds(76, 57, 225, 14);
		getFrame().getContentPane().add(lblPleaseEnterYour);
		
		JButton btnNewButton = new JButton("Confirm Booking");
		btnNewButton.setBounds(168, 169, 156, 23);
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnSave = new JButton("OK");
		btnSave.setBounds(126, 113, 77, 20);
		frame.getContentPane().add(btnSave);
		
		JLabel lblGAirways = new JLabel("    G3 Airways");
		lblGAirways.setForeground(Color.WHITE);
		lblGAirways.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		lblGAirways.setBackground(Color.YELLOW);
		lblGAirways.setBounds(26, 2, 286, 44);
		frame.getContentPane().add(lblGAirways);
		
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					// Opens window
					PassportNoGUI window = new PassportNoGUI();
					window.getFrame().setVisible(true);
					DatabaseHandler dbh = new DatabaseHandler();
					dbh.connectToDatabase();
					dbh.stmt = dbh.conn.createStatement();

					String insertQuery = ("INSERT INTO DevOps.Customer(PassportNumber) values ('"
							+ textField.getText() + "')");

					dbh.stmt.executeQuery("USE DevOps");
					dbh.stmt.execute(insertQuery);

					//JOptionPane.showMessageDialog(null, "Query Executed");
					// close connection
					dbh.rs.close();
					dbh.conn.close();

				} catch (Exception ex) {
					//System.out.print("Connection Error");
					//JOptionPane.showMessageDialog(null, ex.getMessage());
				}

			}
		});
		
		btnNewButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				 try { 
			         String url = "http://localhost/get.php";
			         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			       }
			       catch (java.io.IOException e) {
			           System.out.println(e.getMessage());
			       }
		}});
	}
	/**
	 * Get frame
	 * @return frame
	 */
	public JFrame getFrame() {
		return frame;
	}
	/**
	 * @param frame
	 * set frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
	}
	
	public static void openWebpage(URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void openWebpage(URL url) {
	    try {
	        openWebpage(url.toURI());
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
