package javaclass;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CalciWindowLayoutGui {
	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double res;
	String operation;
	String answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//  Create the application.
	
	public Calci() {
		initialize();
	}

	
	 // Initialize the contents of the frame.
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 440, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.BOLD, 27));
		textField.setBounds(10, 0, 402, 79);
		textField.setBackground(Color.GRAY);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setBounds(10, 90, 93, 79);
		btnBackspace.setBackground(Color.LIGHT_GRAY);
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 27));
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setBounds(10, 180, 93, 79);
		btn7.setFont(new Font("Verdana", Font.BOLD, 27));
		btn7.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn7);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setBounds(10, 359, 93, 79);
		btn1.setFont(new Font("Verdana", Font.BOLD, 27));
		btn1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setBounds(10, 270, 93, 79);
		btn4.setFont(new Font("Verdana", Font.BOLD, 27));
		btn4.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn4);
		
		JButton btnNewButton_1_1_1 = new JButton("1");
		btnNewButton_1_1_1.setBounds(10, 449, 93, 79);
		btnNewButton_1_1_1.setFont(new Font("Verdana", Font.BOLD, 27));
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(113, 90, 93, 79);
		btnClear.setFont(new Font("Verdana", Font.BOLD, 27));
		btnClear.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setBounds(113, 180, 93, 79);
		btn8.setFont(new Font("Verdana", Font.BOLD, 27));
		btn8.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setBounds(113, 270, 93, 79);
		btn5.setFont(new Font("Verdana", Font.BOLD, 27));
		btn5.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setBounds(113, 359, 93, 79);
		btn2.setFont(new Font("Verdana", Font.BOLD, 27));
		btn2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btnDot.getText();
				textField.setText(num);
			}
		});
		btnDot.setBounds(113, 449, 93, 79);
		btnDot.setFont(new Font("Verdana", Font.BOLD, 27));
		btnDot.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn00.getText();
				textField.setText(num);
			}
		});
		btn00.setBounds(216, 90, 93, 79);
		btn00.setFont(new Font("Verdana", Font.BOLD, 27));
		btn00.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setBounds(216, 180, 93, 79);
		btn9.setFont(new Font("Verdana", Font.BOLD, 27));
		btn9.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setBounds(216, 270, 93, 79);
		btn6.setFont(new Font("Verdana", Font.BOLD, 27));
		btn6.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num=textField.getText()+btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setBounds(216, 359, 93, 79);
		btn3.setFont(new Font("Verdana", Font.BOLD, 27));
		btn3.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					res=first+second;
					answer=String.format("%.2f",res);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					res=first-second;
					answer=String.format("%.2f",res);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					res=first*second;
					answer=String.format("%.2f",res);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					res=first/second;
					answer=String.format("%.2f",res);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					res=first%second;
					answer=String.format("%.2f",res);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setBounds(216, 449, 93, 79);
		btnEqual.setFont(new Font("Verdana", Font.BOLD, 27));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setBounds(319, 90, 93, 79);
		btnPlus.setFont(new Font("Verdana", Font.BOLD, 27));
		btnPlus.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.setBounds(319, 180, 93, 79);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Verdana", Font.BOLD, 27));
		btnSub.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMultiply.setBounds(319, 270, 93, 79);
		btnMultiply.setFont(new Font("Verdana", Font.BOLD, 27));
		btnMultiply.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setBounds(319, 359, 93, 79);
		btnDivide.setFont(new Font("Verdana", Font.BOLD, 27));
		btnDivide.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setBounds(319, 449, 93, 79);
		btnPercent.setFont(new Font("Verdana", Font.BOLD, 27));
		btnPercent.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnPercent);
	}
}
