class One{
    int i=10;
   void display(){
    System.out.println(i);
    }
}

class Two extends One{
    int j=20;
    void display(){
    System.out.println(j);
    super.display();
    }
    void multiply(){
        int p = super.i*j;
        System.out.println(p);
    }
}

class Three extends Two{
    int k= 30;
    void display(){
    System.out.println(k);
    super.display();
    }
    void multiply(){
        int p = super.i*super.j*k;
        System.out.println(p);
    }
}

class Test{
    public static void main(String args[]){
        Three t = new Three();
        t.display();
        t.multiply();
    }
}

