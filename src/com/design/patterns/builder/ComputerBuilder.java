package com.design.patterns.builder;

public interface ComputerBuilder {
    ComputerBuilder buildHDD(String hdd);
    ComputerBuilder buildRAM(String ram);
    ComputerBuilder buildNoOfCPUs(int noOfCPUs);
    ComputerBuilder buildGraphicsCard(boolean isGraphicsCardEnabled);
    ComputerBuilder buildBluetoothEnabled(boolean isBluetoothEnabled);
    Computer build();
}
