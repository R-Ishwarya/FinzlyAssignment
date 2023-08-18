package problem3;
public class Transaction {
	final String tproductkey="product key";
	public Transaction()
	{
		System.out.println("You are using free version, please upgrade");
	}
	public Transaction(String p) {
		if(antivirustransaction(p)==true) {
			System.out.println("Transaction done sucessfully");
			System.out.println("Thank you for choosing the upgraded version of antivirus");
		}
		else {
			System.out.println("Transaction is not done please pay first to activate product key");
		}
	}
	public boolean antivirustransaction(String p)
	{
		if(p==tproductkey)
		{
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Transaction o1 = new Transaction();
		Transaction o2 = new Transaction("product key");
}
}
