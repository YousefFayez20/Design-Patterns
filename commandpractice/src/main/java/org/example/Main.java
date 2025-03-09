package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      RemoteControl remoteControl= new RemoteControl();
      fan Fan = new fan();
      Command fancontroller = new SwitchLightCommand(Fan);
      remoteControl.SetCommand(fancontroller);
      remoteControl.turnOn();
      remoteControl.pressUndoButton();

    }
}