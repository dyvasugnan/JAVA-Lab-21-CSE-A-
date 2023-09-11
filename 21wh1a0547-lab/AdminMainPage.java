package java_lab;
import javax.swing.*;
import java.awt.*;
public class AdminMainPage extends JFrame {
	    AdminMainPage() {
	        setTitle("Admin Main Page");
	        setSize(600, 300);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JPanel mainPanel = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                // Load and display your background image here
	                ImageIcon backgroundImage = new ImageIcon("C:\\Users\\MOULIKA\\OneDrive\\Pictures\\crossword_project_image.jpeg");
	                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
	            }
	        };
	        mainPanel.setLayout(new BorderLayout());

	        JLabel welcomeLabel = new JLabel("Welcome to the Admin Main Page\n");
	        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 24));
	        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
	        mainPanel.add(welcomeLabel, BorderLayout.NORTH);

	        setContentPane(mainPanel);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            AdminMainPage adminMainPage = new AdminMainPage();
	            adminMainPage.setVisible(true);
	        });
	    }
	}

