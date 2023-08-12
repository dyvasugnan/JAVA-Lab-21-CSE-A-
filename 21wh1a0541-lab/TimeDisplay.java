package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeDisplay extends JFrame {
     JLabel l1;
     JLabel l2;
     TimeDisplay () {
        setTitle("Time Display");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        l1 = new JLabel();
        l1.setFont(new Font("Arabic", Font.ITALIC, 100));
        l2 = new JLabel();
        l2.setFont(new Font("Arabic", Font.ITALIC, 100));
        setLayout(new GridLayout(2, 1));
        
        add(l1);
        add(l2);
        
        Timer t = new Timer(1000, e -> updateTime());
        t.start();
        
    }
    private String reverseAndTransform(String text) {
        String mapping = "9876543210";
        String upsideDownMapping = "68ㄥ92hƐsƖ0";
        StringBuilder rs = new StringBuilder();
        for (char c : text.toCharArray()) {
            int i = mapping.indexOf(c);
            if (i != -1) {
                rs.append(upsideDownMapping.charAt(i));
            } 
            else {
                rs.append(c);
            }
        }
        return rs.toString();
    }
    private void updateTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(new Date());
        l1.setText("CURRENT TIME: " + formattedTime);
        l2.setText("FLIPPED TIME: " + reverseAndTransform(formattedTime));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	TimeDisplay  td = new TimeDisplay ();
            td.setVisible(true);
        });
    }

}
