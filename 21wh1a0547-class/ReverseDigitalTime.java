package java_lab;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class ReverseDigitalTime extends JFrame {
	    JLabel l1;
	    JLabel l2;
	    Timer t;

	    public ReverseDigitalTime() {
	        setTitle("Reverse Time");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        l1 = new JLabel();
	        l2 = new JLabel() {
	            protected void paintComponent(Graphics g) {
	                Graphics2D g2d = (Graphics2D) g.create();
	                g2d.rotate(Math.PI, getWidth() / 2.0, getHeight() / 2.0);
	                super.paintComponent(g2d);
	                g2d.dispose();
	            }
	        };
	        l1.setHorizontalAlignment(SwingConstants.CENTER);
	        l2.setHorizontalAlignment(SwingConstants.CENTER);
	        JPanel panel = new JPanel(new GridLayout(2, 1));
	        panel.add(l1);
	        panel.add(l2);
	        add(panel);

	        t = new Timer(1000, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                updateLabels();
	            }
	        });
	        t.start();
	    }

	    private void updateLabels() {
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	        String currentTime = sdf.format(new Date());
	        l1.setText(currentTime);

	        String upsideDownTime = getUpsideDownText(currentTime);
	        l2.setText(upsideDownTime);
	    }

	    private String getUpsideDownText(String text) {
	        StringBuilder upsideDown = new StringBuilder();
	        for (int i = text.length() - 1; i >= 0; i--) {
	            upsideDown.append(text.charAt(i));
	        }
	        return upsideDown.toString();
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            ReverseDigitalTime r = new ReverseDigitalTime();
	            r.setVisible(true);
	        });
	    }
	}

