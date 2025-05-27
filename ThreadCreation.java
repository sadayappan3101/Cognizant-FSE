class MyThread implements Runnable {
    private String message;
    public MyThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Hello from Thread 1"));
        Thread t2 = new Thread(new MyThread("Hello from Thread 2"));
        t1.start();
        t2.start();
    }
}
