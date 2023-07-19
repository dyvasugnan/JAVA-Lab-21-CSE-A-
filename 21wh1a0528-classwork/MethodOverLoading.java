import java.util.*;
 class Add{
    public void add(int x,int y){
        System.out.println(x+y);
    }
    public void add(int x,int y,int z){
        System.out.println(x+y);
    }
    public void add(double x,double y,double z){
        System.out.println(x+y+z);
    }
    public void add(float x,float y){
        System.out.println(x+y);
    }
 }
 class MethodOverLoading{
    public static void main(String args[]){
        Add a = new Add();
        a.add(2,4);
        a.add(2.5f,3.5f);
        a.add(1.3,3.3,5.6);
    }
 }