import java.util.*;
import java.lang.*;
import java.io.*;
class Student1
{
    String name;
    int id;
    double gpa;
    Student1(String name, int id, double gpa)
    {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
}

class HelloWorld
{
    public static void main(String args[])
    {
        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);;
        int n = sc.nextInt();
        Student1 s[] = new Student1[n];
        for(int i=0;i<n;i++)
        {
            String name = sc.next();
            int id = sc.nextInt();
            double gpa = sc.nextDouble();
            s[i] = new Student1(name, id, gpa);
        }
        int max= 0;
        for(int i=0;i<n;i++)
        {
            if(s[max].gpa < s[i].gpa)
                max = i;
        }
        System.out.println(s[max].name);
        System.out.println(s[max].id);
        System.out.println(s[max].gpa);
       
    }
}
