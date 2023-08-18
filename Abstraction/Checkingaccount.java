package Bankaccount;

public class Checkingaccount extends Bankaccount {
	protected double overdraftlimit;

	public Checkingaccount(String accountNumber, String accountHoldername, double balance, double overdraftlimit) {
		super(accountNumber, accountHoldername, balance);
		this.overdraftlimit = overdraftlimit;
		System.out.println("AccountNumber: "+ accountNumber);
		System.out.println("AccountHolderName: "+ accountHoldername);
		System.out.println("AccountBalance: "+ balance);
	}
	public void deposit(double amount)
	{
		System.out.println("The amount to be deposited"+ amount);
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposit Successful");
		}else
		{
			System.out.println("Invalid amount");
		}
		System.out.println("The updated balance is "+ balance);
	}
	public void withdraw(double amount)
	{
		System.out.println("The amount to be withdrawed"+ amount);
		if(amount>0 && amount<balance && amount<=overdraftlimit)
		{
			balance-=amount;
			System.out.println("Withdraw Successful");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else if(amount>overdraftlimit)
		{
			System.out.println("Amount exceeded the limit");
		}
		else
		{
			System.out.println("Invalid amount");
		}
		System.out.println("The updated balance is "+ balance);
	}
}
