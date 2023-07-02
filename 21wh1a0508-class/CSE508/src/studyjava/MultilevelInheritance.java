package studyjava;
import java.io.*;
import java.lang.*;
import java.util.*;
	  
	class one {
	    public void print_A()
	    {
	        System.out.println("one");
	    }
	}
	  
	class two extends one {
	    public void print_B() { System.out.println("two"); }
	}
	  
	class three extends two {
	    public void print_C()
	    {
	        System.out.println("three");
	    }
	}
	  

public class MultilevelInheritance {
	    public static void main(String[] args)
	    {
	        three g = new three();
	        g.print_A();
	        g.print_B();
	        g.print_C();
	    }
	}

