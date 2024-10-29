import java.util.ArrayList;

public class Bank {
	
	String name;
	
	ArrayList<User> users;
	
	ArrayList<Account> accounts;
	
	public String createUID() {
		
		int numCounter = 1;
		
		String userID = String.format("%04d", numCounter++);
		
		return userID;
	}
	
	public String createAccUID() {
		
		return "";
	}

}
