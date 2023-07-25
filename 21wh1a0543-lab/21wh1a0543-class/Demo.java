package classnotes_programs;

class Student {
	int age;
	float marks;

void display() {
	
	age = 19;
	marks = 45.14f;

	System.out.println(age);
	System.out.println(marks);
}
}




class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();

	}
}
