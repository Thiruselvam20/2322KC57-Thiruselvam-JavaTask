public class PostAssessement_BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance

        Thread user1 = new Thread(new WithdrawTask(account, 700), "User-1");
        Thread user2 = new Thread(new WithdrawTask(account, 500), "User-2");
        Thread user3 = new Thread(new WithdrawTask(account, 300), "User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " is attempting to withdraw ₹" + amount);

        if (balance >= amount) {
            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted for " + threadName);
            }

            balance -= amount;
            System.out.println(threadName + " successfully withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println(threadName + " failed to withdraw ₹" + amount + ". Insufficient Balance: ₹" + balance);
        }
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}
