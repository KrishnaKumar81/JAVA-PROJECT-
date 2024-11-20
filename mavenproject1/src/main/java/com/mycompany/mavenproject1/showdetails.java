/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import org.bson.Document;

/**
 *
 * @author harsh
 */
public class showdetails {
     public static void openTrainDetailsPage(Document doc) {
        // Create a new JFrame to display the train details
        JFrame detailFrame = new JFrame("Train Details");
        detailFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailFrame.setLayout(new BorderLayout());

        // Create a panel to display the train details
        JPanel detailPanel = new JPanel();
        detailPanel.setLayout(new BoxLayout(detailPanel, BoxLayout.Y_AXIS));

        // Display the selected train's details in labels
        JLabel trainNoLabel = new JLabel("Train No: " + doc.getString("train-no"));
        JLabel trainNameLabel = new JLabel("Train Name: " + doc.getString("train-name"));
        JLabel boardingTimeLabel = new JLabel("Boarding Time: " + doc.getString("btime"));
        JLabel destinationTimeLabel = new JLabel("Destination Time: " + doc.getString("dtime"));
        JLabel priceLabel = new JLabel("Price: " + doc.getString("price"));

        // Add all labels to the detail panel
        detailPanel.add(trainNoLabel);
        detailPanel.add(trainNameLabel);
        detailPanel.add(boardingTimeLabel);
        detailPanel.add(destinationTimeLabel);
        detailPanel.add(priceLabel);

        // Add a "Back" button to go back to the previous list
        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(70, 130, 180));
        backButton.setForeground(Color.WHITE);
        backButton.addActionListener(e -> {
            detailFrame.dispose();  // Close the current detail frame
        });

        // Add components to the detail frame
        detailFrame.add(detailPanel, BorderLayout.CENTER);
        detailFrame.add(backButton, BorderLayout.SOUTH);

        // Set frame size and show it
        detailFrame.setPreferredSize(new Dimension(400, 300));
        detailFrame.pack();
        detailFrame.setLocationRelativeTo(null);  // Center the frame
        detailFrame.setVisible(true);
    }
}
