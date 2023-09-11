package java_lab;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
public class IMSLogin extends JFrame implements ActionListener {
	    JButton b1, b2;
	    JLabel messageLabel;
	    
	    IMSLogin() {
	        Container c = getContentPane();
	        c.setLayout(null);
	        this.setLayout(null);
	        b1 = new JButton("Admin");
	        b2 = new JButton("User");
	        
	        b1.setBounds(150, 100, 100, 50);
	        b2.setBounds(300, 100, 100, 50);
	        
	        messageLabel = new JLabel();
	        messageLabel.setBounds(150, 200, 400, 50);
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
	        messageLabel.setHorizontalAlignment(JLabel.CENTER);
	        c.add(messageLabel);
	        
	        c.add(b1);
	        c.add(b2);
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        String str = ae.getActionCommand();
	        if (str.equals("Admin")) {
	            openAdminLoginFrame();
	        }

	        /*if (str.equals("User")) {
	            messageLabel.setText("Hello There!! Great to see you here");
	        }*/
	        if (str.equals("User")) {
	            openUserFrame();
	        }
	    }
	    
	    private void openUserFrame() {
	        SwingUtilities.invokeLater(() -> {
	            SampleP sampleP = new SampleP();
	            sampleP.setVisible(true);
	        });
	    }

	    private void openAdminLoginFrame() {
	        SwingUtilities.invokeLater(() -> {
	            AdminLoginFrame adminLoginFrame = new AdminLoginFrame(this);
	            adminLoginFrame.setVisible(true);
	        });
	    }

	    public void showAdminMainPage() {
	        SwingUtilities.invokeLater(() -> {
	            AdminMainPage adminMainPage = new AdminMainPage();
	            adminMainPage.setVisible(true);
	        });
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            IMSLogin il = new IMSLogin();
	            il.setTitle("Login Page");
	            il.setSize(600, 300);
	            il.setVisible(true);
	            il.setBackground(Color.LIGHT_GRAY);
	            il.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        });
	    }
	}


