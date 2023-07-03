package org.example;

public class Visitor {

    private int visitorId;
    private String firstName;
    private String lastName;
    private int credits;

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Visitor(int visitorId, String firstName, String lastName, int credits) {
        this.visitorId = visitorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credits = credits;
    }
}
