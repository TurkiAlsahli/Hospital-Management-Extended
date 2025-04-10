package model;

public class DoctorAssignment {
    private String patientId;
    private String doctorId;
    private String role;
    private String startDate;

    public DoctorAssignment(String patientId, String doctorId, String role, String startDate) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.role = role;
        this.startDate = startDate;
    }

    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public String getRole() { return role; }
    public String getStartDate() { return startDate; }

    @Override
    public String toString() {
        return "Doctor Assignment:\n" +
               "Doctor ID: " + doctorId + "\n" +
               "Patient ID: " + patientId + "\n" +
               "Role: " + role + "\n" +
               "Start Date: " + startDate + "\n";
    }
}
