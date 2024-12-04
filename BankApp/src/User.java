import java.util.Scanner;

public class User {
	
	String fName;
    String lName;
    String phoneNumber;
    String uid;
    
    Bank bnk = new Bank();
	
    public User(String fName, String lName, String num, String uid) {
    	this.fName = fName;
    	this.lName = lName;
    	this.phoneNumber = num;
    	this.uid = bnk.createUID();
    }


}
