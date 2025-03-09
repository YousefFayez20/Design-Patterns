package org.example;

public class CeilingFan {
private IState state;

CeilingFan(){
    state = new LowSpeed();
}
public void request(){
    state.NextState(this);
}
public void SetNextState(IState NewState){
    state = NewState;
}


}
