package model;

import java.util.ArrayList;

public class TreatmentStack {
    private ArrayList<TreatmentHistory> stack;
    private final int MAX_SIZE = 100;  // Optional: Set a limit for the stack size

    public TreatmentStack() {
        this.stack = new ArrayList<>();
    }

    // Push a new TreatmentHistory record to the stack
    public void push(TreatmentHistory treatment) {
        if (stack.size() < MAX_SIZE) {
            stack.add(treatment);
        } else {
            System.out.println("Stack overflow: Unable to add treatment history. Stack is full.");
        }
    }

    // Pop the most recent TreatmentHistory record from the stack
    public TreatmentHistory pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack underflow: No treatment history available.");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    // Peek at the most recent TreatmentHistory record without removing it
    public TreatmentHistory peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return stack.size();
    }
}
