public class GetAccountTest{

	public static void main(String[] args){
	
	GetAccount newAccount = new GetAccount("Bessie's Account ",  25.00);

	System.out.println("Balance is " +  newAccount.getBalance());
	
	newAccount.deposit(100.05);
	
	System.out.println("Balance is " + newAccount.getBalance());

	newAccount.setName("Jane's Account");

	System.out.println("Name of the new account is " + newAccount.getName());
	

	}

}