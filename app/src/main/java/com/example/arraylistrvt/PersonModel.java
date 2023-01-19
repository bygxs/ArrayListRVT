package com.example.arraylistrvt;

public class PersonModel {
    String persons;
    String cars;
    String pets;
    int image;

    public PersonModel(String persons, String cars, String pets, int image) {
        this.persons = persons;
        this.cars = cars;
        this.pets = pets;
        this.image = image;

    }

    public String getPersons() {
        return persons;
    }

    public String getCars() {
        return cars;
    }

    public String getPets() {
        return pets;
    }

    public int getImage() {
        return image;
    }
}
