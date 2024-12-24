package com.SamOrion.elc;
import com.SamOrion.blc.Patient;
import com.SamOrion.blc.Doctor;
import com.SamOrion.blc.Appointment;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {

    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();
    private static final ArrayList<Appointment> appointments = new ArrayList<>();

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
        } while (choice != 0);

        scan.close();
    }

    private static void addPatient (Scanner scan) {
        System.out.print("Enter Patient Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Enter Patient Gender: ");
        String gender = scan.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = scan.nextInt();

        Patient patient = new Patient(name, gender, age);
        patients.add(patient);
        System.out.println("Patient added successfully");
        System.out.println();
    }

    private static void addDoctor (Scanner scan) {
        System.out.print("Enter Doctor Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Enter Doctor Speciality: ");
        String speciality = scan.nextLine();

        Doctor doctor = new Doctor(name, speciality);
        doctors.add(doctor);
        System.out.println("Doctor added successfully");
        System.out.println();
    }

    private static void scheduleAppointment (Scanner scan) {
        System.out.print("Enter Patient ID: ");
        int pid = scan.nextInt();
        System.out.print("Enter Doctor ID: ");
        int did = scan.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        scan.nextLine();
        String date = scan.nextLine();

        Patient patient = findPatientById(pid);
        Doctor doctor = findDoctorById(did);

        if (patient != null && doctor != null){
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully");
            System.out.println();
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");
            System.out.println();
        }
    }

    private static Patient findPatientById(int pid) {
        for (Patient patient : patients) {
            if (patient.getId() == pid) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(int did) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == did) {
                return doctor;
            }
        }
        return null;
    }

    private static void viewPatients() {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Choose: ");
        System.out.println("1. View All Patients");
        System.out.println("2. View a specific Patient");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                for (Patient patient : patients) {
                    System.out.println(patient);
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Enter Patient id: ");
                int pid = scan.nextInt();
                Patient patient = findPatientById(pid);
                if (patient != null) System.out.println(patient);
                else System.out.println("Invalid Patient ID.");
                System.out.println();
                break;
            case 0:
                System.out.println("Exiting............");
                System.out.println();
                break;
            default :
                System.out.println("Invalid Choice! Please try again");
                System.out.println();
        }
    }

    private static void viewDoctors() {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Choose: ");
        System.out.println("1. View All Doctors");
        System.out.println("2. View a specific Doctor");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                for (Doctor doctor : doctors) {
                    System.out.println(doctor);
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Enter Doctor id: ");
                int did = scan.nextInt();
                Doctor doctor = findDoctorById(did);
                if (doctor != null) System.out.println(doctor);
                else System.out.println("Invalid Doctor ID.");
                System.out.println();
                break;
            case 0:
                System.out.println("Exiting............");
                System.out.println();
                break;
            default :
                System.out.println("Invalid Choice! Please try again");
                System.out.println();
        }
    }

    private static void viewAppointments() {
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Choose: ");
        System.out.println("1. View All Appointments");
        System.out.println("2. View a specific Appointment");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                for (Appointment appointment : appointments) {
                    System.out.println(appointment);
                }
                System.out.println();
                break;
            case 2:
                System.out.print("Enter Appointment id: ");
                int aid = scan.nextInt();
                Appointment appointment = findAppointmentById(aid);
                if (appointment != null) System.out.println(appointment);
                else System.out.println("Invalid Appointment ID.");
                System.out.println();
                break;
            case 0:
                System.out.println("Exiting............");
                System.out.println();
                break;
            default :
                System.out.println("Invalid Choice! Please try again");
                System.out.println();
        }
    }

    private static Appointment findAppointmentById(int aid) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == aid) {
                return appointment;
            }
        }
        return null;
    }
}