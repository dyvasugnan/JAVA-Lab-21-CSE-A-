package javagui3;

public class MultipleThread extends Thread {
    public void run() {
        task1();
        task2();
        task3();
    }
    public void task1() {
        System.out.println("Thread1 is executed");
    }

    public void task2() {
        System.out.println("Thread2 is executed");
    }

    public void task3() {
        System.out.println("Thread3 is executed");
    }
}