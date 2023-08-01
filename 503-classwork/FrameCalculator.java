package calculatorexample;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.*;


public class FrameCalculator extends Frame implements ActionListener {
		
		 Button divButton;
		 TextField inputTextField;
	     Button addButton;
		 Button subButton;
		 Button mulButton;
		 Button zeroButton;
		 Button oneButton;
		 Button twoButton;
		 Button threeButton;
		 Button fourButton;
		 Button fiveButton;
		 Button sixButton;
		 Button sevenButton;
		 Button eightButton;
		 Button nineButton;
		 Button equalButton;
		 Button clearButton;
		FrameCalculator(){
			this.setLayout(null);
			this.setBackground(Color.BLACK);
			divButton = new Button("/");
			addButton  = new Button("+");
			subButton = new Button("-");
			mulButton = new Button("*");
			zeroButton = new Button("0");
			oneButton = new Button("1");
			twoButton = new Button("2");
			threeButton = new Button("3");
			fourButton = new Button("4");
			fiveButton = new Button("5");
			sixButton = new Button("6");
			sevenButton = new Button("7");
			eightButton = new Button("8");
			nineButton = new Button("9");
			equalButton = new Button("=");
			clearButton = new Button("C");
			inputTextField = new TextField();
			this.add(addButton);
			this.add(divButton);
			this.add(subButton);
			this.add(mulButton);
			this.add(zeroButton);
			this.add(oneButton);
			this.add(oneButton);
			this.add(twoButton);
			this.add(threeButton);
			this.add(fourButton);
			this.add(fiveButton);
			this.add(sixButton);
			this.add(sevenButton);
			this.add(eightButton);
			this.add(nineButton);
			this.add(equalButton);
			this.add(clearButton);
			this.add(inputTextField);
			
			inputTextField.setBounds(100, 200, 400, 50);
			addButton.setBounds(100, 300, 100, 50);
			subButton.setBounds(100, 350, 100, 50);
			mulButton.setBounds(100, 400, 100, 50);
			divButton.setBounds(100, 450, 100, 50);
			zeroButton.setBounds(200, 300, 100, 50);
			oneButton.setBounds(300, 300, 100, 50);
			twoButton.setBounds(400, 300, 100, 50);
			threeButton.setBounds(200, 350, 100, 50);
			fourButton.setBounds(300, 350, 100, 50);
			fiveButton.setBounds(400, 350, 100, 50);
			sixButton.setBounds(200, 400, 100, 50);
			sevenButton.setBounds(300, 400, 100, 50);
			eightButton.setBounds(400, 400, 100, 50);
			nineButton.setBounds(200, 450, 100, 50);
			equalButton.setBounds(300, 450, 100, 50);
			clearButton.setBounds(400, 450, 100, 50);
			
			addButton.addActionListener(this);
			divButton.addActionListener(this);
			subButton.addActionListener(this);
			mulButton.addActionListener(this);
			zeroButton.addActionListener(this);
			oneButton.addActionListener(this);
			twoButton.addActionListener(this);
			threeButton.addActionListener(this);
			fourButton.addActionListener(this);
			fiveButton.addActionListener(this);
			sixButton.addActionListener(this);
			sevenButton.addActionListener(this);
			eightButton.addActionListener(this);
			nineButton.addActionListener(this);
			equalButton.addActionListener(this);
			clearButton.addActionListener(this);
			
		}
		String inputText ="";
		public void actionPerformed(ActionEvent ae) {
			String str = ae.getActionCommand();
			if(str == "C")
			{
				inputText = "";
				inputTextField.setText(inputText);
			}
			else if(str == "=")
			{
				String input= inputTextField.getText();
				String splitCharacter = "";
				 int result =0;
				if(input.contains("+"))
				{
					splitCharacter = "\\+";
					String[] numberList = input.split(splitCharacter);
		             result = Integer.parseInt(numberList[0]) + Integer.parseInt(numberList[1]);
				}
				else if(input.contains("-"))
				{
					splitCharacter = "\\-";
					String[] numberList = input.split(splitCharacter);
		             result = Integer.parseInt(numberList[0]) - Integer.parseInt(numberList[1]);
				}
				
				else if(input.contains("*"))
				{
					splitCharacter = "\\*";
					String[] numberList = input.split(splitCharacter);
		             result = Integer.parseInt(numberList[0]) * Integer.parseInt(numberList[1]);
				}
				else if(input.contains("/"))
				{
					splitCharacter = "\\/";
					String[] numberList = input.split(splitCharacter);
		             result = Integer.parseInt(numberList[0]) /Integer.parseInt(numberList[1]);
				}
				
               
               inputText= inputTextField.getText() + str + result;  
	            inputTextField.setText(inputText);
				
			}
			else
			{
				inputText= inputTextField.getText() + str;  
	            inputTextField.setText(inputText);
			}
            
			
		}
		public static void main(String[] args) {
			FrameCalculator f = new FrameCalculator();
			f.setTitle("Calculator");
			f.setSize(400, 400);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
		}


}

		

