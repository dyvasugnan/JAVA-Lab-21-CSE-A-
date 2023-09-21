	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	public class MouseEventPerformer extends JFrame implements MouseListener
	{
	    JLabel l1;
	    public MouseEventPerformer()
	    {
	        this.setLayout(new FlowLayout(FlowLayout.CENTER));
	        l1 = new JLabel();
	        l1.setForeground(Color.pink);
	        add(l1);
	        addMouseListener(this);
	    }
	    public void mouseExited(MouseEvent m)
	    {
	        l1.setText("Mouse Exited");
	    }
	    public void mouseEntered(MouseEvent m)
	    {
	        l1.setText("Mouse Entered");
	    }
	    public void mouseReleased(MouseEvent m)
	    {
	        l1.setText("Mouse Released");
	    }
	    public void mousePressed(MouseEvent m)
	    {
	        l1.setText("Mouse Pressed");
	    }
	    public void mouseClicked(MouseEvent m)
	    {
	        l1.setText("Mouse Clicked");
	    }
	    public static void main(String[] args) {
	        MouseEventPerformer mep = new MouseEventPerformer();
	        mep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        mep.setSize(300,300);
	        mep.setVisible(true);
	    }
	}
