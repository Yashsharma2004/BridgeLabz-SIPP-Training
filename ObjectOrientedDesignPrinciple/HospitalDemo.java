package oops.principles;

import java.util.*;

class Patient {
    String name;
    List<Doctor> consultedDoctors;

    Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    void viewDoctors() {
        System.out.println("Patient: " + name + " consulted with:");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.name);
        }
    }
}

class Doctor {
    String name;
    List<Patient> patients;

    Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.name);
        patients.add(patient);
        patient.addDoctor(this);
    }

    void viewPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.name);
        }
    }
}

class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    Hospital(String name) {
        this.name = name;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Rajeev");
        Doctor d2 = new Doctor("Ananya");

        Patient p1 = new Patient("Ramesh");
        Patient p2 = new Patient("Seema");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        d1.viewPatients();
        d2.viewPatients();

        p1.viewDoctors();
        p2.viewDoctors();
    }
}

