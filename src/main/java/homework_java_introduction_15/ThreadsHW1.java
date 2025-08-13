package homework_java_introduction_15;

public class ThreadsHW1 {

    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(YELLOW + "Thread 1 ---> iteration #" + (i + 1) + RESET);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(BLUE + "Thread 2 ---> iteration #" + (i + 1) + RESET);
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(PURPLE + "Thread 3 ---> iteration #" + (i + 1) + RESET);
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        thread3.start();
    }

}
