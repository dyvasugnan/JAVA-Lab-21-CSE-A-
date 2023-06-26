import java.util.*;
class Student{
        String name;
        int marks;
        Student(String name,int marks){
                this.name = name;
                this.marks = marks;
                System.out.println("Name : "+name+"\nMarks : "+marks);
        }
}
public class Try{
        public static void main(String args[]){
                Student s[] = new Student[30];
                Scanner sc = new Scanner(System.in);
                for(int i=0;i<2;i++){
                        String name;
                        int marks;
                        System.out.print("Enter name & marks : ");
                        name = sc.nextLine();
                        marks = sc.nextInt();
                        sc.nextLine();
                        s[i] = new Student(name,marks);
                }
        }
}
