package org.example;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;

    }
    @Override
    public void quack() {
        turkey.fly();
    }

    @Override
    public void fly() {

        turkey.gobble();
    }
}
