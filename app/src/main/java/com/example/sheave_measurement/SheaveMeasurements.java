package com.example.sheave_measurement;

import java.util.Date;

public class SheaveMeasurements {
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




    /****
     *
     * @param inspectionDate: Inspection Date
     * @param inspectionSite: Site
     * @param inspector: Inspectopr
     * @param phone: Phone
     * @param email: email
     * @param notes1: notes 1
     * @param inspectionType: Type
     * @param blockModel: Block Model
     * @param serialNumber: Serial number
     * @param numberOfSheaves: number of Sheaves
     * @param outsideSheaveDiam: Diameter
     * @param nominalRopeSize: Rope size
     * @param notes2: notes 2
     */

//    public SheaveMeasurements(Date inspectionDate, String inspectionSite, String inspector, String phone, String email, String notes1, String inspectionType, String blockModel, int serialNumber, int numberOfSheaves, float outsideSheaveDiam, String nominalRopeSize, String notes2) {
//        this.inspectionDate = inspectionDate;
//        this.inspectionSite = inspectionSite;
//        this.inspector = inspector;
//        this.phone = phone;
//        this.email = email;
//        this.notes1 = notes1;
//        this.inspectionType = inspectionType;
//        this.blockModel = blockModel;
//        this.serialNumber = serialNumber;
//        this.numberOfSheaves = numberOfSheaves;
//        this.outsideSheaveDiam = outsideSheaveDiam;
//        this.nominalRopeSize = nominalRopeSize;
//        this.notes2 = notes2;
//    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionSite() {
        return inspectionSite;
    }

    public void setInspectionSite(String inspectionSite) {
        this.inspectionSite = inspectionSite;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes1() {
        return notes1;
    }

    public void setNotes1(String notes1) {
        this.notes1 = notes1;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    public String getBlockModel() {
        return blockModel;
    }

    public void setBlockModel(String blockModel) {
        this.blockModel = blockModel;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getNumberOfSheaves() {
        return numberOfSheaves;
    }

    public void setNumberOfSheaves(int numberOfSheaves) {
        this.numberOfSheaves = numberOfSheaves;
    }

    public float getOutsideSheaveDiam() {
        return outsideSheaveDiam;
    }

    public void setOutsideSheaveDiam(float outsideSheaveDiam) {
        this.outsideSheaveDiam = outsideSheaveDiam;
    }

    public String getNominalRopeSize() {
        return nominalRopeSize;
    }

    public void setNominalRopeSize(String nominalRopeSize) {
        this.nominalRopeSize = nominalRopeSize;
    }

    public String getNotes2() {
        return notes2;
    }

    public void setNotes2(String notes2) {
        this.notes2 = notes2;
    }

//    public String toString(){
//        return
//
//    }

}
