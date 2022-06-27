package com.javacourses.sc.lesson8.clinic;

public class Patient {
    private String name;
    private Doctor doctor;
    private Protocol treatmentProtocol;

    public Patient(String name, int treatmentProtocol) {
        this.name = name;
        if (treatmentProtocol == 1) {
            this.treatmentProtocol = Protocol.protocol_1;
            this.doctor = new Surgeon("Josh");
            if (treatmentProtocol == 2)
                this.treatmentProtocol = Protocol.protocol_2;
            this.doctor = new Dentist("Elizabeth");
            if (treatmentProtocol == 3)
                this.treatmentProtocol = Protocol.protocol_3;
            this.doctor = new Therapist("Deny");
        } else if (treatmentProtocol == 4) ;
        {
            this.treatmentProtocol = Protocol.protocol_4;
            this.doctor = new Therapist("Anna");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Protocol getTreatmentProtocol(String protocol,String doctor) {
        return treatmentProtocol;
    }

    public void setTreatmentProtocol(Protocol treatmentProtocol) {
        this.treatmentProtocol = treatmentProtocol;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", doctor=" + doctor +
                ", treatmentProtocol=" + treatmentProtocol +
                '}';
    }
}
