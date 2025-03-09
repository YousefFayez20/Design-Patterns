package org.example;

public class HighSpeed implements IState{
    @Override
    public void NextState(CeilingFan ceilingFan) {
        System.out.println("Running on High Speed");
        ceilingFan.SetNextState(new VeryHighSpeed());
    }
}
