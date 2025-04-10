package src.model;

import java.util.LinkedList;

// Patient class so we can use it later
public class Patient {

    public int id;
    public String name;
    public int age;
    public String contact;
    // public PatientHistory history;
    public Patient next;
    public int priority;

    public LinkedList<String> medicalHistory;

    // constructor for patient to set his name, age, etc.. 
    public Patient(int id, String name, int age, String contact) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.next = null;
        // history = new PaitentHistory();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Contact: " + contact;
    }
}
