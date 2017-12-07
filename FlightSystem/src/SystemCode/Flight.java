package SystemCode;

/**
 * Flight Class
 * 
 * @author Mark Glenn L00113302 Cloud
 */
public class Flight {

	/**
	 * Create Variables
	 */
	public String flightDest;
	public String flightClass;

	/**
	 * Intialise Constructors
	 */
	public Flight() {

		flightDest = "";
		flightClass = "";
	}

	/**
	 * Constructor
	 * @param destination, class
	 */
	public Flight(String flightDest, String flightClass) {

		this.flightDest = flightDest;
		this.flightClass = flightClass;
	}
	/**
	 * get flight destination
	 * 
	 * @return flight destination
	 */
	public String getFlightDest() {
		return flightDest;
	}
	/**
	 * Set Flight
	 * @param destination
	 */
	public void setFlightDest(String flightDest) {
		this.flightDest = flightDest;
	}
	/**
	 * Get Flight
	 * 
	 * @return flight
	 */
	public String getFlightClass() {
		return flightClass;
	}
	/**
	 * Set Flight Class
	 * @param class
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	/**
	 * Calculate Cost of Flight
	 * 
	 * @return flight cost
	 */
	public static void calculateFlightCost() {
		if (FlightGUI.comboBox.getSelectedItem().equals("Dublin")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("50");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Dublin")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("100");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Amsterdam")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("100");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Amsterdam")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("200");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("New York")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("300");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("New York")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("600");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Moscow")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("250");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Moscow")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("500");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Nairobi")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("250");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Nairobi")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("500");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Sidney")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Personal")) {
			FlightGUI.textField.setText("400");
		} else if (FlightGUI.comboBox.getSelectedItem().equals("Sidney")
				&& FlightGUI.comboBox_1.getSelectedItem().equals("Business")) {
			FlightGUI.textField.setText("800");
		}
	}

}
