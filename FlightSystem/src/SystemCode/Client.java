package SystemCode;

/**
 * Client Class
 * 
 * @author Michelle ferry
 * 
 */
import java.util.Calendar;

public class Client {

	/**
	 * Create variables
	 */
	private String fname, lname;
	private String address;
	private Calendar DOB;
	private int telNo;

	/**
	 * Constructor
	 * 
	 * @param first name, last name, address
	 * dob, telno
	 */
	public Client(String fname, String lname, String address, Calendar dob, int telNo) {

		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.DOB = dob;
		this.telNo = telNo;

	}

	/**
	 * Get first name
	 * @return first name
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * set first name
	 * @param first name
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * Get last name
	 * @return last name
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * Set last name
	 * @param last name
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * Get address
	 * @return address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Set Address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Get first name
	 * @return first name
	 */
	public Calendar getDOB() {
		return DOB;
	}
	/**
	 * Set Date of birth
	 * @param dob
	 */
	public void setDOB(Calendar dOB) {
		DOB = dOB;
	}
	/**
	 * Get Tel No
	 * @return tel no
	 */
	public int getTelNo() {
		return telNo;
	}
	/**
	 * set tel no
	 * @param tel no
	 */
	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}
	/**
	 * to string
	 * @return Client to string
	 */
	@Override
	public String toString() {
		return "Client{" + "fname=" + fname + ", lname='" + lname + '\'' + ", DOB=" + DOB + ", telNo='" + telNo + '\''
				+ '}';

	}
}
