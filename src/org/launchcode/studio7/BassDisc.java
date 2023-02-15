package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BassDisc {
    //Class variable
    private String discData;
    private HashMap<String, String>discInfo;


    private final int storageCapacityInMB;
    private final int spinSpeedInRMP;

    //Constructor
    public BassDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();


        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRMP = spinSpeed;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
    }

    public BassDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }

    //Methods
    //Getters and Setters

    public int getStorageCapacity() {return this.storageCapacityInMB;}
    public int getSpinSpeed() { return this.spinSpeedInRMP;}





    protected void writeData(String data){
        this.discData += data;

    }
    public String readData() {
        return this.discData;
    }
    public HashMap<String, String >getInfo() {
        return this.discInfo;
    }


}
