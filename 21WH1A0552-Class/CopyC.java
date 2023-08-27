import java.util.*;
class Person{
        int age;
        String name;
        Person(int n,String x){
                age = n;
                name = x;
                System.out.println(age);
                System.out.println(name);
        }
        Person(Person p){
                age = p.age;
                name = p.name;
        }
}
class CopyC{
        public static void main(String args[]){
                Person x = new Person(20,"abcd");
                Person y = new Person(30,"efgh");
        }
}
