public class Task2_MultiMessage implements Runnable {
    private String message;

    public Task2_MultiMessage(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + ": " + message);
    }

    public static void main(String[] args) {
        
        Task2_MultiMessage msg1 = new Task2_MultiMessage("Hello from Thread 1!");
        Task2_MultiMessage msg2 = new Task2_MultiMessage("Welcome from Thread 2!");
        Task2_MultiMessage msg3 = new Task2_MultiMessage("Goodbye from Thread 3!");

        
        Thread t1 = new Thread(msg1, "T1");
        Thread t2 = new Thread(msg2, "T2");
        Thread t3 = new Thread(msg3, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
