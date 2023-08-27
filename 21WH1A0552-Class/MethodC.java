import java.util.*;
class Student{
        int a,b;
        Student setData(int x,int y){
                a = x; b = y;
                return this;
        }
        Student getData(){
                System.out.println(a);
                System.out.println(b);
                return this;
        }
}
class MethodC{
        public static void main(String args[]){
                Student s = new Student();
                s.setData(10,11).getData().setData(30,40).getData();
        }
}
