package model;

public class TreatmentHistory {
    private String patientId;
    private String doctorId;
    private String diagnosis;
    private String treatmentDate;
    private String notes;

    public TreatmentHistory(String patientId, String doctorId, String diagnosis, String treatmentDate, String notes) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.treatmentDate = treatmentDate;
        this.notes = notes;
    }

    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public String getDiagnosis() { return diagnosis; }
    public String getTreatmentDate() { return treatmentDate; }
    public String getNotes() { return notes; }

    @Override
    public String toString() {
        return "Treatment Date: " + treatmentDate +
               "\nPatient ID: " + patientId +
               "\nDoctor ID: " + doctorId +
               "\nDiagnosis: " + diagnosis +
               "\nNotes: " + notes + "\n";
    }
}
