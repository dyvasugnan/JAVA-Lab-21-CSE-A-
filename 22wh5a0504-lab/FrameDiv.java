import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
class FrameDiv extends Frame implements ActionListener
{
    Button b1,b2;
    TextField t1,t2,t3;
    Label l1,l2,l3,l4;
    FrameDiv()
    {
        b1 = new Button("Divide");
        b2 = new Button("Clear");
        l1 = new Label("Enter Number 1");
        l2 = new Label("Enter Number 2");
        l3 = new Label("Result");
        l4 = new Label("");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        this.setLayout(null);

        l1.setBounds(50, 70, 100, 20);
        t1.setBounds(150, 70, 100, 20);

        l2.setBounds(50, 120, 100, 20);
        t2.setBounds(150, 120, 100, 20);

        l3.setBounds(50, 170, 100, 20);
        t3.setBounds(150, 170, 100, 20);

        b1.setBounds(50, 220, 200, 20);
        b2.setBounds(50, 270, 200, 20);

        l4.setBounds(50, 20, 500, 50);

        this.add(b1);
        this.add(b2);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(t1);
        this.add(t2);
        this.add(t3);

        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try {
            String str = ae.getActionCommand();
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a/b;
            if(str == "Divide")
            {
                t3.setText(String.valueOf(c));
                l4.setText("");
            }
            if(str == "Clear")
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                l4.setText("");
            }
        }
        catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Enter integers only");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            l4.setText("Enter integers only");
        }
        catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Division by 0 is not possible");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            l4.setText("Division by 0 is not possible");
        }
        
    }

    public static void main(String[] args) {
        FrameDiv fa = new FrameDiv();
        fa.setTitle("Division");
        fa.setSize(500, 500);
        fa.setVisible(true);

        fa.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}