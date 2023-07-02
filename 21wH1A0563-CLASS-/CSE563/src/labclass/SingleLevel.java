package labclass;
import java.lang.*;
public class SingleLevel {
	 public static void main(String args[]){
	        Derived obj = new Derived();
	        obj.setx(10);
	        obj.display();
	    }
}
	class BaseClass{
	    int x;
	    void setx(int i){
	        x=i;
	        System.out.println(x);
	        System.out.println("Base class");
	    }
}
	class Derived extends BaseClass{
	    void display(){
	        System.out.println("Derived class");
	    }

}	

