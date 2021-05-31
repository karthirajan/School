package org.bank;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Credentials {
	
	private String Username;
	private String password;
	
	public Credentials() {
		
	}  
	
	
	public Credentials( String Username, String pass) {  
	    super();  
	      
	    this.Username = Username;  
	    this.password = pass;  
	}

	@XmlElement 
	public String getUsername() {
		return Username;
	}


	public void setUsername(String name) {
		this.Username = name;
	}

	@XmlElement 
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}  
	
	

}
