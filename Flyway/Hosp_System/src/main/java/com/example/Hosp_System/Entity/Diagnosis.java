package com.example.Hosp_System.Entity;

public class Diagnosis {
    int id;
    String name;
    String treatment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Diagnosis(int id, String name, String treatment) {
        this.id = id;
        this.name = name;
        this.treatment = treatment;
    }
    public Diagnosis() {

    }
}
