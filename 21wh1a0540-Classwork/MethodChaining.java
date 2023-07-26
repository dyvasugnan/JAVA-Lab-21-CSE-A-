package javaclass;

public class MethodChaining {
	public static void main(String args[])   
	{  
	Std student = new Std();  
	//method chaining  
	student.setId(500).setName("xyz").detail();  
	}  

}
class Std  
{  
int id;      
 String name;  
 int age;  
 int std;  
public Std setId(int id)   
{  
this.id = id;  
//"this" (the current Student object) to allow for further chained method calls  
return this;  
}  
public Std setName(String name)   
{  
this.name = name;  
return this;  
}  

public void detail()   
{  
System.out.println("Student Detail is:\n");  
System.out.println("Id: "+id+ "\nName: "+name);  
}  

}  

