package cs;

public class MultCatch {
	public static void main(String[] args) {
		
	
	try{
		int a[] = {1,2,3};
		System.out.println(a[3]);
		String s = "Ashwitha";
		System.out.println(s.charAt(9));
	}
	catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();
	}
	catch(StringIndexOutOfBoundsException e1){
		e1.printStackTrace();
	}

	
	finally{
		System.out.println("Remaining part");
		System.out.println("finally block");
	}
	
}


		
	
} 
