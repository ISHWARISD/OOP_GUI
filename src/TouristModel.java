import java.util.ArrayList;
public class TouristModel {
    private ArrayList<Tourist> tourists = new ArrayList<>();

    // Method to create a new tourist
    public void createTourist(String name, int age, String mobileNo, String nationality, String gender) {
        Tourist newTourist = new Tourist(name, age, mobileNo, nationality, gender);
        tourists.add(newTourist);
    }

    // Method to update an existing tourist
    public void updateTourist(int index, String name, int age, String mobileNo, String nationality, String gender) {
        if (index >= 0 && index < tourists.size()) {
            Tourist updatedTourist = new Tourist(name, age, mobileNo, nationality, gender);
            tourists.set(index, updatedTourist);
        }
    }

    // Method to delete a tourist
    public void deleteTourist(int index) {
        if (index >= 0 && index < tourists.size()) {
            tourists.remove(index);
        }
    }

    // Method to retrieve all tourists
    public ArrayList<Tourist> getAllTourists() {
        return tourists;
    }

    // Method to search for a tourist by name
    public Tourist searchTouristByName(String name) {
        for (Tourist tourist : tourists) {
            if (tourist.getName().equalsIgnoreCase(name)) {
                return tourist;
            }
        }
        return null;
    }

    // Other methods for managing tourists
}
