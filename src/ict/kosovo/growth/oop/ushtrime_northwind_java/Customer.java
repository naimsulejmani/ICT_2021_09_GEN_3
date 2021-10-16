package ict.kosovo.growth.oop.ushtrime_northwind_java;

public class Customer {
    private int id;
    private String companyName;
    private String contactName;
    private String address;
    private String city;
    private String country;

    public Customer(int id, String companyName, String contactName, String address, String city, String country) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
