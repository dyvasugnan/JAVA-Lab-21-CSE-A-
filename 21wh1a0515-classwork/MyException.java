package javalab;
class MyException1 extends Exception{
	public MyException1(String str){
		super(str);
	}
}
public class MyException{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int accNo[]= {101,102,103,104,105};
			String name[]= {"abc","def","ghi","jkl","mno"};
			double balance[]= {5000,500,1000,2000,3000};
			for(int i=0;i<5;i++) {
				System.out.println(accNo[i]+" "+name[i]+" "+balance[i]);
				if(balance[i]<1000) {
					MyException1 me=new MyException1("min balance");
					throw me;
				}
			}
		}
		catch(MyException1 me) {
			System.out.println(me);
		}
		
	}

}
