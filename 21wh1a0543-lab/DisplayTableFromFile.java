package javaprograms;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayTableFromFile extends JFrame {
    public DisplayTableFromFile(String filename) {
        setTitle("Table Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String headerLine = br.readLine();
            String[] headers = headerLine.split(",");
            int numColumns = headers.length;
            int numRows = 0;

            // Count the number of rows in the file
            while (br.readLine() != null) {
                numRows++;
            }

            br.close();

            // Create a GridLayout with numRows+1 rows (including the header) and numColumns columns
            setLayout(new GridLayout(numRows + 1, numColumns));

            // Add header labels
            for (String header : headers) {
                JLabel label = new JLabel(header);
                label.setHorizontalAlignment(JLabel.CENTER);
                add(label);
            }

            // Read and add data to labels
            br = new BufferedReader(new FileReader(filename));
            br.readLine(); // Skip the header line

            String line;
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                for (String data : rowData) {
                    JLabel label = new JLabel(data);
                    label.setHorizontalAlignment(JLabel.CENTER);
                    add(label);
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DisplayTableFromFile("file3.txt");
        });
    }
}
