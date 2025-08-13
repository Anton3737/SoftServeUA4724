package homework_java_introduction_15;

public class Deadlock_HW2 {

    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {
        final Object lock1 = "Lock №1";
        final Object lock2 = "Lock №2";

        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(YELLOW + "Thread 1: locked lock1" + RESET);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock2) {
                    System.out.println(YELLOW + "Thread 1: locked lock2" + RESET);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(BLUE + "Thread 2: locked lock2" + RESET);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                synchronized (lock1) {
                    System.out.println(BLUE + "Thread 2: locked lock1" + RESET);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
