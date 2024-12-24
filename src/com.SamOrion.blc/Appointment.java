package com.SamOrion.blc;

public class Appointment {

    private static int idCounter = 1;
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment (Patient patient, Doctor doctor, String date) {
        this.id = idCounter++;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Appointment: [ Patient: " + patient + ", Doctor: " + doctor + ", Date: " + date + " ]";
    }
}