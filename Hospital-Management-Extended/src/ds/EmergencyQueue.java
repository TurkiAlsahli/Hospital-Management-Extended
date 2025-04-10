package src.ds;

import src.model.Patient;

public class EmergencyQueue {

    // This is the first patient in the emergency queue (highest priority comes first)
    private Patient head;

    // Adds a new patient to the emergency queue based on their priority
    public void addPatient(Patient patient, int priority) {
        // Set the priority of the patient
        patient.priority = priority;

        // If the queue is empty OR the new patient has higher priority than the head
        if (head == null || priority < head.priority) {
            // Insert the new patient at the beginning
            patient.next = head;
            head = patient;
        } else {
            // Start from the head
            Patient curr = head;

            // Move forward until we find where to insert based on priority
            while (curr.next != null && curr.next.priority <= priority) {
                curr = curr.next;
            }

            // Insert the new patient after current
            patient.next = curr.next;
            curr.next = patient;
        }
    }

    // Treats (removes) the patient with the highest priority from the queue
    public Patient treatPatient() {
        if (head == null) {
            // No patient to treat
            return null;
        }

        // Save the patient at the head (highest priority)
        Patient treated = head;

        // Move the head to the next patient
        head = head.next;

        // Return the treated patient
        return treated;
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

}
