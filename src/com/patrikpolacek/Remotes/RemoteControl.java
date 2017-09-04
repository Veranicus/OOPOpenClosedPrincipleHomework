package com.patrikpolacek.Remotes;

import com.patrikpolacek.Devices.Device;

public class RemoteControl {

    public static void chooseDevice(Device device){

    }

    public void turnOnDevice(Device device){
        if(device.isState()){
            System.out.println(device.getName() + " is already on");
        }else {
            System.out.println("Turning " + device.getName() + " on");
        }
    }

    public void turnOffDevice(Device device){
        if(device.isState()) {
            System.out.println("Turning " + device.getName() + " off");
        }else {
            System.out.println(device.getName() + " is already turned off");
        }
    }


}
