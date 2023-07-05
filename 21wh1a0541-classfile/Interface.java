package javaprograms;
interface Connect{
    void connect();
    void disconnect();
}
class Oracle implements Connect{
    public void connect() {
        System.out.println("Connecting (Oracle) database.");
    }
    public void disconnect() {
        System.out.println("Disconnecting (Oracle) database.");
    }
}
class Mysql implements Connect{
    public void connect() {
        System.out.println("Connecting (Mysql) database.");
    }
    public void disconnect() {
        System.out.println("Disconnecting (Mysql) database.");
    }
}
public class Interface {
    public static void main(String[] args) {
    	Oracle c = new Oracle();
        c.connect();
        c.disconnect();
        Mysql s = new Mysql();
        s.connect();
        s.disconnect();
    }
}
