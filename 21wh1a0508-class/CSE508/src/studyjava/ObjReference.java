package studyjava;
import java.util.Scanner;
class Student5 {
    int age;
    String name;

    public Student5(int a, String n) {
        age = a;
        name = n;
    }
    void display() {
        System.out.print(age + " " + name + " ");
    }
}
class ObjReference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student5[] s = new Student5[30];
        for (int i = 0; i < 30; i++) {
            int age;
            String name;
            System.out.print("Enter age: ");
            while (!sc.hasNextInt()) {
                sc.next();
            }
            age = sc.nextInt();
            System.out.print("Enter name: ");
            name = sc.next();
            s[i] = new Student5(age, name);
        }
    }
}
