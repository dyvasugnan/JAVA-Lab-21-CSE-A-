import java.awt.*;
import java.awt.event.*;
public class AddGui extends Frame implements ActionListener{
    Button b1;
    TextField t1,t2,res;
    Label l1,l2,result;
    AddGui(){
        this.setLayout(null);
        b1=new Button("add");
        l1=new Label("Number1");
        l2=new Label("Number 2");
        result =new Label("result");
        t1=new TextField();
        t2=new TextField();
        res=new TextField();
        l1.setBounds(100,150,100,50);
        t1.setBounds(200,150,100,50);
        l2.setBounds(100,250,100,50);
        t2.setBounds(200,250,100,50);
        result.setBounds(100,350,100,50);
        res.setBounds(200,350,100,50);
        b1.setBounds(150,450,100,50);
        this.add(b1);
        this.add(l1);
        this.add(l2);
        this.add(res);
        this.add(t1);
        this.add(t2);
        this.add(res);
        b1.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		res.addActionListener(this);

        
    }
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str == "Add") {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = a+b ;
            res.setText(String.valueOf(c));
        }
            
        }

    public static void main(String[] args) {
        AddGui f = new AddGui();
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