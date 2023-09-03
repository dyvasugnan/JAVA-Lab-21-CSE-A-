public class MyThread extends Thread{
    public void run()
    {
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(i+ " ");
        }
    }
}

class ThreadDemo
{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        System.out.println(t);
    }
}
