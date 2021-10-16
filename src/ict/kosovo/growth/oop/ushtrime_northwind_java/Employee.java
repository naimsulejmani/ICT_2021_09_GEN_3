package ict.kosovo.growth.oop.ushtrime_northwind_java;

public class Employee {
    private int id;
    private String company;
    private String lastName;
    private String firstName;
    private String emailAddress;
    private String jobTitle;
    private String address;
    private String city;
    private byte[] longBlob;

    public Employee() {

    }

    public Employee(int id, String company, String lastName, String firstName, String emailAddress, String jobTitle, String address, String city, byte[] longBlob) {
        this.id = id;
        this.company = company;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
        this.address = address;
        this.city = city;
        this.longBlob = longBlob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public byte[] getLongBlob() {
        return longBlob;
    }

    public void setLongBlob(byte[] longBlob) {
        this.longBlob = longBlob;
    }
}
