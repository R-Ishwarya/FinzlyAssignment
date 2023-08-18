package problem2;
import java.util.Scanner;
public class BankAccount {
	private long accountnumber;
	private String ownername;
	private double balance;
	
	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
		
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
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
	}
	public void withdraw(double amount)
	{
		System.out.println("The amount to be withdrawed"+ amount);
		if(amount>0 && amount<balance)
		{
			balance-=amount;
			System.out.println("Withdraw Successful");
		}
		else if(amount>balance) {
			System.out.println("Insufficient balance");
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	public void getbalance()
	{
		System.out.println("The remaining balance is "+ balance);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount object = new BankAccount();
		object.setAccountnumber(746568247);
		object.setOwnername("ishwarya");
		System.out.println("Account Number: "+ object.getAccountnumber());
		System.out.println("Owner Name: "+ object.getOwnername());
		object.setBalance(500);
		System.out.println("The initial Balance: "+ object.getBalance());
		object.deposit(100);
		object.withdraw(100);
		object.getbalance();
		
		

	}

}
