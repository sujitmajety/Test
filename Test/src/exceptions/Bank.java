package exceptions;

public class Bank {
	private double amount = 50000.00;
	public void withdraw(double withdrawlAmount) throws MinimumBalanceViolation{
		double remainingAmount = amount-withdrawlAmount;
		if(remainingAmount<10000.00){
			throw new MinimumBalanceViolation("Minimum Balance should be 10000 Rupees");
		}
		else{
			amount=remainingAmount;
			System.out.println("Withdrawl Succesful");
		}
	}
	public void printBalance(){
		System.out.println("Your Account Holds : "+amount);
	}
}
