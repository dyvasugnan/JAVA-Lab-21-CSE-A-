class Student{
        int age;
        String name;
        Student(int x,String y){
                age = x;
                name = y;
        }
        void display(){
                System.out.println("Age : "+age+"\nName : "+name);
        }
}
class Const1{
        public static void main(String args[]){
                Student s = new Student(15,"abcd");
                s.display();
        }
}
