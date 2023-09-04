package javagui3;

public class Reserve implements Runnable {
  int avl = 1;
  int wanted;
 public Reserve(int n) {
     wanted = n;
 }
 public void run() {
     synchronized (this) {
         for (int i = 1; i <= 10; i++) {
             if (avl >= wanted) {
                 System.out.println(wanted + " berth reserved by " + Thread.currentThread().getName());
                 try {
                     Thread.sleep(200);
                     avl = avl - wanted;
                 } catch (InterruptedException ie) {
                 }
             } else {
                 System.out.println("Sorry, " + Thread.currentThread().getName() + " cannot reserve.");
             }
         }
     }
 }
}
