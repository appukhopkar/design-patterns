package com.design.patterns.builder;

public class ConcreteComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public ConcreteComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public ComputerBuilder buildHDD(String hdd) {
        computer.setHDD(hdd);
        return this;
    }

    @Override
    public ComputerBuilder buildRAM(String ram) {
        computer.setRAM(ram);
        return this;
    }

    @Override
    public ComputerBuilder buildNoOfCPUs(int noOfCPUs) {
        computer.setNumberOfCPUs(noOfCPUs);
        return this;
    }

    @Override
    public ComputerBuilder buildGraphicsCard(boolean isGraphicsCardEnabled) {
        computer.setGraphicsEnabled(isGraphicsCardEnabled);
        return this;
    }

    @Override
    public ComputerBuilder buildBluetoothEnabled(boolean isBluetoothEnabled) {
        computer.setBluetoothEnabled(isBluetoothEnabled);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
