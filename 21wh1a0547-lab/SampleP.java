package java_lab;
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;

public class SampleP extends JFrame {
    private JButton connectButton;
    private JTable dataTable;

    public SampleP() {
        // Set frame properties
        setTitle("Database GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.NORTH);

        // Add a connect button to the panel
        connectButton = new JButton("Connect to Database");
        buttonPanel.add(connectButton);

        // Add action listener to the connect button
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectToDatabase();
            }
        });

        // Create a table to display data
        dataTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(dataTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_workbench", "root", "anusha1506");

            // Create a statement for executing SQL queries
            Statement stmt = con.createStatement();

            // Execute a query to retrieve data from the 'Product' table
            String query = "SELECT Product_Type, Cost, Image FROM Product";
            ResultSet rs = stmt.executeQuery(query);

            // Create a table model to store the data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Product Type");
            model.addColumn("Cost");
            model.addColumn("Image");

            while (rs.next()) {
                String productType = rs.getString("Product_Type");
                int cost = rs.getInt("Cost");
                byte[] imageData = rs.getBytes("Image");

                // Check if the image data is not null
                if (imageData != null) {
                    // Convert the image bytes to an Image object
                    ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
                    try {
                        BufferedImage image = ImageIO.read(inputStream);
                        if (image != null) {
                            ImageIcon icon = new ImageIcon(image);

                            // Add the data to the table model
                            model.addRow(new Object[]{productType, cost, icon});
                        } else {
                            // Handle the case where the image could not be loaded
                            System.err.println("Error: Image could not be loaded.");
                        }
                    } catch (Exception ex) {
                        // Handle image loading exception
                        ex.printStackTrace();
                    }
                } else {
                    // Handle the case where the image data is null
                    System.err.println("Error: Image data is null.");
                }
            }

            // Set the table model for the JTable
            dataTable.setModel(model);

            // Close the resources
            rs.close();
            stmt.close();
            con.close();

            System.out.println("Connected to the database");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SampleP gui = new SampleP();
            gui.setVisible(true);
        });
    }
}*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;

public class SampleP extends JFrame {
    private JButton connectButton;
    private JTable dataTable;

    public SampleP() {
        // Set frame properties
        setTitle("Database GUI");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.NORTH);

        // Add a connect button to the panel
        connectButton = new JButton("Connect to Database");
        buttonPanel.add(connectButton);

        // Add action listener to the connect button
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectToDatabase();
            }
        });

        // Create a table to display data
        dataTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(dataTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void connectToDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_workbench", "root", "anusha1506");

            // Create a statement for executing SQL queries
            Statement stmt = con.createStatement();

            // Execute a query to retrieve data from the 'Product' table
            String query = "SELECT Product_Type, Cost, Image FROM Product";
            ResultSet rs = stmt.executeQuery(query);

            // Create a table model to store the data
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Product Type");
            model.addColumn("Cost");
            model.addColumn("Image");

            while (rs.next()) {
                String productType = rs.getString("Product_Type");
                int cost = rs.getInt("Cost");
                byte[] imageData = rs.getBytes("Image");

                // Check if the image data is not null
                if (imageData != null) {
                    // Convert the image bytes to an Image object
                    ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
                    try {
                        BufferedImage image = ImageIO.read(inputStream);
                        if (image != null) {
                            ImageIcon icon = new ImageIcon(image);

                            // Add the data to the table model
                            model.addRow(new Object[]{productType, cost, icon});
                        } else {
                            // Handle the case where the image could not be loaded
                            System.err.println("Error: Image could not be loaded.");
                        }
                    } catch (Exception ex) {
                        // Handle image loading exception
                        ex.printStackTrace();
                    }
                } else {
                    // Handle the case where the image data is null
                    System.err.println("Error: Image data is null.");
                }
            }

            // Set the table model for the JTable
            dataTable.setModel(model);

            // Close the resources
            rs.close();
            stmt.close();
            con.close();

            System.out.println("Connected to the database");
        } catch (Exception ex) {
            // Handle exceptions here
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SampleP gui = new SampleP();
            gui.setVisible(true);
        });
    }
}

