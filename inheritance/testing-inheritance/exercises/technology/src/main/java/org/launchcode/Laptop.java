package org.launchcode;

public class Laptop extends Computer{
    private String userName;

    public Laptop(String userName, String brand) {
        super(brand);
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String greeting() {return "Hello, " + userName + "!";}
}
