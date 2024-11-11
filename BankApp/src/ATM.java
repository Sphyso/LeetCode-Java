import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Bank bnk = new Bank();
		
		//Add new user
		User use = new User("Sifiso", "Hadebe", "082528", bnk.createUID());
		User use2 = new User("John", "Doe", "084856", bnk.createUID());
		//Add account for user
		Account account = new Account(bnk.createAccNum(), 0, 0.00, use);
		
		System.out.println("Account houlder: " +use.fName +" " +use.lName
				+"\nAccount Number: " +account.accountNumber
				+"\nAccount Type: " + Arrays.toString(account.accountType)
				+"\nBalance: " +account.balance);
		
		
		/*Printing User
		 * System.out.print("First Name: " +use.fName
    			+"\nLast Name: " +use.lName 
    			+"\nNumber: " +use.phoneNumber 
    			+"\nUserID: " +use.uid +"\n");
		System.out.println("***********");
		System.out.print("First Name: " +use2.fName
    			+"\nLast Name: " +use2.lName 
    			+"\nNumber: " +use2.phoneNumber 
    			+"\nUserID: " +use2.uid);*/
		
	}
	

}
