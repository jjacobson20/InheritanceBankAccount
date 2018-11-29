/**
 * 
 * @author jeremy
 * Period 6
 * Bank Account
 *
 */

public class BankAccount
{
	private double balance;
	
	public BankAccount(double bal)
	{
		balance = bal;
	}
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdrawal(double amt)
	{
		balance -= amt;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
