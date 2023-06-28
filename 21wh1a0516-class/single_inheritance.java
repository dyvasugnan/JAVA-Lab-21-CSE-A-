class One{
    int i;
    One(){
        i=10;
    }
void display(){
 System.out.println(i);
 }

 }

 class Two extends One{
    int j;
    Two(){
        j = 20;
    }
    void display(){
    super.display();
    System.out.println(j);
    }
}

public class single_inheritance{
    public static void main(String args[]){
        Two t = new Two();
        t.display();
    }
}
