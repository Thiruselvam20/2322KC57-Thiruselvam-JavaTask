#  Multithreaded Banking Application

##  Project Description

This Java mini-project simulates a **banking system where multiple users (threads) attempt to withdraw funds from the same account**. It demonstrates the concepts of thread synchronization and concurrency control in a simple banking scenario. 

Each user runs in a separate thread and attempts to withdraw a specified amount from a shared account balance. The program ensures thread safety and prevents overdrawing by using synchronized methods.

---

##  How Concurrency is Handled

- **Synchronized Methods**: The `withdraw()` method in the `BankAccount` class is synchronized, ensuring that only one thread can access and modify the balance at a time.
- **Simulated Delays**: `Thread.sleep()` is used to introduce a delay and mimic real-time transaction processing.
- **Thread Names**: Each thread (user) is named to clearly identify its activity in the console.
- **Runnable Interface**: Users are represented as `Runnable` tasks, giving flexibility for future enhancements.

---

## Sample Output Screenshot

Below is an actual output screenshot showing how the application coordinates access between multiple threads and displays the transaction status:

![Sample Output](Screenshot%202025-06-25%20115239.png)

> Ensure this image is uploaded in your GitHub repository root folder, so it renders correctly in the README.

---

##  How to Run

### Prerequisites:
- Java installed (JDK 8 or higher)
- Terminal or IDE (Eclipse, IntelliJ, or VS Code)

### Compile the Code:
```bash
javac PostAssessement_BankingApp.java
