class Tourist {
    private String name;
    private int age;
    private String mobileNo;
    private String nationality;
    private String gender;

    public Tourist(String name, int age, String mobileNo, String nationality, String gender) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.nationality = nationality;
        this.gender = gender;
    }

    // Getters and setters for tourist attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}