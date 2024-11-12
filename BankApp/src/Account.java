import java.util.ArrayList;

public class Account {
	
    String accountNumber;
    String[] accountType;  // e.g., Savings, Checking
    double balance;
    User accountHolder;   // Association with User class
    int index;
    
    Bank bnk = new Bank();
    
    public Account(String accNum, int index, double bal, User accHolder) {
    	accountNumber = accNum;
    	accountType = new String[] {"Savings", "Checking"};
    	this.index = index;
    	balance = bal;
    	accountHolder = accHolder;
    	
    }
    
    public String getValue() {
    	return accountType[index];
    }
    
    public void setValue(String value) {
    	accountType[index] = value;
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public void updateBalance(double amount) {
        this.balance += amount;
    }
	

}
