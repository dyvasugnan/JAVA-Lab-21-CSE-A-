
import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener{
	Button b3;
	Frame2(){
		this.setLayout(null);
		b3 = new Button("Back");
		b3.setBounds(100,150,100,50); 	
		this.add(b3);
		b3.addActionListener(this); 
	
	}
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str=="Back");
			this.dispose();
	}
}
