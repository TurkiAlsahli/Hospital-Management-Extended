package main;

import model.TreatmentHistory;
import model.TreatmentStack;
import model.DoctorAssignment;

import java.util.*;

public class Main {
    private static final Map<String, TreatmentStack> patientTreatmentStacks = new HashMap<>();
    private static final List<DoctorAssignment> doctorAssignments = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Treatment History");
            System.out.println("2. View Treatment History");
            System.out.println("3. Assign Doctor to Patient");
            System.out.println("4. View Doctor Assignments");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addTreatmentHistory();
                case 2 -> viewTreatmentHistory();
                case 3 -> assignDoctor();
                case 4 -> viewDoctorAssignments();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 0);
    }

    // Method to add a treatment history record using the TreatmentStack
    private static void addTreatmentHistory() {
        System.out.print("Enter Patient ID: ");
        String pid = scanner.nextLine();
        System.out.print("Enter Doctor ID: ");
        String did = scanner.nextLine();
        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();
        System.out.print("Enter Treatment Date: ");
        String date = scanner.nextLine();
        System.out.print("Enter Notes: ");
        String notes = scanner.nextLine();

        TreatmentHistory th = new TreatmentHistory(pid, did, diagnosis, date, notes);

        // Check if the patient already has a treatment stack, otherwise create one
        patientTreatmentStacks.putIfAbsent(pid, new TreatmentStack());
        TreatmentStack stack = patientTreatmentStacks.get(pid);
        
        // Push the treatment history to the patient's treatment stack
        stack.push(th);
        System.out.println("Treatment added!");
    }

    // Method to view the most recent treatment history using the TreatmentStack
    private static void viewTreatmentHistory() {
        System.out.print("Enter Patient ID to search: ");
        String pid = scanner.nextLine();

        TreatmentStack stack = patientTreatmentStacks.get(pid);

        if (stack == null || stack.isEmpty()) {
            System.out.println("No treatment history found for this patient.");
            return;
        }

        // Peek the most recent treatment history record
        TreatmentHistory th = stack.peek();
        System.out.println("Most Recent Treatment History for Patient ID " + pid + ":");
        System.out.println(th);
    }

    // Method to assign a doctor to a patient
    private static void assignDoctor() {
        System.out.print("Enter Patient ID: ");
        String pid = scanner.nextLine();
        System.out.print("Enter Doctor ID: ");
        String did = scanner.nextLine();
        System.out.print("Enter Role (e.g., Surgeon, GP): ");
        String role = scanner.nextLine();
        System.out.print("Enter Start Date: ");
        String date = scanner.nextLine();

        DoctorAssignment da = new DoctorAssignment(pid, did, role, date);
        doctorAssignments.add(da);
        System.out.println("Doctor assigned!");
    }

    // Method to view doctor assignments
    private static void viewDoctorAssignments() {
        if (doctorAssignments.isEmpty()) {
            System.out.println("No doctor assignments available.");
            return;
        }

        for (DoctorAssignment da : doctorAssignments) {
            System.out.println(da);
        }
    }
}
