package java_lab;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminLoginFrame extends JFrame implements ActionListener {
	    JLabel usernameLabel, passwordLabel;
	    JTextField usernameField;
	    JPasswordField passwordField;
	    JButton loginButton;
	    IMSLogin imsLogin1;

	    public AdminLoginFrame(IMSLogin imsLogin1) {
	        this.imsLogin1 = imsLogin1;

	        setTitle("Admin Login");
	        setSize(600, 300);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	        Container container = getContentPane();
	        container.setLayout(new GridLayout(3, 2));

	        usernameLabel = new JLabel("Username:");
	        passwordLabel = new JLabel("Password:");
	        usernameField = new JTextField();
	        passwordField = new JPasswordField();
	        loginButton = new JButton("Login");

	        container.add(usernameLabel);
	        container.add(usernameField);
	        container.add(passwordLabel);
	        container.add(passwordField);
	        container.add(new JLabel()); // Empty label for spacing
	        container.add(loginButton);

	        loginButton.addActionListener(this);
	    }

	    public void actionPerformed(ActionEvent e) {
	        String enteredUsername = usernameField.getText();
	        String enteredPassword = new String(passwordField.getPassword());

	        // Replace these with your actual admin credentials
	        String adminUsername = "admin";
	        String adminPassword = "admin123";

	        if (enteredUsername.equals(adminUsername) && enteredPassword.equals(adminPassword)) {
	            JOptionPane.showMessageDialog(null, "Login Successful");
	            imsLogin1.showAdminMainPage();
	            dispose();
	        } else {
	            JOptionPane.showMessageDialog(null, "Login Failed");
	        }
	    }
	}

