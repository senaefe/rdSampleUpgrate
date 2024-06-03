package com.rd.Department;

public class Personnel {
    private String firstName;
    private String lastName;
    private String position;

    public Personnel(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Position: " + position;
    }
}
