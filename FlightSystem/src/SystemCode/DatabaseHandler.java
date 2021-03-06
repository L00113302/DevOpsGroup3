package SystemCode;
/**
 * DatabaseHandler
 *
 * @author 		Mark Glenn
 * L00113302 	Cloud
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("serial")
public class DatabaseHandler extends javax.swing.JFrame {
	// credentials for database including AWS RDS database endpoint and JDBC
	// driver
	/**
	 * Access details for database
	 */
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://devops.clql55s9fxrz.eu-west-1.rds.amazonaws.com";
	final String USER_NAME = "DevOps";
	final String PASSWORD = "groupthree";

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	/**
	 * Connect to database
	 *
	 */
	public void connectToDatabase() {
		try {
			// STEP 1 - Load the JDBC driver
			java.lang.Class.forName(JDBC_DRIVER);
			System.out.println("STEP 1 COMPLETE - Driver Registered...");

			// STEP 2 - Open a connection
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("STEP 2 COMPLETE - Connection obtained...");
			//JOptionPane.showMessageDialog(null,"Connected to Database");
			// STEP 3 - Create Statement object
			stmt = conn.createStatement();
			System.out.println("STEP 3 COMPLETE - Query executed.");
		} catch (ClassNotFoundException e) {			
			//JOptionPane.showMessageDialog(null,"Could not load driver.\n" + e.getMessage());
		} catch (SQLException e) {
			//System.out.print("Connection Error");
		}

	}

	/**
	 * @param query 
	 * create database query
	 */
	public void doQuery(String query) {

		try {
			java.lang.Class.forName(JDBC_DRIVER);
			System.out.println("STEP 1 COMPLETE - Driver Registered...");

			// STEP 1 - Open a connection
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("STEP 2 COMPLETE - Connection obtained...");

			// STEP 2 - Create Statement object
			stmt = conn.createStatement();
			System.out.println("STEP 3 COMPLETE - Statement object created...");

			System.out.println("STEP 4(a) COMPLETE - Query executed and database found...");

			System.out.println("STEP 4(b) COMPLETE - Query executed.");

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}
}// end of class
