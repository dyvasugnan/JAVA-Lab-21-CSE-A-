package javaclasswork;
class Fibonacci{  
	    static void Fibonacci(int N)
	    {
	        int num1 = 0, num2 = 1;
	 
	        int i = 0;
	 
	        while (i < N) {
	
	            System.out.print(num1 + " ");
	            int num3 = num2 + num1;
	            num1 = num2;
	            num2 = num3;
	            i = i + 1;
	        }
	    }
	
	    public static void main(String args[]) {
	    
	        int N = 10;
	        Fibonacci(N);
	    }
	}