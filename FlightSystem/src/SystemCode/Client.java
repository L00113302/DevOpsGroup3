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
	 * @param fname first name
	 * @param lname last name
	 * @param address address
	 * @param dob date of birth
	 * @param telNo telephone number
	 * customer details
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
	 * @param fname
	 * set first name
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
	 * @param lname
	 * Set last name
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
	 * @param address
	 * Set Address
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
	 * @param dOB
	 * Set Date of birth
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
	 * @param telNo
	 * set tel no
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
