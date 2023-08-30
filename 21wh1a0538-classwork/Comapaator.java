package classprogram;
import java.util.*;
class Employee{
	String name;
	int rollno;
	Employee(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
}
class CompareName implements Comparator<Employee>{
    public int compare(Employee a,Employee b) {
		return a.name.compareTo(b.name);
	}
}
public class Comapaator {
public static void main(String args[]) {
	ArrayList<Employee>a = new ArrayList<Employee>();
	a.add(new Employee("sai",1234));
	a.add(new Employee("aswetha",5678));
	a.add(new Employee("thiru",9867));
	Collections.sort(a,new CompareName());
	for(int i = 0;i<a.size();i++)
	{
		System.out.print(a.get(i).name);
		System.out.print(a.get(i).rollno);
	}
}
}
