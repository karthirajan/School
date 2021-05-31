package org.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","username","password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from table_name");
		
		while(rs.next()){
			
			 String name = rs.getString("Column_name");
			
		}
		
		
		con.close();	
		
	}

}
