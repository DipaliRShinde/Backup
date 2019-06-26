package com.stackroute.hackathon.SwitchDemo;

public class Main {
    public static void main(String[] args)
    {
        LightBulb lightBulb=new LightBulb();
        lightBulb.turnOff();
        lightBulb.turnOn();

        ElectricPowerSwitch electricPowerSwitch=new ElectricPowerSwitch(lightBulb);
        electricPowerSwitch.isOn();
        electricPowerSwitch.press();

        Fan fan=new Fan();
        fan.turnOff();
        fan.turnOn();

    }
}
