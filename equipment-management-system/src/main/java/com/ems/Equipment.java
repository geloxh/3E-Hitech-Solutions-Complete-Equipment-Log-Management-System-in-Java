package com.ems;

public class Equipment {
    
    private int equipmentID;
    private String equipmentName;
    private String equipmentCode;
    private int quantity;
    private String supplier;
    private String office;

    public Equipment(int equipmentID, String equipmentName, String equipmentCode, int quantity, String supplier, String office) {
        this.equipmentID = equipmentID;
        this.equipmentName = equipmentName;
        this.equipmentCode = equipmentCode;
        this.quantity = quantity;
        this.supplier = supplier;
        this.office = office;
    }

    // GETTERS AND SETTERS
    public int getEquipmentID () {
        return equipmentID;
    }
    public void setEquipmentID (int equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getEquipmentName () {
        return equipmentName;
    }
    public void setEquipmentCode (String equipmentName) {
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentCode () {
        return equipmentCode;
    }
    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public int getQuantity () {
        return quantity;
    }
    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public String getSupplier () {
        return supplier;
    }
    public void setSupplier (String supplier) {
        this.supplier = supplier;
    }

    public String getOffice () {
        return office;
    }
    public void setOffice (String office) {
        this.office = office;
    }
}
