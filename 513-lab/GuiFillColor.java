package javalab;
import java.awt.*;// abstract window toolkit
import java.awt.event.*;
public class GuiFillColor extends Frame implements ActionListener{
		// TODO Auto-generated method stub
				Button b1,b2,b3,b4,b5,b6,b7;
				GuiFillColor(){
					this.setLayout(null);
					b1 = new Button("Red");
					b2 = new Button("Yellow");
					b3 = new Button("Green");
					b4 = new Button("Blue"); 
					b5 = new Button("Black");
					b6= new Button("White");
					b7 = new Button("Pink");
					b1.setBounds(100, 150, 100, 50); //x,y(position) and (length and width of button)
					b2.setBounds(200, 200, 100, 50);
					b3.setBounds(300, 250, 100, 50);
					b4.setBounds(400, 300, 100, 50);
					b5.setBounds(300, 350, 100, 50);
					b6.setBounds(200, 400, 100, 50);
					b7.setBounds(100, 450, 100, 50);
					this.add(b1); //to put in the window
					this.add(b2);
					this.add(b3);
					this.add(b4);
					this.add(b5);
					this.add(b6);
					this.add(b7);
					b1.addActionListener(this); //link the task of the button
					b2.addActionListener(this);
					b3.addActionListener(this);
					b4.addActionListener(this);
					b5.addActionListener(this);
					b6.addActionListener(this);
					b7.addActionListener(this);
							}
				public void actionPerformed(ActionEvent ae) {
					String str = ae.getActionCommand();
					if(str == "Red")
							this.setBackground(Color.RED);
					if(str == "Yellow")
						this.setBackground(Color.YELLOW);
				
					if(str == "Green")
						this.setBackground(Color.GREEN);
					if(str == "Blue")
						this.setBackground(Color.BLUE);
					if(str == "Black")
						this.setBackground(Color.BLACK);
					if(str == "White")
						this.setBackground(Color.WHITE);
					if(str == "Pink")
						this.setBackground(Color.PINK);
				
				}
			
			public static void main(String[] args) {
				GuiFillColor f = new GuiFillColor();
				f.setTitle("Filing Colors ");
				f.setSize(600, 600);
				f.setVisible(true);
				f.addWindowListener(new WindowAdapter() { //for closing, u passed an abstract class as an obj to use the abstract method,by JVMs anonymous inner class  
					public void windowClosing(WindowEvent we) {
						System.exit(0);
					}
				});
			}
		

	}


