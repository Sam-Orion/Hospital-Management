package com.SamOrion.blc;

public class Patient {

    private static int idCounter = 0;
    private int id;
    private String name;
    private String gender;
    private int age;

    public Patient (String name, String gender, int age) {
        this.id = ++idCounter;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age;
    }
}
