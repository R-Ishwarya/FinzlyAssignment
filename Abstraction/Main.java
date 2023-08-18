package Bankaccount;

public class Main {

	public static void main(String[] args) {
		Savingsaccount o1 = new Savingsaccount("123456","Ishwarya",10000,5);
		
		o1.deposit(5000);
		o1.withdraw(2000);
		Checkingaccount o2 = new Checkingaccount("654321","Ambika",5000,2000);
		o2.deposit(5000);
		o2.withdraw(3000);
		
		

	}

}
