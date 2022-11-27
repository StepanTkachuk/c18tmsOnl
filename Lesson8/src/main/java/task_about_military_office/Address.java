package task_about_military_office;

public class Address {
    private String country;
    String city;
    private String allAddress;


    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getAllAddress() {
        return country + " " + city;
    }

}
