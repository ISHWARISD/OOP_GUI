/*import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlaceView extends JPanel {
    private JTextField cityNameTextField;
    private JTextField countryNameTextField;
    private JTextField hotelTextField;
    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;
    private PlaceModel model;

    public PlaceView(PlaceModel model) {
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("City Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Country Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Hotel:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        cityNameTextField = new JTextField(20);
        add(cityNameTextField, gbc);
        gbc.gridy++;
        countryNameTextField = new JTextField(20);
        add(countryNameTextField, gbc);
        gbc.gridy++;
        hotelTextField = new JTextField(20);
        add(hotelTextField, gbc);

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
                String cityName = cityNameTextField.getText();
                String countryName = countryNameTextField.getText();
                String hotel = hotelTextField.getText();

                model.createPlace(cityName, countryName, hotel);

                clearFields();
            }
        });

        gbc.gridy++;
        add(updateButton, gbc);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to update a place here
            }
        });

        gbc.gridy++;
        add(deleteButton, gbc);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to delete a place here
            }
        });
    }

    private void clearFields() {
        cityNameTextField.setText("");
        countryNameTextField.setText("");
        hotelTextField.setText("");
    }
}
*/

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlaceView extends JPanel {
    private JTextField cityNameTextField;
    private JTextField countryNameTextField;
    private JTextField hotelTextField;
    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;
    private PlaceModel model;

    public PlaceView(PlaceModel model) {
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("City Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Country Name:"), gbc);
        gbc.gridy++;
        add(new JLabel("Hotel:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        cityNameTextField = new JTextField(20);
        add(cityNameTextField, gbc);
        gbc.gridy++;
        countryNameTextField = new JTextField(20);
        add(countryNameTextField, gbc);
        gbc.gridy++;
        hotelTextField = new JTextField(20);
        add(hotelTextField, gbc);

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
                String cityName = cityNameTextField.getText();
                String countryName = countryNameTextField.getText();
                String hotel = hotelTextField.getText();

                model.createPlace(cityName, countryName, hotel);

                clearFields();
            }
        });

        gbc.gridy++;
        add(updateButton, gbc);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to update a place here
            }
        });

        gbc.gridy++;
        add(deleteButton, gbc);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to delete a place here
            }
        });
    }

    private void clearFields() {
        cityNameTextField.setText("");
        countryNameTextField.setText("");
        hotelTextField.setText("");
    }
}
/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlaceView extends JPanel {
    private JTextField cityNameTextField;
    private JTextField countryNameTextField;
    private JTextField hotelTextField;
    private JButton createButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton placeButton; // New button for "Place"
    private PlaceModel model;

    public PlaceView(PlaceModel model) {
        this.model = model;

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Previous components for place info fields and buttons
        // ...

        // New button for "Place"
        placeButton = new JButton("Place");
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        add(placeButton, gbc);

        placeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add logic to handle "Place" button action
            }
        });
    }

    // Previous methods for managing place information
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlaceView extends JPanel {
    private JButton placeButton;
    private JTextField cityNameTextField;
    private JTextField countryNameTextField;
    private JTextField hotelTextField;
    private boolean isPlaceInfoVisible; // To track if place info is visible

    public PlaceView() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Create "Place" button
        placeButton = new JButton("Place");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(placeButton, gbc);

        // Add an action listener to the "Place" button
        placeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                togglePlaceInfoVisibility();
            }
        });

        // Initially, place info fields are hidden
        isPlaceInfoVisible = false;
        setVisiblePlaceInfo(false);

        // Add place info fields
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("City Name:"), gbc);
        cityNameTextField = new JTextField(20);
        gbc.gridx = 1;
        add(cityNameTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Country Name:"), gbc);
        countryNameTextField = new JTextField(20);
        gbc.gridx = 1;
        add(countryNameTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Hotel:"), gbc);
        hotelTextField = new JTextField(20);
        gbc.gridx = 1;
        add(hotelTextField, gbc);
    }

    // Toggle the visibility of place info fields
    private void togglePlaceInfoVisibility() {
        isPlaceInfoVisible = !isPlaceInfoVisible;
        setVisiblePlaceInfo(isPlaceInfoVisible);
    }

    // Set the visibility of place info fields
    private void setVisiblePlaceInfo(boolean visible) {
        cityNameTextField.setVisible(visible);
        countryNameTextField.setVisible(visible);
        hotelTextField.setVisible(visible);
    }
}
/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PlaceView extends JPanel {
    private JButton placeButton;
    private JTextField cityNameTextField;
    private JTextField countryNameTextField;
    private JTextField hotelTextField;
    private boolean isPlaceInfoVisible;

    public PlaceView(PlaceModel model) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        placeButton = new JButton("Place");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(placeButton, gbc);

        placeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                togglePlaceInfoVisibility();
            }
        });

        isPlaceInfoVisible = false;
        setVisiblePlaceInfo(false);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("City Name:"), gbc);
        cityNameTextField = new JTextField(20);
        gbc.gridx = 1;
        add(cityNameTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Country Name:"), gbc);
        countryNameTextField = new JTextField(20);
        gbc.gridx = 1;
        add(countryNameTextField, gbc);
        gbc.gridy++;
        add(new JLabel("Hotel:"), gbc);
        hotelTextField = new JTextField(20);
        gbc.gridx = 1;
        add(hotelTextField, gbc);
    }

    private void togglePlaceInfoVisibility() {
        isPlaceInfoVisible = !isPlaceInfoVisible;
        setVisiblePlaceInfo(isPlaceInfoVisible);
    }

    private void setVisiblePlaceInfo(boolean visible) {
        cityNameTextField.setVisible(visible);
        countryNameTextField.setVisible(visible);
        hotelTextField.setVisible(visible);
    }
}

 */
