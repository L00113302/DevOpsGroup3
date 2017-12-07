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
import javax.swing.JButton;

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
		getFrame().setBounds(100, 100, 329, 211);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(66, 67, 172, 20);
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPleaseEnterYour = new JLabel("Please Enter Your Passport Number");
		lblPleaseEnterYour.setBounds(66, 28, 234, 14);
		getFrame().getContentPane().add(lblPleaseEnterYour);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(68, 123, 172, 23);
		getFrame().getContentPane().add(btnNewButton);
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
	}
}
