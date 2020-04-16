package com.example.batchprocessing;

public class PersonJAva {
    private String lastName;
    private String fristName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    @Override
    public String toString() {
        return "PersonJAva{" +
                "lastName='" + lastName + '\'' +
                ", fristName='" + fristName + '\'' +
                '}';
    }
}
