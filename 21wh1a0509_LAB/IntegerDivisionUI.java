package java;

import java.awt.*;
import java .awt. event .*;
@SuppressWarnings("serial")
public class IntegerDivisionUI extends Frame implements ActionListener {
	private TextField num1Field , num2Field , resultField ; 
	private Button divideButton ;
	public IntegerDivisionUI() {
		setTitle("Integer Division Calculator");
		setSize(300,200);
		setLayout(new GridLayout(4,2));
		Label num1Label = new Label("num1:"); 
		Label num2Label = new Label("num2:"); 
		Label resultLabel = new Label("Result:");
		num1Field = new TextField() ;
		num2Field = new TextField() ; 
		resultField = new TextField(); 
		divideButton = new Button("Divide"); 
		divideButton.addActionListener(this );
		add(num1Label);
		add(num1Field);
		add(num2Label);
		add(num2Field );
		add(resultLabel);
		add(resultField);
		add(divideButton);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) { 
		try {
			int num1 = Integer.parseInt(num1Field.getText()); 
			int num2 = Integer.parseInt(num2Field.getText());
			if (num2 == 0) {
				showMessageDialog("Arthmetic Exception : Division by zero");
			}
			else{
				int result = num1 / num2;
				resultField .setText(String.valueOf(result ));
			}
		}
		catch (NumberFormatException ex) {
			showMessageDialog("Number Format Exception : Invalid input");
			}
		}
		private void showMessageDialog(String message) {
			Dialog dialog = new Dialog(this , "Exception", true ); 
			dialog.setSize(300, 100);
			dialog.setLayout(new FlowLayout());
			Label label = new Label(message);
			Button okButton = new Button("OK");
			okButton . addActionListener (new ActionListener () {
				public void actionPerformed(ActionEvent e) { 
					dialog . dispose ();
				} 
			});
			dialog.add(label);
			dialog.add(okButton);
			dialog.setVisible(true);
		}
			public static void main(String [] args) {
				IntegerDivisionUI divisionUI = new IntegerDivisionUI (); 
				divisionUI . setVisible ( true );
			} 
		}
