package org.bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXB {
	
	
	public static void main(String[] args) throws FileNotFoundException, JAXBException {
		
		ATM a = ATM.getInstance();
		System.out.println(a);
		
		
		JAXBContext contextObj = JAXBContext.newInstance(Credentials.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  
	  
	    Credentials emp1=new Credentials("karthi rajan","50000");  
	      
	    marshallerObj.marshal(emp1, new FileOutputStream(".//Files//Credentials.xml"));  
		
		
		
		
		try {
		File file = new File(".//Files//Credentials.xml"); 
		     
	                
	            JAXBContext jaxbContext = JAXBContext.newInstance(Credentials.class);    
	         
	            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
	            Credentials e=(Credentials) jaxbUnmarshaller.unmarshal(file);    
	            System.out.println(e.getUsername()+" "+e.getPassword());  
	              
	          } catch (JAXBException e) {
	        	  e.printStackTrace(); 
	        	  }    
	         
	}  
		
		
	}


