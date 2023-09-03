class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++)
            System.out.print(i+" ");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        t.start();
        System.out.println(t);
    }
}
