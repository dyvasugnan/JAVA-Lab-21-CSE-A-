package javaClass;
import java.awt.*;
import java.awt.event.*;
public class StudentRegistrationForm extends Frame implements ActionListener, ItemListener{
	Button b1;
	Label l1,l2,l3,l4,l5,l6;
	TextField t1,t2;
	Choice c;
	Checkbox cb1,cb2,cb3;
	Checkbox c1,c2;
	CheckboxGroup cbg;
	List prog;
	
	private Frame resultFrame; // New Frame to display the selected options
	private Label resultLabel; // Label to show the selected options in the new Frame
	
	StudentRegistrationForm(){
		this.setLayout(null);
		
		cbg = new CheckboxGroup();
		
		c1 = new Checkbox("Male",cbg,false);
		c2 = new Checkbox("Female",cbg,false);
		
		
		t1 = new TextField();
		t2 = new TextField();
		
		l1 = new Label("FName");
		l2 = new Label("LName");
		l3 = new Label("Branch");
		l4 = new Label("Language known");
		l5 = new Label("Gender");
		l6 = new Label("Known Programming Language");
		
		b1 = new Button("Display");
		
		cb1 = new Checkbox("Hindi");
		cb2 = new Checkbox("English");
		cb3 = new Checkbox("Telugu");
		
		
		//setBounds
		l1.setBounds(20,40,80,30);
		t1.setBounds(100,40,200,30);
		
		l2.setBounds(350,40,80,30);
		t2.setBounds(430,40,200,30);
		
		l3.setBounds(20,90,50,30);
		
		l4.setBounds(20,140,100,30);
		cb1.setBounds(140,140,50,30);
		cb2.setBounds(195,140,50,30);
		cb3.setBounds(260,140,50,30);
		
		l5.setBounds(20,190,50,30);
		c1.setBounds(80,190,50,30);
		c2.setBounds(140,190,50,30);

		l6.setBounds(20,240,190,30);
		
		b1.setBounds(300,350,50,30);
		
		
		
		//add choice
		c = new Choice();
		c.setBounds(90,90,50,30);
		c.add("CSE");
		c.add("ECE");
		c.add("EEE");
		c.add("AIML");
		c.add("IT");
		
		prog = new List(4,true);
		prog.setBounds(230,250,100,70);
		prog.add("C");
		prog.add("C++");
		prog.add("Java");
		prog.add("Haskel");
		prog.add("Python");
		prog.add("c#");
		
		this.add(prog);
		this.add(c);

		this.add(b1);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(t1);
		this.add(t2);
		
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		
		this.add(c1);
		this.add(c2);
		
		c.addItemListener(this);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		prog.addItemListener(this);


		t1.addActionListener(this);
		t2.addActionListener(this);
		b1.addActionListener(this);
		this.setBackground(Color.cyan);
		
		initializeResultFrame();
		
	}
	

	public static void main(String[] args) {
		StudentRegistrationForm s = new StudentRegistrationForm();
		s.setTitle("Student Registration Form");
		s.setVisible(true);
		s.setSize(700,400);
		s.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});

	}
	private void initializeResultFrame() {
        resultFrame = new Frame("Selected Options");
        TextArea resultTextArea = new TextArea();
        resultTextArea.setEditable(false); 
        resultLabel = new Label();
        resultFrame.add(resultLabel);
        resultFrame.setSize(400, 200);
        resultFrame.setVisible(false);
        resultFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
            	 resultFrame.setVisible(false);
            }
        });
        resultFrame.setVisible(false);
    }
	private void showSelectedOptionsInFrame() {
        String firstName = t1.getText();
        String lastName = t2.getText();
        String branch = c.getSelectedItem();
        String gender = cbg.getSelectedCheckbox() == c1 ? "Male" : "Female";

        StringBuilder languagesKnown = new StringBuilder();
        if (cb1.getState()) {
            languagesKnown.append("Hindi, ");
        }
        if (cb2.getState()) {
            languagesKnown.append("English, ");
        }
        if (cb3.getState()) {
            languagesKnown.append("Telugu, ");
        }

        String[] selectedLanguages = prog.getSelectedItems();
        StringBuilder programmingLanguages = new StringBuilder();
        for (String lang : selectedLanguages) {
            programmingLanguages.append(lang).append(", ");
        }

        String message = "First Name: " + firstName +
                "\nLast Name: " + lastName + 
                "\nBranch: " + branch + 
                "\nGender: " + gender +
                "\nLanguages Known: " + languagesKnown.toString() + 
                "\nKnown Programming Languages: " + programmingLanguages.toString();

        TextArea resultTextArea = new TextArea(message); 
        resultTextArea.setEditable(false); 
        resultFrame.add(resultTextArea, BorderLayout.CENTER); 
        resultFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            showSelectedOptionsInFrame();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

}