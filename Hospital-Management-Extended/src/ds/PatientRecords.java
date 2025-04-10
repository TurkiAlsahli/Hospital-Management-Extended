package src.ds;

import src.model.Patient;

// This class manages a list of patients using a linked list
public class PatientRecords {

    private Patient head; // The first patient in the list

    // Constructor: Starts with an empty list
    public PatientRecords() {
        head = null;
    }

    // Adds a new patient to the END of the list
    public void addPatient(Patient patient) {
        if (head == null) {
             // If the list is empty, this patient becomes the head
            head = patient;
        } else {
            // Traverse to the end of the list
            Patient curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            // Add the new patient at the end
            curr.next = patient;
        }
    }

    // Updates a patient's details by their ID
    public boolean updatePatient(int id, String newName, int newAge, String newContact) {
        Patient curr = head;
        while (curr != null) {
            if (curr.id == id) {
                // After finding the patient Update their info
                curr.name = newName;
                curr.age = newAge;
                curr.contact = newContact;
                return true;
            }
            curr = curr.next;
        }
        return false; // Patient not found
    }

    // Removes a patient by their ID
    public boolean removePatient(int id) {
        if (head == null) {
            return false;
        }
        // If the head is the patient to remove
        if (head.id == id) {
            head = head.next; // Move head to the next patient
            return true;
        }
        // Search for the patient in the rest of the list
        Patient prev = head;
        Patient curr = head.next;
        while (curr != null) {
            if (curr.id == id) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
    
     // Prints all patients in the list
    public void displayAll() {
        if (head == null) {
            System.out.println("No patients in system");
        } else {
            Patient curr = head;
            while (curr != null) {
                System.out.println(curr);
                curr = curr.next;
            }
        }
    }
}
