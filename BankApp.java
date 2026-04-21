import java.util.HashMap;
import java.util.Scanner;

class Account {
    static int idCounter = 1001;

    int accountNumber;
    String username;
    int pin;   // changed to PIN
    double balance;
    StringBuilder transactions;

    Account(String username, int pin) {
        this.accountNumber = idCounter++;
        this.username = username;
        this.pin = pin;
        this.balance = 0;
        this.transactions = new StringBuilder();
    }
}

class BankService {
    HashMap<Integer, Account> accounts = new HashMap<>();

    // Create Account
    void createAccount(String username, int pin) {
        if (pin < 1000 || pin > 9999) {
            System.out.println("PIN must be 4 digits!");
            return;
        }

        Account acc = new Account(username, pin);
        accounts.put(acc.accountNumber, acc);

        System.out.println("Account created!");
        System.out.println("Your Account Number: " + acc.accountNumber);
    }

    // Login
    Account login(int accNo, int pin) {
        Account acc = accounts.get(accNo);

        if (acc != null && acc.pin == pin) {
            return acc;
        }
        return null;
    }

    void deposit(Account acc, double amount) {
        acc.balance += amount;
        acc.transactions.append("Deposited: " + amount + "\n");
    }

    void withdraw(Account acc, double amount) {
        if (acc.balance - amount >= 500) {
            acc.balance -= amount;
            acc.transactions.append("Withdrawn: " + amount + "\n");
        } else {
            System.out.println("Minimum balance should be 500!");
        }
    }

    void showBalance(Account acc) {
        System.out.println("Balance: " + acc.balance);
    }

    void showTransactions(Account acc) {
        System.out.println(acc.transactions);
    }
}


public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while (true) {
            System.out.println("\n1.Create 2.Login 3.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Username: ");
                String u = sc.next();
                System.out.print("Set 4-digit PIN: ");
                int pin = sc.nextInt();

                bank.createAccount(u, pin);

            } else if (choice == 2) {
                System.out.print("Account Number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter PIN: ");
                int pin = sc.nextInt();

                Account user = bank.login(accNo, pin);

                if (user != null) {
                    while (true) {
                        System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.History 5.Logout");
                        int ch = sc.nextInt();

                        if (ch == 1) {
                            System.out.print("Amount: ");
                            bank.deposit(user, sc.nextDouble());

                        } else if (ch == 2) {
                            System.out.print("Amount: ");
                            bank.withdraw(user, sc.nextDouble());

                        } else if (ch == 3) {
                            bank.showBalance(user);

                        } else if (ch == 4) {
                            bank.showTransactions(user);

                        } else {
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid Account Number or PIN!");
                }

            } else {
                break;
            }
        }
    }
}