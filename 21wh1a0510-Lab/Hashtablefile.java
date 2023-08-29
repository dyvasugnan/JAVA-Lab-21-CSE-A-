package Javaclss;
import java.util.*;
import java.io.*;

class EmployeeData {
    private Hashtable<String, String> employeeSalaryData = new Hashtable<>();

    public EmployeeData(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Scanner sc = new Scanner(fis);
            
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] str = s.split(",");
                if (str.length == 3) {
                    employeeSalaryData.put(str[0], str[1]);
                }
            }
            
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Hashtable<String, String> getEmployeeSalaryData() {
        return employeeSalaryData;
    }
}
public class Hashtablefile {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData("C:\\Users\\91707\\eclipse-workspace\\JavaLab\\src\\Javaclss\\employee.txt");
        Hashtable<String, String> ht = employeeData.getEmployeeSalaryData();
        Enumeration<String> e = ht.keys(); 
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            String value = ht.get(key);
            System.out.println("Employee: " + key + ", Salary: " + value);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Number : ");
        String s1 = scanner.next();
        if (ht.containsKey(s1)) {
            String s2 = ht.get(s1);
            System.out.println("Salary: " + s2);
        } else {
            System.out.println("Details not found!!!");
        }
    }
}


