package javalab;

public class Supr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// super = 	keyword refers to the superclass (parent) of an object
				
				Job a = new Job("Abc",42,"Employee");
				Job b = new Job("Xyz",43,"Carpenter");
				
				System.out.println(a.toString()+"\n");
				System.out.println(b.toString()+"\n");
				
			}
		}


		class Person {
			String name;
			int age;
			
			Person(String name,int age){
				this.name = name;
				this.age = age;
			}
			
			//toString can be used to make methods
			public String toString() {
				return "Name: "+this.name + "\n" +"Age: "+ this.age + "\n";
			}
			
		}
		
		
		class Job extends Person{


			String work;
			
			//this super calls the parent constructor
			Job(String name,int age,String work){	
				super(name,age);
				this.work = work;
			}
			
			//here by using super...you are referring to parent class method
			public String toString() {
				return super.toString()+"Job: "+this.work;
			}
		}

	