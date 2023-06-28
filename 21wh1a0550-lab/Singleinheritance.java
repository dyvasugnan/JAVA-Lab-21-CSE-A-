package javalab;
class Doctor{
	float salary=50000;
}
class Surgeon extends Doctor{
	float bonus=20000;
}

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Surgeon s = new Surgeon();
		System.out.println("salary of surgeon"+s.salary);
		System.out.println("salary of surgeon"+s.bonus);

	}

}
