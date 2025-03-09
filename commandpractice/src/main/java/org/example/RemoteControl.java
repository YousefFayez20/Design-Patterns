package org.example;

public class RemoteControl {
    Command command;
    Command lastCommand;

    void SetCommand( Command command){
        this.command = command;
    }
    void turnOn(){
        command.execute();
        lastCommand = command;
    }
    public void pressUndoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
        }}


}
