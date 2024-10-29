import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Bank bnk = new Bank();
		
		User use = new User("Sifiso", "Hadebe", "082528", bnk.createUID());
		User use2 = new User("John", "Doe", "084856", bnk.createUID());
		
		System.out.print("First Name: " +use.fName
    			+"\nLast Name: " +use.lName 
    			+"\nNumber: " +use.phoneNumber 
    			+"\nUserID: " +use.uid +"\n");
		System.out.println("***********");
		System.out.print("First Name: " +use2.fName
    			+"\nLast Name: " +use2.lName 
    			+"\nNumber: " +use2.phoneNumber 
    			+"\nUserID: " +use2.uid);
		
	}
	

}
