import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Transation {
	
    ArrayList<String> transactionId;
    String[] transactionType;  // e.g., Deposit, Withdrawal
    int index;
    private Account account;
    String date;
    User accUser;
    
    public Transation(String transId, int index, Account account, String dateTime, User accUser) {
    	transactionId.add(transId);
    	transactionType = new String[] {"Deposit", "Withdrawal"};
    	this.index = index;
    	this.account = account;
    	date = dateTime;  
    	this.accUser = accUser;
    }
    
    public String getTransaction() {
    	return transactionType[index];
    }
    
    public void setTransaction(String value) {
    	transactionType[index] = value;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            account.updateBalance(amount);
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= account.getBalance()) {
            account.updateBalance(-amount);
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

}
