package org.example;

public class LowSpeed implements IState{
    @Override
    public void NextState(CeilingFan ceilingFan)  {
        System.out.println("Running on low speed");
        ceilingFan.SetNextState(new MediumSpeed());
    }
}
