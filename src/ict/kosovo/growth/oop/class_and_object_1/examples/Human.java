package ict.kosovo.growth.oop.class_and_object_1.examples;

public class Human {
    private String name;
    private String lname;
    private String state;
    private String city;
    private int age;
    private String job;

    Human(String name, String lname, String state, String city, int age, String job) {

        this.setName(name);
        this.setLname(lname);
        this.setState(state);
        this.setCity(city);
        this.setAge(age);
        this.setJob(job);


    }

    public String getName() {
        return name;
    }

    public String getLname() {
        return lname;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void sleep() {
        System.out.println("You are sleeping!");
    }

    public void eat() {
        System.out.println("You are eating!");
    }

    public void coffeTime() {
        System.out.println("Now is  time for coffe");
    }


}
