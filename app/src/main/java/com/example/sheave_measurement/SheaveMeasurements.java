package com.example.sheave_measurement;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;

public class SheaveMeasurements implements Serializable {



    private String inspectionDate;
    private String inspectionSite;
    private String inspector;
    private String phone;
    private String email;
    private String notes1;
    private String inspectionType;
    private String blockModel;
    private int serialNumber;
    private int numberOfSheaves;
    private float outsideSheaveDiam;
    private String nominalRopeSize;
    private String notes2;

    public SheaveMeasurements() {
    }

    public SheaveMeasurements(String inspectionDate, String inspectionSite, String inspector, String phone, String email, String notes1, String inspectionType, String blockModel, int serialNumber, int numberOfSheaves, float outsideSheaveDiam, String nominalRopeSize, String notes2) {
        this.inspectionDate = inspectionDate;
        this.inspectionSite = inspectionSite;
        this.inspector = inspector;
        this.phone = phone;
        this.email = email;
        this.notes1 = notes1;
        this.inspectionType = inspectionType;
        this.blockModel = blockModel;
        this.serialNumber = serialNumber;
        this.numberOfSheaves = numberOfSheaves;
        this.outsideSheaveDiam = outsideSheaveDiam;
        this.nominalRopeSize = nominalRopeSize;
        this.notes2 = notes2;
    }


    public String toString() {
        return "\nInspection Date: " + String.format("%25s",inspectionDate)  +
                "\nInspection Site: " + String.format("%25s",inspectionSite) +
                "\nInspector: " + String.format("%25s",inspector) +
                "\nPhone: " + String.format("%25s",phone) +
                "\nemail: " + String.format("%25s",email) +
                "\nNote 1: " + String.format("%25s",notes1) +
                "\nInspection Type: " + String.format("%25s",inspectionType) +
                "\nBlock Model: " + String.format("%25s",blockModel) +
                "\nserial Number: " + String.format("%25s",serialNumber) +
                "\nNumber of Sheaves: " + String.format("%25s",numberOfSheaves) +
                "\nOutside Sheave Diameter: " + String.format("%25s",outsideSheaveDiam) +
                "\nNominal Rope Size: " + String.format("%25s",nominalRopeSize) +
                "\nNote 2: " + String.format("%25s",notes2);
    }


    //setters
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public void setInspectionSite(String inspectionSite) {
        this.inspectionSite = inspectionSite;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotes1(String notes1) {
        this.notes1 = notes1;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    public void setBlockModel(String blockModel) {
        this.blockModel = blockModel;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setNumberOfSheaves(int numberOfSheaves) {
        this.numberOfSheaves = numberOfSheaves;
    }

    public void setOutsideSheaveDiam(float outsideSheaveDiam) {
        this.outsideSheaveDiam = outsideSheaveDiam;
    }

    public void setNominalRopeSize(String nominalRopeSize) {
        this.nominalRopeSize = nominalRopeSize;
    }

    public void setNotes2(String notes2) {
        this.notes2 = notes2;
    }


    //getters

    public String getInspectionDate() {
        return inspectionDate;
    }

    public String getInspectionSite() {
        return inspectionSite;
    }

    public String getInspector() {
        return inspector;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes1() {
        return notes1;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public String getBlockModel() {
        return blockModel;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getNumberOfSheaves() {
        return numberOfSheaves;
    }

    public float getOutsideSheaveDiam() {
        return outsideSheaveDiam;
    }

    public String getNominalRopeSize() {
        return nominalRopeSize;
    }

    public String getNotes2() {
        return notes2;
    }


}
