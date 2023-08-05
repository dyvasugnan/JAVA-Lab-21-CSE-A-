interface Hello{
    void greet();

}
class Wish implements Hello{
    public void greet(){
        System.out.println("Hello everyone");
    }
}
class Interface{
    public static void main(String[] args){
    /* 
        Wish w = new Wish();
        w.greet();
    */
        Hello h;
        Wish w=new Wish();
        h = w;
        h.greet();
    

    }
}