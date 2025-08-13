package homework_java_introduction_15;

public class Threads_HW3 {

    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(YELLOW + "Thread two is working" + i + RESET);
                }

                Thread thread3 = new Thread(() -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(BLUE + "Thread three is working" + i + RESET);
                    }
                });
                thread3.start();
            });
            thread2.start();
        });
        thread1.start();
        System.out.println(CYAN + "Thread number one has started" + RESET);
    }
}
