/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TouristView extends JPanel {
    private JTextField nameTextField;
    private JTextField genderTextField;
    private JTextField phoneTextField;
    private JTextField nationalityTextField;
    private JTextField ageTextField;
    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;
    private TouristModel model;

    public TouristView(TouristModel model) {
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Gender:"), gbc);
        gbc.gridy++;
        add(new JLabel("Phone Number:"), gbc);
        gbc.gridy++;
        add(new JLabel("Nationality:"), gbc);
        gbc.gridy++;
        add(new JLabel("Age:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        nameTextField = new JTextField(20);
        add(nameTextField, gbc);
        gbc.gridy++;
        genderTextField = new JTextField(20);
        add(genderTextField, gbc);
        gbc.gridy++;
        phoneTextField = new JTextField(20);
        add(phoneTextField, gbc);
        gbc.gridy++;
        nationalityTextField = new JTextField(20);
        add(nationalityTextField, gbc);
        gbc.gridy++;
        ageTextField = new JTextField(20);
        add(ageTextField, gbc);

        createButton = new JButton("Create");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(createButton, gbc);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String gender = genderTextField.getText();
                String phone = phoneTextField.getText();
                String nationality = nationalityTextField.getText();
                int age = Integer.parseInt(ageTextField.getText());

                model.createTourist(name, age, phone, nationality, gender);

                clearFields();
            }
        });

        gbc.gridy++;
        add(updateButton, gbc);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to update a tourist here
            }
        });

        gbc.gridy++;
        add(deleteButton, gbc);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to delete a tourist here
            }
        });
    }

    private void clearFields() {
        nameTextField.setText("");
        genderTextField.setText("");
        phoneTextField.setText("");
        nationalityTextField.setText("");
        ageTextField.setText("");
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TouristView extends JPanel {
    private JTextField nameTextField;
    private JTextField genderTextField;
    private JTextField phoneTextField;
    private JTextField nationalityTextField;
    private JTextField ageTextField;
    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton touristButton; // New button for "Tourist"
    private TouristModel model;

    public TouristView(TouristModel model) {
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Previous components for tourist info fields and buttons
        // ...

        // New button for "Tourist"
        touristButton = new JButton("Tourist");
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(touristButton, gbc);

        touristButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to handle "Tourist" button action
            }
        });
    }

    // Previous methods for managing tourist information
}

 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TouristView extends JPanel {
    private JButton touristButton;
    private JTextField nameTextField;
    private JTextField genderTextField;
    private JTextField phoneTextField;
    private JTextField nationalityTextField;
    private JTextField ageTextField;
    private boolean isTouristInfoVisible; // To track if tourist info is visible

    public TouristView() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Create "Tourist" button
        touristButton = new JButton("Tourist");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(touristButton, gbc);

        // Add an action listener to the "Tourist" button
        touristButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleTouristInfoVisibility();
            }
        });

        // Initially, tourist info fields are hidden
        isTouristInfoVisible = false;
        setVisibleTouristInfo(false);

        // Add tourist info fields
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Name:"), gbc);
        nameTextField = new JTextField(20);
        gbc.gridx = 1;
        add(nameTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Gender:"), gbc);
        genderTextField = new JTextField(20);
        gbc.gridx = 1;
        add(genderTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Phone Number:"), gbc);
        phoneTextField = new JTextField(20);
        gbc.gridx = 1;
        add(phoneTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Nationality:"), gbc);
        nationalityTextField = new JTextField(20);
        gbc.gridx = 1;
        add(nationalityTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Age:"), gbc);
        ageTextField = new JTextField(20);
        gbc.gridx = 1;
        add(ageTextField, gbc);
    }

    // Toggle the visibility of tourist info fields
    private void toggleTouristInfoVisibility() {
        isTouristInfoVisible = !isTouristInfoVisible;
        setVisibleTouristInfo(isTouristInfoVisible);
    }

    // Set the visibility of tourist info fields
    private void setVisibleTouristInfo(boolean visible) {
        nameTextField.setVisible(visible);
        genderTextField.setVisible(visible);
        phoneTextField.setVisible(visible);
        nationalityTextField.setVisible(visible);
        ageTextField.setVisible(visible);
    }
}

