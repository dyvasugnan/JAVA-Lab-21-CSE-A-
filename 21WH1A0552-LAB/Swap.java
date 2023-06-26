import java.util.*;
 class Demo{
       int n1,n2;
       Demo(int a,int b){
           n1 = a;
           n2 = b;
       }
       void swap(Demo d){
         int t = d.n1;
         d.n1 = d.n2;
         d.n2 = t;
      }
  }
 class Swap{
      public static void main(String args[]){
              int x,y;
              System.out.print("ENter two numbers : ");
              Scanner sc = new Scanner(System.in);
              x = sc.nextInt();
             y = sc.nextInt();
             Demo d = new Demo(x,y);
              System.out.println("Before Swapping : "+d.n1+" "+d.n2);
             d.swap(d);
             System.out.println("After Swapping : "+d.n1+" "+d.n2);
             }
 }

