package com.lbrce.cseaproject;
import java.util.ResourceBundle;

public class UserValidation {
	
		public boolean check(String inUID,String inPSW)
		{
			System.out.println("Cseaproject");
			ResourceBundle rb=ResourceBundle.getBundle("config");
			String UID=rb.getString("uname");
			String PSW=rb.getString("psw");
			if(inUID.equals(UID)&&inPSW.equals(PSW))
				return true;
			else
				return false;
			
			
		}

}


