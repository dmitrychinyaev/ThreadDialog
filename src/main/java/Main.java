public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group1 = new ThreadGroup("group 1");
        MyThread myThread1 = new MyThread(group1, "Поток 1");
        MyThread myThread2 = new MyThread(group1, "Поток 2");
        MyThread myThread3 = new MyThread(group1, "Поток 3");
        MyThread myThread4 = new MyThread(group1, "Поток 4");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        Thread.sleep(10000);
        group1.interrupt();


    }
}
