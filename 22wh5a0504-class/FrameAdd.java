import java.awt.*;
import java.awt.event.*;
class FrameAdd extends Frame implements ActionListener
{
    Button b1,b2;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    FrameAdd()
    {
        b1 = new Button("Add");
        b2 = new Button("Clear");
        l1 = new Label("Enter Number 1");
        l2 = new Label("Enter Number 2");
        l3 = new Label("Result");
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        this.setLayout(null);

        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);

        l2.setBounds(50, 100, 100, 20);
        t2.setBounds(150, 100, 100, 20);

        l3.setBounds(50, 150, 100, 20);
        t3.setBounds(150, 150, 100, 20);

        b1.setBounds(50, 200, 200, 20);
        b2.setBounds(50, 250, 200, 20);

        this.add(b1);
        this.add(b2);
        this.add(l1);
        this.add(l2);
        this.add(l3);
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
        String str = ae.getActionCommand();
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        if(str == "Add")
        {
            t3.setText(String.valueOf(c));
        }
        if(str == "Clear")
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {
        FrameAdd fa = new FrameAdd();
        fa.setTitle("Addition");
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