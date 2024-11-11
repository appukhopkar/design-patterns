package com.design.patterns.adapter;
// Adapter class
public class DatabaseUpgraderV1toV2 implements DatabaseUpgrader {
    DatabaseUpgraderV1 upgraderV1;

    public DatabaseUpgraderV1toV2() {
        upgraderV1 = new DatabaseUpgraderV1();
    }
    @Override
    public void upgrade() {
        upgraderV1.upgrade();
    }
}
