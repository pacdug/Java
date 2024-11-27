package create_thread_using_runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo demo1 = new RunnableDemo("Thread-1-HR-Database") ;
        demo1.start();

        RunnableDemo demo2 = new RunnableDemo("Thread-2-Send-Email") ;
        demo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
