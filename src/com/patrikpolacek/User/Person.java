package com.patrikpolacek.User;

import com.patrikpolacek.Devices.Projector;
import com.patrikpolacek.Devices.SurroundSystem;
import com.patrikpolacek.Devices.TV;
import com.patrikpolacek.Remotes.RemoteControl;

public class Person {

    public static void main(String[] args) {


        TV tv = new TV("Panasonic 213", false);
        SurroundSystem surroundSystem = new SurroundSystem("KOSS 2156132", true);
	    RemoteControl remoteControl = new RemoteControl();
	    remoteControl.turnOnDevice(tv);
	    remoteControl.turnOffDevice(surroundSystem);
	    Projector projector = new Projector("Dell 251", false);
	    remoteControl.turnOnDevice(projector);


    }
}
