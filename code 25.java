import java.util.Scanner;
class Table {

    
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " : " + n + " x " + i + " = " + (n * i));

            try {
                Thread.sleep(200); // small delay to show effect clearly
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class MyThread extends Thread {

    Table t;
    int number;

    MyThread(Table t, int number, String name) {
        this.t = t;
        this.number = number;
        setName(name);
    }

    public void run() {
        t.printTable(number);
    }
}


public class SyncTableDemo {
    public static void main(String[] args) {

        Table obj = new Table();

        
        MyThread t1 = new MyThread(obj, 5, "Thread-5");
        MyThread t2 = new MyThread(obj, 7, "Thread-7");

        t1.start();
        t2.start();
    }
}