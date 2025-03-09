package org.example;

public class NoSpeed implements IState{
    @Override
    public void NextState(CeilingFan ceilingFan) {
        System.out.println("Fan Turned Off");
        ceilingFan.SetNextState(new LowSpeed());

    }
}
