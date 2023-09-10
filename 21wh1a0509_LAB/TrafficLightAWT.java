package java;
import java.awt.*; 
import java .awt. event .*;
@SuppressWarnings("serial")
public class TrafficLightAWT extends Frame implements ItemListener { 
	private String message = "";
	private Color color = Color .BLACK;
	public TrafficLightAWT () {
		setTitle ("Traffic Light Simulator"); 
		setSize(800, 800);
		setVisible(true);
		setLayout(null );
		CheckboxGroup checkboxGroup = new CheckboxGroup ( ) ;
		Checkbox redCheckbox=new Checkbox("Red",checkboxGroup , false );
		Checkbox yellowCheckbox=new Checkbox ("Yellow", checkboxGroup , false);
		Checkbox greenCheckbox=new Checkbox ("Green", checkboxGroup , false);
		redCheckbox . setBounds (120 , 300, 60, 30);
		yellowCheckbox . setBounds (120 , 330 ,60, 30);
		greenCheckbox . setBounds (120 , 360 , 60, 30);
		add(redCheckbox); 
		add(yellowCheckbox );
		add ( greenCheckbox ) ;
		redCheckbox.addItemListener(this ); 
		yellowCheckbox.addItemListener(this ); 
		greenCheckbox.addItemListener(this );
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System . exit (0);
			}
		});
	}
	public void paint(Graphics g) {
		g. setColor(color );
		g.setFont(new Font("Arial", Font.BOLD, 24)); 
		g.drawString(message, 100, 300);
	}
	public void itemStateChanged(ItemEvent e) {
		Checkbox selectedCheckbox = (Checkbox) e.getItemSelectable(); 
		String selectedLabel = selectedCheckbox . getLabel ();
		switch ( selectedLabel ) { 
			case "Red":	message = "Stop"; 
			color = Color .RED; break ;
			case "Yellow": message = "Ready"; 
			color = Color .YELLOW; break ;
			case "Green": message = "Go";
			color = Color .GREEN; break ;
		}
		repaint ();
	}
		public static void main(String [] args) {
		TrafficLightAWT trafficLight = new TrafficLightAWT ();
		} 
	}
