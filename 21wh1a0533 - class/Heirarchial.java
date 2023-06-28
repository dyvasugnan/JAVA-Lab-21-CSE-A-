package javaclass;
class One {
	void show1(int x) {
		   System.out.println("x :"+x);
		 }
		}

		//Parent class inheriting from the grandparent class
class Two extends One {
	void show2(int x) {
		     System.out.println("x :"+x);
		 }
		}
		//Child class inheriting from the parent class
class Three extends One {
		 void show3(int x) {
		     System.out.println("x :"+x);
		 }
		}
class Heirarchial{
public static void main(String args[]){
			 Two t = new Two();
		     Three th = new Three();
		     t.show1(10);
		     t.show1(20);
		     th.show1(30);
		     th.show3(40);
		 }
		}


