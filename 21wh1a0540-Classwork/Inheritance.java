package javaClass;

class One{
	void put1() {
		System.out.println("CLASS one");
	}
}

class Two extends One{
	void put2() {
		System.out.println("CLASS two");
	}
}

class Four extends One{
	void put4() {
		System.out.println("CLASS four");
	}
}


class Five extends Two{
	void put5() {
		System.out.println("CLASS five");
	}
}

class Three extends Two{
	void put3() {
		System.out.println("CLASS three");
	}
}



public class Inheritance {
public static void main(String args[]) {
	//single level inheritance
	Two t=new Two();
	t.put1();
	t.put2();
	//hierarchical inheritance
	Four f=new Four();
	f.put1();
    //f.put2();//error-Four can not access Two here
	f.put4();
	//multilevel inheritance
	Three th=new Three();
	th.put1();
	th.put2();
	th.put3();
	//Hybrid inheritance
    Five fi=new Five();
    fi.put5();
    fi.put2();
    //fi.put4();//error-can not reference Four here
    fi.put1();	
    }
}
