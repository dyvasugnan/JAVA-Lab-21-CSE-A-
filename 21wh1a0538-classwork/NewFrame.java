package classprogram;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class NewFrame extends JFrame {
JTextArea ta;
String str;
String str1;
JProgressBar b;
NewFrame(String fpath){
	Container c = getContentPane();
	c.setLayout(null);
	b = new JProgressBar( );
	b.setValue(0);
	b.setStringPainted(true); 
	b.setBounds(50,50,100,50);
	ta = new JTextArea ();
	ta.setBounds(100,100,300,300);
	c.add(b);
	c.add(ta);
	try {
BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fpath)));
int i = 0;
	    while((str = br.readLine())!=null) {
	    	b.setValue(i+5);
	    	i+=10;
	    	str1 = str1+str+"\n";
	    	ta.setText(str1);
	    }
	}
	catch(FileNotFoundException t) {
		System.out.print(t);
	}
	catch(IOException t) {
		System.out.print(t);
	}
}
}
