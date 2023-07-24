import java.util.*;

//multiple inheritance
interface Father{
    int ht=6;
    void h1();//un implemented method
}
interface Mother{
    int ht=8;
    void h2();

}
class child implements Father,Mother{
    
    public void ht1(){
        System.out.println("mother "+Mother.ht);
    }
    public void ht2(){
        System.out.println("Father "+Father.ht);
    }
}
public class MultipleInherit{
    public static void main(String[] args) {
        child obj=new child();
        obj.ht1();
        obj.ht2();
    }
}