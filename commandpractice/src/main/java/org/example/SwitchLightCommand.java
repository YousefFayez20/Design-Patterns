package org.example;

public class SwitchLightCommand implements Command{
    fan Fan;

    public SwitchLightCommand(fan fan) {
        Fan = fan;
    }

    @Override
    public void execute() {
        Fan.turnOn();
    }

    @Override
    public void undo() {
   Fan.TurnOff();
    }
}
