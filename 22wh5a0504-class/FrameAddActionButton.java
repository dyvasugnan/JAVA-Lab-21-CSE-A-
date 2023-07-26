import java.awt.*;
import java.awt.event.*;

class FrameAddActionButton extends Frame implements ActionListener
{
    Button b1,b2,b3;
    FrameAddActionButton()
    {
        b1 = new Button("Red");
        b2 = new Button("Yellow");
        b3 = new Button("Green");

        //setting boundary
        //this.setLayout(new FlowLayout());
        this.setLayout(null);
        b1.setBounds(50,50,100,20);
        b2.setBounds(50,100,100,20);
        b3.setBounds(50,150,100,20);
        
        //Adding buttons to frame
        this.add(b1);
        this.add(b2);
        this.add(b3);

        //Adding action
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str = ae.getActionCommand();
        if(str == "Red")
        {
            this.setBackground(Color.RED);
        }
        if(str == "Yellow")
        {
            this.setBackground(Color.YELLOW);
        }
        if(str == "Green")
        {
            this.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        FrameAddActionButton fb = new FrameAddActionButton();
        fb.setTitle("Adding Bg colour");
        fb.setSize(500,500);
        fb.setVisible(true);
        fb.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}