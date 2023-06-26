package cs;

public  class Student{
	int age;
	float marks;
	String name;
	Student get_age(int x){
		age = x;
		return this;
	}
	Student get_marks(float y){
		marks = y;
		return this;
	}

	Student get_name(String z){
		name =z;
		return this;
	}


	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		  s1.get_age(19).get_name("Ashwitha").get_marks(200f);
		 System.out.println(s1.age+" "+s1.name+" "+s1.marks);


	}
}
