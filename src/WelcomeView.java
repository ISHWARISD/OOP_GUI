/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WelcomeView {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }


    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Welcome to Dreamy Destinations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel(new BorderLayout());


        // Create a large and bold welcome label
        JLabel welcomeLabel = new JLabel("Welcome to Dreamy Destinations");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);


        // Create a smaller and bold message "Select Option" below the welcome message
        JLabel selectLabel = new JLabel("Select Option");
        selectLabel.setFont(new Font("Serif", Font.BOLD, 16));
        selectLabel.setHorizontalAlignment(SwingConstants.CENTER);


        // Create buttons with a button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton touristButton = new JButton("Tourist");
        JButton placeButton = new JButton("Place");


        touristButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showTouristView();
            }
        });


        placeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showPlaceView();
            }
        });


        buttonPanel.add(touristButton);
        buttonPanel.add(placeButton);


        // Add components to the main panel
        panel.add(welcomeLabel, BorderLayout.NORTH);
        panel.add(selectLabel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);


        frame.getContentPane().add(panel);


        frame.setSize(800, 600);
        frame.setVisible(true);
    }


    public static void showTouristView() {
        JFrame frame = new JFrame("Tourist Management");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        TouristView touristView = new TouristView();
        frame.getContentPane().add(touristView);


        frame.pack();
        frame.setVisible(true);
    }


    public static void showBrandView() {
        JFrame frame = new JFrame("Mobile Brand Management");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        PlaceView placeView = new PlaceView();
        frame.getContentPane().add(placeView);


        frame.pack();
        frame.setVisible(true);
}
}
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeView {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Welcome to Dreamy Destinations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome to Dreamy Destinations");
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 24));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel selectLabel = new JLabel("Select Option");
        selectLabel.setFont(new Font("Serif", Font.BOLD, 16));
        selectLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton touristButton = new JButton("Tourist");
        JButton placeButton = new JButton("Place");

        touristButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to show the TouristView
            }
        });

        placeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to show the PlaceView
            }
        });

        buttonPanel.add(touristButton);
        buttonPanel.add(placeButton);

        panel.add(welcomeLabel, BorderLayout.NORTH);
        panel.add(selectLabel, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
