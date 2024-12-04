import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Bank bnk = new Bank();
		
		//Add new user
		User use = new User("Sifiso", "Hadebe", "082528", bnk.createUID());
		User use2 = new User("John", "Doe", "084856", bnk.createUID());
		//Add account for user
		Account account = new Account(bnk.createAccNum(), 20000.00, 5000.00, use);
		Account account2 = new Account(bnk.createAccNum(), 0.00, 10000.00, use2);
		//Add transaction
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String formattedDate = dateTime.format(formatDate);
		
		Transation trans1 = new Transation(bnk.createTransactionID(), account, formattedDate, use);
		Transation trans2 = new Transation(bnk.createTransactionID(), account2, formattedDate, use2);
		
		
		//Transactions
		trans1.deposit(2500.00, "Savings");
		trans2.withdraw(5000.00, "Savings");
		trans2.deposit(5000.00, "Checking");
		
		
		
		
		///*Print Account
		System.out.println("Account holder: " +use.fName +" " +use.lName
				+"\nAccount Number: " +account.accountNumber
				+"\nChecking Balance: " +account.getCheckingBalance() 
				+"\nSaving Balance: " +account.getSavingBalance()+"\n");
		System.out.println("***********");
		System.out.println("Account holder: " +use2.fName +" " +use2.lName
				+"\nAccount Number: " +account2.accountNumber
				+"\nChecking Balance: " +account2.getCheckingBalance() 
				+"\nSaving Balance: " +account2.getSavingBalance()+"\n");//*/
		
		
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
