package src.main;

import src.ds.EmergencyQueue;
import src.ds.PatientRecords;
import src.model.Patient;

public class Main {

    public static void main(String[] args) {

        // 1. Patient Records
        System.out.println("Testing Patient Records...");
        PatientRecords patientRecords = new PatientRecords();
        Patient p1 = new Patient(101, "Ahmed", 25, "055555555");
        Patient p2 = new Patient(102, "Saud", 22, "052222222");
        patientRecords.addPatient(p1);
        patientRecords.addPatient(p2);
        patientRecords.displayAll();

        // 2. Emergency Queue
        System.out.println("\nTesting Emergency Queue...");
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        emergencyQueue.addPatient(p1, 3); // Less critical
        emergencyQueue.addPatient(p2, 1); // More critical
        System.out.print("Treating Patient: " + emergencyQueue.treatPatient().name);
    }
}
