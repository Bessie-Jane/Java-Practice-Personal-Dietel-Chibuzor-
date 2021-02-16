public class AccountTest{
	
	public static void main(String[] args){

	Account chijiokeAccount = new Account("Chijioke, 1);

	System.out.println("Chijioke's current balance is"+ chijiokeAccount.getAccountBalance());

	chijiokeAccount.amountToWithdraw(100, 1431);

	int balance = chijiokeAccount.getAccountBalance(); 

	System.out.println("Chijioke's current balance is"+ balance());

}

}