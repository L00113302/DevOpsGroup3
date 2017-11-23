package SystemCode;

public class Flight {

	    //variables
		public String flightDest;
		public String flightClass;
		
		// default constructors
		public Flight(){
			
			flightDest ="";
			flightClass = "";
		}
		//constructor
		public Flight(String flightDest, String flightClass){
			
			this.flightDest = flightDest;
			this.flightClass = flightClass;
		}
		public String getFlightDest() {
			return flightDest;
		}
		public void setFlightDest(String flightDest) {
			this.flightDest = flightDest;
		}
		public String getFlightClass() {
			return flightClass;
		}
		public void setFlightClass(String flightClass) {
			this.flightClass = flightClass;
		}
		
	    public static void calculateFlightCost() {
			if(FlightGUI.comboBox.getSelectedItem().equals("Dublin")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("50");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Dublin")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("100");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Amsterdam")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("100");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Amsterdam")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("200");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("New York")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("300");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("New York")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("600");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Moscow")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("250");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Moscow")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("500");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Nairobi")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("250");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Nairobi")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("500");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Sidney")&&FlightGUI.comboBox_1.getSelectedItem().equals("Personal"))
			{
				FlightGUI.textField.setText("400");
			}
			else if(FlightGUI.comboBox.getSelectedItem().equals("Sidney")&&FlightGUI.comboBox_1.getSelectedItem().equals("Business"))
			{
				FlightGUI.textField.setText("800");
			}
		}
		
}
