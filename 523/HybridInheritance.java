package javaclss;
import java.lang.*;

		class A{
		    int a=2;
		    int b=4;
		    int s=a+b;
		    void display(){
		        System.out.println("a+b= "+s);
		    }
		    }
		class B extends A{
		    int d=a-b;
		    void display(){
		        System.out.println("a-b= "+d);
		        
		    }
		}
		class C extends A{
		    int c=b*a;
		    void display(){
		        super.display();
		    System.out.println("a*b= "+c);
		    
		}
		}

		public class HybridInheritance {
			public static void main(String[] args){
				B b=new B();
		        b.display();
		        C c=new C();
		        c.display();
		    }
		}

