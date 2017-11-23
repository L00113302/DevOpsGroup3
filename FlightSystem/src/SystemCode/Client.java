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
	
     


   //Methods
   
	     public int getfname() {
	        return fname;
	    }
	   
	    public void setfname(String fname) {
	        this.fname = fname;
	    }

	    public String getlname() {
	        return lname;
	    }

	    public void setlname(String lname) {
	        this.lname = lname;
	    }

	    public Calendar getDOB() {
	        return DOB;
	    }

	    public void setDOB(Calendar DOB) {
	        this.DOB = DOB;
	    }
	
	    public void setDOB(Calendar DOB) {
	        this.DOB = DOB;
	    }
	    
	    public String getTelNo() {
	        return telNo;
	    }

	    public void setTelNo(int telNo) {
	        this.telNo = telNo;
	    }

	
    	    public int selectFlight() {
     

           }

     

           public String selectClass() {

         }

     

          public int viewCost(){
             return cost;  
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

