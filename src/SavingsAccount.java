/**
 * 
 * @author jeremy
 * Period 6
 * Savings Account
 *
 */

public class SavingsAccount extends BankAccount
{
	
	private final double INT_RATE = 1.25;
	private int transactionCount = 0;
	
	public SavingsAccount(double bal)
	{
		// call the super class's constructor and pass bal to it
		super(bal);
	}
	
	public void addInterest()
	{
		deposit(INT_RATE * getBalance());
	}
	
	public void deposit(double amt)
	{
		super.deposit(amt);
		transactionCount++;
	}
	
}