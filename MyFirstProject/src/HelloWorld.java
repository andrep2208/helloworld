import helloworld.Account;

public class HelloWorld{
	
	public static void main(String[] args) {
		// Create account object for John
		Account johnAccount = new Account();
		// Create account object for Mary
		Account maryAccount = new Account();
		
		// Set the account fee
		Account.fee = 12.40;
		
		// Display account fees
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
		// Change account fee
		Account.fee = 6.20;
		
		// Display account fees again
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
		
		
		
	}

	


}


