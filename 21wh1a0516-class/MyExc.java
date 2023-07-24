package cs;
class MyExc extends Exception{
	int accno[] = {101,102,103,104};
	String name[] = {"abc","bcd","cde","efg"};
	static double bal[] = {900,1000,500,1000};
	MyExc(String s){
		super(s);
	}


	public static void main(String[] args) {
		try{
			for(int i=0;i<4;i++){
				if(bal[i]<1000){
					MyExc m = new MyExc("Insufficient bal");
					throw m;
				}
			}
		}
		catch(MyExc e){
			System.out.println(e);;
		}
	
	}
}
