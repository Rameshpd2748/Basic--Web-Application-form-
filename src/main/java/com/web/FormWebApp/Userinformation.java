package com.web.FormWebApp;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myTable")
public class Userinformation {
	
	     @Id 
	     @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long UID;
        public long getUID() {
			return UID;
		}
		public void setUID(long uID) {
			UID = uID;
		}
		private String UsrName;
        private String UsrEmail;
        private String Password;
        private int Gender;
        private String[] hobby;
        private String message;
        
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getUsrName() {
			return UsrName;
		}
		public void setUsrName(String usrName) {
			UsrName = usrName;
		}
		public String getUsrEmail() {
			return UsrEmail;
		}
		public void setUsrEmail(String usrEmail) {
			UsrEmail = usrEmail;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public int getGender() {
			return Gender;
		}
		public void setGender(int gender) {
			Gender = gender;
		}
		public String[] getHobby() {
			return hobby;
		}
		public void setHobby(String[] hobby) {
			this.hobby = hobby;
		}
		@Override
		public String toString() {
			return "Userinformation [UsrName=" + UsrName + ", UsrEmail=" + UsrEmail + ", Password=" + Password
					+ ", Gender=" + Gender + ", hobby=" + Arrays.toString(hobby) + "]";
		}
        
        
}
