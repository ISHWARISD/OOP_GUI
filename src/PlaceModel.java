import java.util.ArrayList;
public class PlaceModel {
    private ArrayList<Place> places = new ArrayList<>();

    // Method to create a new place
    public void createPlace(String cityName, String countryName, String hotel) {
        Place newPlace = new Place(cityName, countryName, hotel);
        places.add(newPlace);
    }

    // Method to update an existing place
    public void updatePlace(int index, String cityName, String countryName, String hotel) {
        if (index >= 0 && index < places.size()) {
            Place updatedPlace = new Place(cityName, countryName, hotel);
            places.set(index, updatedPlace);
        }
    }

    // Method to delete a place
    public void deletePlace(int index) {
        if (index >= 0 && index < places.size()) {
            places.remove(index);
        }
    }

    // Method to retrieve all places
    public ArrayList<Place> getAllPlaces() {
        return places;
    }

    // Method to search for a place by city name
    public Place searchPlaceByCityName(String cityName) {
        for (Place place : places) {
            if (place.getCityName().equalsIgnoreCase(cityName)) {
                return place;
            }
        }
        return null;
    }

    // Other methods for managing places
}