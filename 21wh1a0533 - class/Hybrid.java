package javaclass;
class Grandparent{
	void show1(int x){
		System.out.println("x :"+x);
	}
}
class Parent1 extends Grandparent {
	void show2(int x) {
		     System.out.println("x :"+x);
		 }
		}
class Parent2 extends Grandparent{
	void show3(int x) {
		     System.out.println("x :"+x);
		 }
		}
class Child extends Parent1{
	void show4(int x) {
		     System.out.println("x :"+x);
		 }
		}
public class Hybrid {
public static void main(String args[]){
	Parent2 p2 = new Parent2();
	Child ch = new Child();
    p2.show1(10);
    p2.show3(20);
    ch.show1(10);
    ch.show2(20);
    ch.show4(30);
	}

}
