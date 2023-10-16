class Place {
    private String cityName;
    private String countryName;
    private String hotel;

    public Place(String cityName, String countryName, String hotel) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.hotel = hotel;
    }

    // Getters and setters for place attributes

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
