import java.util.ArrayList;

public class Account {
	
    String accountNumber;
    double checkingBalance;
    double savingsBalance;
    User accountHolder;   // Association with User class
    
    Bank bnk = new Bank();
    
    public Account(String accNum, double checkingBal, double savingBal, User accHolder) {
    	accountNumber = accNum;
    	checkingBalance = checkingBal;
    	savingsBalance =savingBal;
    	accountHolder = accHolder;
    	
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
