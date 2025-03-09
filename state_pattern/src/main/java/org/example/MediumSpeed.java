package org.example;

public class MediumSpeed implements IState{
    @Override
    public void NextState(CeilingFan ceilingFan) {
        System.out.println("Running on Medium Speed");
        ceilingFan.SetNextState(new HighSpeed());
    }
}
