package problem2;
import java.util.*;
public class customeraccount {
	private int accountNumber;
    private String accountHolder;
    private double balance;
    public customeraccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", balance=" + balance + "]";
    }
    public static void main(String[] args) {
        ArrayList<customeraccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
boolean check=true;
        while (check) {
        	System.out.println();
            System.out.println("***Bank Application***");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter account holder's name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    accounts.add(new customeraccount(accountNumber, accountHolder, initialBalance));
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    for (customeraccount account : accounts) {
                        if (account.getAccountNumber() == depositAccountNumber) {
                            account.deposit(depositAmount);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    for (customeraccount account : accounts) {
                        if (account.getAccountNumber() == withdrawAccountNumber) {
                            account.withdraw(withdrawAmount);
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    int checkAccountNumber = scanner.nextInt();
                    for (customeraccount account : accounts) {
                        if (account.getAccountNumber() == checkAccountNumber) {
                            System.out.println("Account balance: " + account.getBalance());
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("List of Accounts:");
                    for (customeraccount account : accounts) {
                        System.out.println(account);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    check=false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

