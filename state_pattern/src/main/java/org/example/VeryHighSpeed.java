package org.example;

public class VeryHighSpeed implements IState{
    @Override
    public void NextState(CeilingFan ceilingFan) {
        System.out.println("Running on Very High Speed");
        ceilingFan.SetNextState(new NoSpeed());
    }
}
