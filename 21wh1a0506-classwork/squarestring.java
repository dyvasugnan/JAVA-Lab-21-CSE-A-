package javaclass;
import java.lang.*;
import java.util.*;
public class SquareString{
           public static void main(String args[]){
                      Scanner sc = new Scanner(System.in);
                      int t=sc.nextInt();
                      while(t!=0){
                                 t--;
                                 String str = sc.next();
                                 int count=0;
                                 int middle = str.length() /2;
                                 if(str.length()==1)
                                 System.out.println("NO");
                                 else if(str.length()%2==0){
                                            for(int i=0;i<middle;i++){
                                                       if(str.charAt(i)==str.charAt(middle+i)){
                                                                  count++;
                                                       }
                                            }
                                            if(count==middle)
                                            System.out.println("YES");
                                            else
                                            System.out.println("NO");
                                 }
                                 else
                                 System.out.println("NO");
                      }
           }
}
