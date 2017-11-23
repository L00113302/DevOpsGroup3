package SystemCode;

import java.util.Calendar;

public class Client {

    private String fname, lname;
    private String address;
    private Calendar DOB;
    private int telNo;

    
    public Client() {}
    
    
	public Client(String fname, String lname, String address, Calendar dob, int telNo){
		
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.DOB = DOB;
		this.telNo = telNo;
		
	}
	

     

           public String getFname() {
				return fname;
			}


			public void setFname(String fname) {
				this.fname = fname;
			}


			public String getLname() {
				return lname;
			}


			public void setLname(String lname) {
				this.lname = lname;
			}


			public String getAddress() {
				return address;
			}


			public void setAddress(String address) {
				this.address = address;
			}


			public Calendar getDOB() {
				return DOB;
			}


			public void setDOB(Calendar dOB) {
				DOB = dOB;
			}


			public int getTelNo() {
				return telNo;
			}


			public void setTelNo(int telNo) {
				this.telNo = telNo;
			}


    
    @Override
    public String toString() {
        return "Client{" +
                "fname=" + fname +
                ", lname='" + lname + '\'' +
                ", DOB=" + DOB +
                ", telNo='" + telNo + '\'' +
                '}';

 
    }
}

