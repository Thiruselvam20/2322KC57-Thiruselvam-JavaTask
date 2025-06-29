public class Task3_ThreadCoordination extends Thread {
    private String threadName;

    public Task3_ThreadCoordination(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }

    public static void main(String[] args) {
        Task3_ThreadCoordination t1 = new Task3_ThreadCoordination("Thread A");
        Task3_ThreadCoordination t2 = new Task3_ThreadCoordination("Thread B");

        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        t2.start();
    }
}
