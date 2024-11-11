package com.design.patterns.builder;

public class Computer {
    private String RAM;
    private String HDD;
    private int numberOfCPUs;
    private boolean isBluetoothEnabled;
    private boolean isGraphicsEnabled;


    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public void setGraphicsEnabled(boolean graphicsEnabled) {
        isGraphicsEnabled = graphicsEnabled;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public int getNumberOfCPUs() {
        return numberOfCPUs;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

}
