/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
package javagui;

import java.awt.*;

import java.awt.event.*;

public class FactorialGui extends Frame implements ActionListener{

	Button com, clear;

	TextField f1, f2;

	Label n, res;

	FactorialGui(){

		this.setLayout(null);

		com = new Button("Compute"); 

		clear = new Button("Clear");

		n = new Label("Number");

		res = new Label("Result");

		f1 = new TextField();

		f2 = new TextField();

		com.setBounds(250,350,100,50);

		clear.setBounds(450,350,100,50);

		n.setBounds(250,300,100,50);

		res.setBounds(450,300,100,50);

		f1.setBounds(250,250,100,50);

		f2.setBounds(450,250,100,50);

		this.add(com);

		this.add(clear);

		this.add(n);

		this.add(res);

		this.add(f1);

		this.add(f2);

		com.addActionListener(this);

		clear.addActionListener(this);

		f1.addActionListener(this);

		f2.addActionListener(this);

	}

		

		public void actionPerformed(ActionEvent ae) {

			String str = ae.getActionCommand();

			if(str=="Compute") {

				int n = Integer.parseInt(f1.getText());

				int ans = 1;

				for(int i =1; i<=n; i++) {

					ans *= i;

				}

				f2.setText(String.valueOf(ans));

			}

			if(str == "Clear") {

				f1.setText("");

				f2.setText("");

			}

	}

		public static void main(String[] args) {

			FactorialGui f = new FactorialGui();

			f.setTitle("Factorial");

			f.setSize(600, 600);

			f.setVisible(true);

			f.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent we) {

					System.exit(0);

				}

			});

		}



}