package com.patrikpolacek.Devices;

public abstract class Device {
    private String name;
    private boolean state;

    public Device(String name, boolean state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public boolean isState() {
        return state;
    }
}
