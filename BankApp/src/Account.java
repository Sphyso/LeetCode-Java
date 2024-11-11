import java.util.ArrayList;

public class Account {
	
    String accountNumber;
    String[] accountType;  // e.g., Savings, Checking
    double balance;
    User accountHolder;   // Association with User class
    
    Bank bnk = new Bank();
    
    public Account(String accNum, int index, double bal, User accHolder) {
    	accountNumber = accNum;
    	accountType = new String[] {"Savings", "Checking"};
    	balance = bal;
    	accountHolder = accHolder;
    	
    }
	

}
