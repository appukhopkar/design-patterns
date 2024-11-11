package com.design.patterns.builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer constructComputer() {
        //Give step by step specifications for object creation
        // then finally call build() to create complete object
        return computerBuilder
                .buildHDD("1 TB")
                .buildRAM("32 GB")
                .buildNoOfCPUs(5)
                .buildBluetoothEnabled(true)
                .buildGraphicsCard(true)
                .build();
    }
}
