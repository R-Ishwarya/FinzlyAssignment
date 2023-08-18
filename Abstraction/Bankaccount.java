package Bankaccount;
public abstract class Bankaccount {
   protected String accountNumber;
   protected String accountHoldername;
   protected double balance;
public Bankaccount(String accountNumber, String accountHoldername, double balance) {
	this.accountNumber = accountNumber;
	this.accountHoldername = accountHoldername;
	this.balance = balance;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountHoldername() {
	return accountHoldername;
}
public void setAccountHoldername(String accountHoldername) {
	this.accountHoldername = accountHoldername;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public abstract void deposit(double amount);
public abstract void withdraw(double amount);

}
