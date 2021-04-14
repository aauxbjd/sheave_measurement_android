package com.example.sheave_measurement;

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


    public String toString() {
        StringBuilder builder = new StringBuilder("Extras:\n");
//
//        Field[] fields = getClass().getDeclaredFields(); // get all the fields from your class.
//        for (Field f : fields) {                         // iterate over each field...
//            try {
//                if (f.get(this) != null) {               // evaluate field value.
//
//                    builder.append(f.getName())
//                            .append(":")
//                            .append(f.get(this))
//                            .append("\n");
//                    // Field is null
//                }
//            } catch (IllegalArgumentException ex) {
//                ex.printStackTrace();
//            } catch (IllegalAccessException ex) {
//                ex.printStackTrace();
//            }
//        }
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

//        builder.append(String.format("%-30s %-30s %n", "Inspection Date:", blockModel))
//                .append(String.format("%-30s %-30s %n", "Inspection:", inspectionType))
//        .append(String.format("%-30s %-30s %n", "asdg:", notes2))
//        .append(String.format("%-30s %-30s %n", "adgsa gasdgagsa:", outsideSheaveDiam));
//
//        return builder.toString();

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
