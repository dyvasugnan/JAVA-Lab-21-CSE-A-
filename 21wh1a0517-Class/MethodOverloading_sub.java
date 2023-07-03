package javalab;

class Sub{
	int sub(int x,int y) {
		return(x-y);
	}
	float sub(float x,float y) {
		
		return(x-y);
	}
	long sub(long x, long y) {
		return(x-y);
	}
}
public class MethodOverloading_sub {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		System.out.println(s.sub(5, 4));
		System.out.println(s.sub(52.01f,41.04f));
		System.out.println(s.sub(451, 15201));
	}

}
