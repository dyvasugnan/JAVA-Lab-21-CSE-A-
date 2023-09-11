package javagui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Chatbotjava extends JFrame {
    JTextField tf;
    JButton b;
    JPanel p;
    JLabel l;
    Chatbotjava() {
        setTitle("Java World");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        p = new JPanel(new FlowLayout());
        p.setBackground(Color.BLACK);
        l = new JLabel("Enter Package :");
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 26));
        tf = new JTextField(20);
        b = new JButton("Get Information");
        b.setBackground(Color.MAGENTA);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String packageName = tf.getText();
                String packageInfo = retrievePackageInfo(packageName);
                displayPackageInfo(packageInfo);
            }
        });
        p.add(l);
        p.add(tf);
        p.add(b);

        add(p, BorderLayout.CENTER);
    }
    private String retrievePackageInfo(String packageName) {
        try(BufferedReader br = new BufferedReader(new FileReader("java_info.txt"))) {
            String line;
            StringBuilder packageInfo = new StringBuilder();
            boolean foundPackage = false;
            while((line = br.readLine()) != null) {
                if (line.startsWith("Package: ")) {
                    if (foundPackage) {
                        break;                     }
                    if (line.equals("Package: " + packageName)) {
                        foundPackage = true;
                        packageInfo.append(line).append("\n");
                    }
                } 
                else if (foundPackage) {
                    packageInfo.append(line).append("\n");
                }
            }
            if (foundPackage) {
                return packageInfo.toString();
            } 
            else {
                return "No information found for the specified package.";
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return "An error occurred while retrieving information.";
        }
    }
    private void displayPackageInfo(String packageInfo) {
        JFrame f = new JFrame("Package Info");
        f.setSize(400, 300);
        f.setLocationRelativeTo(this);
        JTextArea a = new JTextArea(packageInfo);
        a.setEditable(false); 
        a.setBackground(Color.BLACK);
        a.setForeground(Color.WHITE); 
        JScrollPane scrollPane = new JScrollPane(a);
        f.add(scrollPane);
        f.setVisible(true);
    }
    public static void main(String[] args) {
                Chatbotjava c = new Chatbotjava();
                c.setVisible(true);
    }
}
