package clss;
class Employee {
    String name;
    int monthlySalary;
    Employee(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }
    void calculateSalary() {
        System.out.println("Calculating salary of " + name);
    }
}
class Manager extends Employee {
    int bonus;

    Manager(String name, int monthlySalary, int bonus) {
        super(name, monthlySalary);
        this.bonus = bonus;
    }
    void calculateSalary() {
        int totalSalary = monthlySalary + bonus;
        System.out.println("Total salary of " + name + " (Manager): " + totalSalary);
    }
}
class Developer extends Employee {
    int overtimePay;

    Developer(String name, int monthlySalary, int overtimePay) {
        super(name, monthlySalary);
        this.overtimePay = overtimePay;
    }
    void calculateSalary() {
        int totalSalary = monthlySalary + overtimePay;
        System.out.println("Total salary of " + name + " (Developer): " + totalSalary);
    }
}


public class main {

	public static void main(String[] args) {
		Employee emp1 = new Manager("Raghava", 5000, 1000);
        Employee emp2 = new Developer("Janaki", 4000, 500);
        emp1.calculateSalary(); 
        emp2.calculateSalary();
	}

}
