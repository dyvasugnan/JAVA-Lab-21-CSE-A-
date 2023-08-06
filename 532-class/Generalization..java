class Parent{
	int i=10;
	public void display(){
		System.out.println("Parent class");
	}
}
class child extends Parent{
	int j= 20;
	public void display(){
		System.out.println("Child class");
	}
}
class Generalization {
	public static void main(String[] args) {
	Parent p = new child();
	p.display(); // child classs(overridden)
	System.out.println(p.i);
	// error - System.out.println(p.j); 
	}

}
