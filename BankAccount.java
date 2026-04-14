import java.util.Scanner;

public class BankAccount {

    private double balance;  
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Welcome to the Bank!");

        System.out.println("Your balance: " + account.getBalance());
        Scanner scanner = new Scanner(System.in);

        boolean continueBanking = true;

        while (continueBanking) {
            System.out.println("What would you like to do?" );
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                int userInput = scanner.nextInt(); 
                
            switch(userInput){
                case 1: 
                    System.out.println("How much are you depositing?");
                    double money = scanner.nextDouble(); 
                    account.deposit(money);
                    System.out.println("Balance after deposit: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    continueBanking = false;
                    break;
            }
             
        }
        /* 
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        */
    }
     
}