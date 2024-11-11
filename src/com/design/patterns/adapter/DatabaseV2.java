package com.design.patterns.adapter;
// Client class
public class DatabaseV2 implements Database {
    DatabaseUpgrader V1ToV2Adapter;
    public DatabaseV2(DatabaseUpgrader adapter) {
        this.V1ToV2Adapter = adapter;
    }
    @Override
    public void onUpgrade() {
        V1ToV2Adapter.upgrade();
    }
}
