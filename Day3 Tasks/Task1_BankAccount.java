public class Task1_BankAccount {
    private String name;
    private double balance;

    public Task1_BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance");
        }
    }

    public void showBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Task1_BankAccount account = new Task1_BankAccount("Alice", 1000);
        account.showBalance();
        account.deposit(200);
        account.withdraw(150);
        account.showBalance();
    }
}
