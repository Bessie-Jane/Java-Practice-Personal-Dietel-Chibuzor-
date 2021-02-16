public class Account{
	
	private int balance = 190;
	private int pin = 1111;

public int getAccountBalance(){

	return accountBalance; 
	}

public void withdrawMoney(int amountToWithdraw, int pin){
	if(pin == 1111){
	accountBalance = accountBalance - amountToWithdraw;
	}

	if(pin != 1111){
	System.out.println("Ole, your pin is wrong!");
	}

}

















}





















}
	
























