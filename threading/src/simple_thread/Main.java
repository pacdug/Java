package simple_thread;

public class Main {
    public static void main(String[] args) {
        numberGenerator generator1 = new numberGenerator();
        numberGenerator generator2 = new numberGenerator();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);


        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
