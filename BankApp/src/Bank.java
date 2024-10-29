import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Bank {
	
	String name;
	
	ArrayList<User> users;
	
	ArrayList<Account> accounts;
	
	ArrayList<String> userIDTracker = new ArrayList<String>();
	
	public String createUID() {
		
		Random random = new Random();
        int userID = 100000 + random.nextInt(900000);
        
        String stUserID = Integer.toString(userID);
        
		for (int x = 0; x < userIDTracker.size(); x++) {
			if(userIDTracker.get(x) != stUserID) {
				return stUserID;
			} else{
			    userID = 100000 + random.nextInt(900000);
		        stUserID = Integer.toString(userID);
		        
			}
			
		}
		
		return stUserID;
	}
	
	public String createAccUID() {
		
		return "";
	}

}
