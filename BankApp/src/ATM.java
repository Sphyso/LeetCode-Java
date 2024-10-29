import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		addNewUser();
		
	}
	
    public static void addNewUser() {
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
