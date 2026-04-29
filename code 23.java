import java.util.Scanner;
class ThreadOne extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ThreadTwo extends Thread {

    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


public class MultiThreadDemo {
    public static void main(String[] args) {

       
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

       
        t1.start();
        t2.start();
    }
}