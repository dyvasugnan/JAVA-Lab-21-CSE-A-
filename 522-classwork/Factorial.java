package javaclass;
import java.awt.*;
import java.awt.event.*;
public class Factorial extends Frame implements ActionListener{
    Button b1, b2;
    TextField compute, clear, result;
    Label num1, res, infoLabel;
    
    Factorial(){
        b1 = new Button("Compute");
        b2 = new Button("Clear");
        num1 = new Label("Enter a Number:");
        res = new Label("Factorial:");
        infoLabel = new Label("Factorial Calculator");
        compute = new TextField();
        clear = new TextField();
        result = new TextField();
        
        
        num1.setBounds(50, 100, 150, 20);
        compute.setBounds(200, 100, 150, 20);
        
        res.setBounds(400, 100, 150, 20);
        result.setBounds(550, 100, 150, 20);
        
        infoLabel.setBounds(150, 50, 150, 20);
        
        
        b1.setBounds(100, 200, 100, 30);
        b2.setBounds(220, 200, 100, 30);
        
        this.add(b1);
        this.add(b2);
        this.add(num1);
        this.add(compute);
        this.add(res);
        this.add(result);
        this.add(infoLabel);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Compute")){
            int n = Integer.parseInt(compute.getText());
            int fact = 1;
            for(int i = 1; i <= n; i++) {
                fact *= i;
            }
            result.setText(String.valueOf(fact));
        }
        else if(str.equals("Clear")){
            compute.setText("");
            result.setText("");
        }
    }
    
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.setTitle("Factorial Calculator");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}