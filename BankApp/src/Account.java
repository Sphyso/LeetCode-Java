import java.util.ArrayList;

public class Account {
	
    String accountNumber;
    String[] accountType;  // e.g., Savings, Checking
    double checkingBalance;
    double savingsBalance;
    User accountHolder;   // Association with User class
    int index;
    
    Bank bnk = new Bank();
    
    public Account(String accNum, int index, double checkingBal, double savingBal, User accHolder) {
    	accountNumber = accNum;
    	accountType = new String[] {"Savings", "Checking"};
    	this.index = index;
    	checkingBalance = checkingBal;
    	savingsBalance =savingBal;
    	accountHolder = accHolder;
    	
    }
    
    //Used to select account type
    public String getValue() {
    	return accountType[index];
    }
    
    //For selecting account type.
    public void setValue(String value) {
    	accountType[index] = value;
    }
    
    public double getCheckingBalance() {
    	return checkingBalance;
    }
    
    public double getSavingBalance() {
    	return savingsBalance;
    }
    
    public void updateCheckingBalance(double amount) {
        this.checkingBalance += amount;
    }
    
    public void updateSavingBalance(double amount) {
        this.savingsBalance += amount;
    }
	

}
