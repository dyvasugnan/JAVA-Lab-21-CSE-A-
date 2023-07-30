package javaClass;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, neg, plus, minus, div, square, sqrt, dot, reciprocal,mod, mul, equal, clear, delete;
    Label l;
    TextField t;
    int result;
    Calculator() {
        this.setLayout(null);
        this.setSize(800, 800);
        this.setTitle(" My Calculator");
        this.setBackground(Color.WHITE);
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
        plus = new Button("+");
        minus = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        dot = new Button(".");
        mod = new Button("%");
        equal = new Button("=");
        clear = new Button("Clear");
        delete = new Button("Delete");
        square = new Button("x\u00b2");
        reciprocal = new Button("1/x");
        sqrt = new Button("\u221A");
        neg = new Button("(-)");
        l = new Label("Enter :");
        t = new TextField();
        l.setBounds(10,40,200,20);
        t.setBounds(15,60,270,35);
        b0.setBounds(15,410,60,40);
        b1.setBounds(15,360,60,40);
        b2.setBounds(85,360,60,40);
        b3.setBounds(155,360,60,40);
        b4.setBounds(15,290,60,40);
        b5.setBounds(85,290,60,40);
        b6.setBounds(155,290,60,40);
        b7.setBounds(15,230,60,40);
        b8.setBounds(85,230,60,40);
        b9.setBounds(155,230,60,40);
        plus.setBounds(225,290,60,40);
        minus.setBounds(225,170,60,40);
        mul.setBounds(225,230,60,40);
        div.setBounds(225,110,60,40);
        neg.setBounds(85,410,60,40);
        delete.setBounds(155,110,60,40);
        clear.setBounds(85,110,60,40);
        mod.setBounds(15,110,60,40);
        equal.setBounds(225,350,60,100);
        dot.setBounds(155,410,60,40);
        sqrt.setBounds(15,170,60,40);
        square.setBounds(85,170,60,40);
        reciprocal.setBounds(155,170,60,40);
        this.add(neg);
        this.add(l);
        this.add(t);
        this.add(b0);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(plus);
        this.add(minus);
        this.add(mul);
        this.add(div);
        this.add(clear);
        this.add(delete);
        this.add(equal);
        this.add(square);
        this.add(dot);
        this.add(reciprocal);
        this.add(sqrt);
        this.add(mod);
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
        plus.addActionListener(this);
        minus.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        clear.addActionListener(this);
        equal.addActionListener(this);
        t.addActionListener(this);
        delete.addActionListener(this);
        square.addActionListener(this);
        reciprocal.addActionListener(this);
        sqrt.addActionListener(this);
        dot.addActionListener(this);
        neg.addActionListener(this);
        mod.addActionListener(this);
        this.setBackground(Color.black);

    }
    String str = "";
public void actionPerformed(ActionEvent ae) {
        try {
            String s = ae.getActionCommand();
            char ch;
            if (ae.getSource() == b1) {
                str += "1";
                t.setText(str);
            } else if (ae.getSource() == b2) {
                str += "2";
                t.setText(str);
            } else if (ae.getSource() == b3) {
                str += "3";
                t.setText(str);
            } else if (ae.getSource() == b4) {
                str += "4";
                t.setText(str);
            } else if (ae.getSource() == b5) {
                str += "5";
                t.setText(str);
            } else if (ae.getSource() == b6) {
                str += "6";
                t.setText(str);
            } else if (ae.getSource() == b7) {
                str += "7";
                t.setText(str);
            } else if (ae.getSource() == b8) {
                str += "8";
                t.setText(str);
            } else if (ae.getSource() == b9) {
                str += "9";
                t.setText(str);
            } else if (ae.getSource() == b0) {
                str += "0";
                t.setText(str);
            } else if (ae.getSource() == plus) {
                ch = '+';
                str += ch;
                t.setText(str);
            } else if (ae.getSource() == minus) {
                ch = '-';
                str += ch;
                t.setText(str);
            } else if (ae.getSource() == mul) {
                ch = '*';
                str += ch;
                t.setText(str);
            } else if (ae.getSource() == div) {
                ch = '/';
                str += ch;
                t.setText(str);
            }else if(ae.getSource( ) == mod){
            	ch = '%';
            	str += ch;
            	t.setText(str);
            } else if (ae.getSource() == equal) {
                result = calculateResult(str);
                t.setText(String.valueOf(result));
                str = "";
            } else if (ae.getSource() == clear) {
                t.setText("");
                str = "";
            } else if (ae.getSource() == delete) {
                if (!str.isEmpty()) {
                    str = str.substring(0, str.length() - 1);
                    t.setText(str);
                }
            } else if (ae.getSource() == dot) {
                if (!str.contains(".")) {
                    str += ".";
                    t.setText(str);
                }
            } else if (ae.getSource() == sqrt) {
                double num1 = Double.parseDouble(t.getText());
                double sqrtValue = Math.sqrt(num1);
                t.setText(String.valueOf(sqrtValue));
            } else if (ae.getSource() == reciprocal) {
                double num1 = Double.parseDouble(t.getText());
                double reciprocalValue = 1 / num1;
                t.setText(String.valueOf(reciprocalValue));
            } else if (ae.getSource() == square) {
                double num1 = Double.parseDouble(t.getText());
                double squareValue = Math.pow(num1, 2);
                t.setText(String.valueOf(squareValue));
            }
        } catch (NumberFormatException nfe) {
            t.setText("Invalid input format.");
        } catch (ArithmeticException a) {
            t.setText("Division by zero is not possible.");
        }
    }
 private int calculateResult(String input) {
        int result = 0;
        		try {
        			String[] parts = input.split("[+\\-*/%]");
        	        String operand1Str = parts[0].trim();
        	        String operand2Str = parts[1].trim();
        	        int num1 = Integer.parseInt(operand1Str);
        	        int num2 = Integer.parseInt(operand2Str);
        	        char operator = input.charAt(operand1Str.length());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Division by zero is not possible.");
                    }
                    break;
                case '%':
                	if(num2 != 0) {
                		result = num1 % num2;
                	}else {
                		throw new ArithmeticException("Modulo by Zero is not possible");
                	}
                	break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        } catch (NumberFormatException nfe) {
            t.setText("Invalid input format.");
        }
        return result;
    }
 public static void main(String args[]) {
        Calculator c = new Calculator();
        c.setVisible(true);
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}