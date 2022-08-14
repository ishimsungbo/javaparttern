package com.command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("안방");

        LightOnCommand loomLight = new LightOnCommand(light);
        remote.setSlot(loomLight);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }

}
