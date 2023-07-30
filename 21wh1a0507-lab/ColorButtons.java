package java_codes;
import java.awt.*;//
import java.awt.event.*;
public class ColorButtons extends Frame implements ActionListener{
	Button b1,b2,b3;
	  ColorButtons()
	  {
	     this.setLayout(null);
	     b1 = new Button("Red");
	     b2 = new Button("Blue");
	     b3 = new Button("Green");
	     b1.setBounds(100, 150, 100, 50);
	     b2.setBounds(100, 250, 100, 50);
	     b3.setBounds(100, 350, 100, 50);
	     this.add(b1);
	     this.add(b2);
	     this.add(b3);
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     b3.addActionListener(this);
	  }
	  public void actionPerformed(ActionEvent ae)
	  {
	   String str = ae.getActionCommand();
	   if(str == "Red")
	     this.setBackground(Color.RED);
	   if(str == "Blue")
	    this.setBackground(Color.BLUE);
	   if(str == "Green")
	    this.setBackground(Color.GREEN);
	  }
		
	 public static void main(String[] args) {
	  ColorButtons c = new ColorButtons();
	  c.setTitle("Test");
	  c.setSize(400, 400);
	  c.setVisible(true);
	  c.addWindowListener(new WindowAdapter() {
	   public void windowClosing(WindowEvent we) {
	    System.exit(0);
	   }
	  });
	 }
}
