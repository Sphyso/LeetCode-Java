import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Transation {
	
    String transactionId;
    private Account account;
    String date;
    User accUser;
    
    public Transation(String transId, Account account, String dateTime, User accUser) {
    	transactionId = transId;
    	this.account = account;
    	date = dateTime;  
    	this.accUser = accUser;
    }
    
    
    public void deposit(double amount, String accType) {
        if (accType == "Checking") {
        	if (amount > 0) {
                account.updateCheckingBalance(amount);
                System.out.println("Deposited: $" + amount);
            } 
        	else {
                System.out.println("Deposit amount must be positive.");
            }
		} 
        
        else if (accType == "Savings") {
        	if (amount > 0) {
                account.updateSavingBalance(amount);
                System.out.println("Deposited: $" + amount);
            } 
        	else {
                System.out.println("Deposit amount must be positive.");
            }
		}
    	
    	
    }

    public void withdraw(double amount, String accType) {
    	if (accType == "Checking") {
            if (amount > 0 && amount <= account.getCheckingBalance()) {
                account.updateCheckingBalance(-amount);
                System.out.println("Withdrew: $" + amount);
            } 
            else {
                System.out.println("Insufficient balance or invalid amount.");
            }
		} 
    	
    	else if (accType == "Savings") {
			if (amount > 0 && amount <= account.getSavingBalance()) {
                account.updateSavingBalance(-amount);
                System.out.println("Withdrew: $" + amount);
            } 
			else {
                System.out.println("Insufficient balance or invalid amount.");
            }
			
		}
    	

    }

}
