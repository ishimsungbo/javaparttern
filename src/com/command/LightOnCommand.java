package com.command;

public class LightOnCommand implements Command{

    Light light;  //느슨한 연결
    
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
