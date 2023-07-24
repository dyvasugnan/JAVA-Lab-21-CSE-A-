package classnotes_programs;

class Super{
    void display(){
        System.out.println("SUPER CLASS");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("SUB CLASS");
    }
}
class Overriding
{
	public static void main(String[] args) {
		Sub s = new Sub();
		s.display();
	}
}




/*class Overriding {

	public static void main(String[] args) {
		

	}

}*/
