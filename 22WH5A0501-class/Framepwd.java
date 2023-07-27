import java.awt.*;
import java.awt.event.*;
public class Framepwd extends Frame implements ActionListener {
    TextField un,pwd;
    Label l1,l2;
    Framepwd(){
        this.setLayout(new FlowLayout());
        un = new TextField("user name",20);
        pwd  = new TextField(20);
        pwd.setEchoChar('*');
        l1 = new Label("user name");
        l2 = new Label("password",Label.LEFT);
        add(l1);
        add(un);
        add(l2);
        add(pwd);
        un.addActionListener(this);
        pwd.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        Graphics g = this.getGraphics();
        g.drawString("User Name: "+un.getText(),100,100);
        g.drawString( "Password: "+pwd.getText(),100,200);        
    }
    public static void main(String[] args) {
        Framepwd f = new Framepwd();
        f.setTitle("Test");
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
