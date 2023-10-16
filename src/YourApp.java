import javax.swing.*;
import java.awt.*;


public class YourApp {
    public static void main(String[] args) {
        // Create the TouristModel and PlaceModel instances
        TouristModel touristModel = new TouristModel();
        PlaceModel placeModel = new PlaceModel();


        // Create the views
        TouristView touristView = new TouristView(touristModel);
        PlaceView placeView = new PlaceView(placeModel);


        // Create a JFrame to hold the views
        JFrame frame = new JFrame("Dreamy Destinations"); // Updated title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        // Add your views to the frame
        frame.add(touristView, BorderLayout.WEST); // You can change the layout as needed
        frame.add(placeView, BorderLayout.EAST);


        // Set the frame size and make it visible
        frame.setSize(800, 600); // Set the size as per your requirements
        frame.setVisible(true);
    }
}
