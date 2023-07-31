package calculator;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CalculatorGUI extends Frame implements ActionListener{
	
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, clr, res;
	TextField result;
	char op;
	int num1, num2;
	
	CalculatorGUI()
	{
		result = new TextField();
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		badd = new Button("+");
		bsub = new Button("-");
		bmul = new Button("*");
		bdiv = new Button("/");
		clr = new Button("CLEAR");
		res = new Button("=");
		
		this.setLayout(new GridBagLayout());	
		GridBagConstraints g = new GridBagConstraints();
		g.fill = GridBagConstraints.HORIZONTAL;
		//g.anchor = GridBagConstraints.PAGE_END; 
		g.gridx = 0;
		g.gridy = 0;
		g.gridwidth = 4;
		add(result, g);
		g.gridx = 0;
		g.gridy = 1;
		g.gridwidth = 1;
		add(b0, g);
		g.gridx = 1;
		g.gridy = 1;
		add(b1, g);
		g.gridx = 2;
		g.gridy = 1;
		add(b2, g);
		g.gridx = 0;
		g.gridy = 2;
		add(b3, g);
		g.gridx = 1;
		g.gridy = 2;
		add(b4, g);
		g.gridx = 2;
		g.gridy = 2;
		add(b5, g);
		g.gridx = 0;
		g.gridy = 3;
		add(b6, g);
		g.gridx = 1;
		g.gridy = 3;
		add(b7, g);
		g.gridx = 2;
		g.gridy = 3;
		add(b8, g);
		g.gridx = 0;
		g.gridy = 4;
		add(b9, g);
		g.gridx = 3;
		g.gridy = 1;
		add(badd, g);
		g.gridx = 3;
		g.gridy = 2;
		add(bsub, g);
		g.gridx = 3;
		g.gridy = 3;
		add(bmul, g);
		g.gridx = 1;
		g.gridy = 4;
		add(bdiv, g);
		g.gridx = 0;
		g.gridy = 5;
		g.gridwidth = 4;
		add(res, g);
		g.gridx = 2;
		g.gridy = 4;
		g.gridwidth = 2;
		add(clr, g);
		
		
		result.addActionListener(this);
		b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        clr.addActionListener(this);
        res.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		String s1, s2;
		if(ae.getSource() == b0)
		{
			s1 = result.getText();
			s2 = s1 + "0";
			result.setText(s2);	
		}
		if(ae.getSource() == b1)
		{
			s1 = result.getText();
			s2 = s1 + "1";
			result.setText(s2);	
		}
		if(ae.getSource() == b2)
		{
			s1 = result.getText();
			s2 = s1 + "2";
			result.setText(s2);	
		}
		if(ae.getSource() == b3)
		{
			s1 = result.getText();
			s2 = s1 + "3";
			result.setText(s2);	
		}
		if(ae.getSource() == b4)
		{
			s1 = result.getText();
			s2 = s1 + "4";
			result.setText(s2);	
		}
		if(ae.getSource() == b5)
		{
			s1 = result.getText();
			s2 = s1 + "5";
			result.setText(s2);	
		}
		if(ae.getSource() == b6)
		{
			s1 = result.getText();
			s2 = s1 + "6";
			result.setText(s2);	
		}
		if(ae.getSource() == b7)
		{
			s1 = result.getText();
			s2 = s1 + "7";
			result.setText(s2);	
		}
		if(ae.getSource() == b8)
		{
			s1 = result.getText();
			s2 = s1 + "8";
			result.setText(s2);	
		}
		if(ae.getSource() == b9)
		{
			s1 = result.getText();
			s2 = s1 + "9";
			result.setText(s2);	
		}
		if(ae.getSource() == badd)
		{
			op = '+';
			s1 = result.getText();
			num1 = Integer.parseInt(s1);
			s2 = s1 + "+";
			result.setText(s2);	
		}
		if(ae.getSource() == bsub)
		{
			op = '-';
			s1 = result.getText();
			num1 = Integer.parseInt(s1);
			s2 = s1 + "-";
			result.setText(s2);	
		}
		if(ae.getSource() == bmul)
		{
			op = '*';
			s1 = result.getText();
			num1 = Integer.parseInt(s1);
			s2 = s1 + "*";
			result.setText(s2);	
		}
		if(ae.getSource() == bdiv)
		{
			op = '/';
			s1 = result.getText();
			num1 = Integer.parseInt(s1);
			s2 = s1 + "/";
			result.setText(s2);	
		}
		if (s.equals("CLEAR")) {
            result.setText("");
        } 
		if (s.equals("=")) 
		{
            try {
            	s1 = result.getText();
            	String[] arrStr = s1.split("[\\+\\-\\*\\/]");
            	int len = arrStr.length;
            	num2 = Integer.parseInt(arrStr[len-1]);
            	int r = 0;
            	switch(op)
            	{
            	case '+' :
            		r = num1 + num2;
            		break;
            	case '-' :
            		r = num1 - num2;
            		break;
            	case '*' :
            		r = num1 * num2;
            		break;
            	case '/' :
            		r = num1 / num2;
            		break;
            	}
            	result.setText(String.valueOf(r));  	
            }
            catch (Exception ex)
            {
                result.setText("0");
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorGUI cal = new CalculatorGUI();
		cal.setSize(400, 400);
		cal.setTitle("Calculator");
		cal.setVisible(true);
		cal.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}

}
