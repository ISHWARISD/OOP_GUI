import javax.swing.*;
import java.awt.*;


public class TouristVisitsPlaces {
    public static void main(String[] args) {
        // Create the TouristModel and PlaceModel instances
        TouristModel touristModel = new TouristModel();
        PlaceModel placeModel = new PlaceModel();


        // Create the views
        TouristView touristView = new TouristView(touristModel);
        PlaceView placeView = new PlaceView(placeModel);


        // Create a JFrame to hold the views
        JFrame frame = new JFrame("Dreamy Destinations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create a container panel to hold the views
        JPanel container = new JPanel(new BorderLayout());
        container.add(touristView, BorderLayout.WEST);
        container.add(placeView, BorderLayout.EAST);


        // Add the container panel to the frame
        frame.getContentPane().add(container);


        // Set the frame size and make it visible
        frame.setSize(800, 600);
        frame.setVisible(true);
    }


    public void createAndShowGUI() {
        // Create the TouristModel and PlaceModel instances
        TouristModel touristModel = new TouristModel();
        PlaceModel placeModel = new PlaceModel();


        // Create the views
        TouristView touristView = new TouristView(touristModel);
        PlaceView placeView = new PlaceView(placeModel);


        // Create a JFrame to hold the views
        JFrame frame = new JFrame("Dreamy Destinations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Create a container panel to hold the views
        JPanel container = new JPanel(new BorderLayout());
        container.add(touristView, BorderLayout.WEST);
        container.add(placeView, BorderLayout.EAST);


        // Add the container panel to the frame
        frame.getContentPane().add(container);


        // Set the frame size and make it visible
        frame.setSize(800, 600);
        frame.setVisible(true);
}
}
