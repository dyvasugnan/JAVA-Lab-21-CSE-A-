package javalab;
abstract class Bike{
	abstract void run();	
}
class Pulsar extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
 class Abstract {

	public static void main(String[] args) {
		Bike obj = new Pulsar();
		obj.run();
	}
}
