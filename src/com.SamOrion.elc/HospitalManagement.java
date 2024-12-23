package com.SamOrion.elc;

import java.util.ArrayList;
import java.util.Scanner;

import com.SamOrion.blc.Patient;

public class HospitalManagement {

    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    private static void addPatient (Scanner scan) {
        System.out.print("Enter Patient Name: ");
        String name = scan.next();
        System.out.print("Enter Patient Gender: ");
        String gender = scan.next();
        System.out.print("Enter Patient Age: ");
        int age = scan.nextInt();

        Patient patient = new Patient(name, gender, age);
        patients.add(patient);
        System.out.println("Patient added successfully");
    }

    private static void addDoctor (Scanner scan) {
        System.out.print("Enter Doctor Name: ");
        String name = scan.next();
        System.out.print("Enter Doctor Speciality: ");
        String speciality = scan.next();

        Doctor doctor = new Patient(name, speciality);
        doctors.add(doctor);
        System.out.println("Doctor added successfully");
    }

    private static void addAppointment (Scanner scan) {
//        System.out.print("Enter Patient Name: ");
//        String name = scan.next();
//        System.out.print("Enter Patient Gender: ");
//        String gender = scan.next();
//        System.out.print("Enter Patient Age: ");
//        int age = scan.nextInt();
//
//        Patient patient = new Patient(name, gender, age);
//        patients.add(patient);
//        System.out.println("Patient added successfully");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 :
                    addPatient(scan);
                    break;
                case 2 :
                    addDoctor(scan);
                    break;
                case 3 :
                    scheduleAppointment(scan);
                    break;
                case 4 :
                    viewPatients();
                    break;
                case 5 :
                    viewDoctors();
                    break;
                case 6 :
                    viewAppointments();
                    break;
                case 0 :
                    System.out.println("Exiting.....");
                    break;
                default :
                    System.out.println("Invalid Choice! Please try again");
            }
        } while (choice != 0)
    }
}