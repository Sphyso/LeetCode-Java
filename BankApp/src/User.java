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
    
    
private static void addUser() {
	String fname, lname, phone, userID;
	
	Scanner input = new Scanner(System.in);
	Bank bnk = new Bank();
	User addU;
	
	System.out.println("***** Save New User *****");
	System.out.print("Enter you First Name: ");
	fname = input.nextLine();
	System.out.print("Enter you Last Name: ");
	lname = input.nextLine();
	System.out.print("Enter you phone number: ");
	phone = input.nextLine();
	userID = bnk.createUID();
	
	addU = new User(fname, lname, phone, userID);
	
	System.out.println("***** New User Added *****");
	
	System.out.print("First Name: " +addU.fName 
			+"\nLast Name: " +addU.lName 
			+"\nNumber: " +addU.phoneNumber 
			+"\nUserID: " +addU.uid);
}


}
