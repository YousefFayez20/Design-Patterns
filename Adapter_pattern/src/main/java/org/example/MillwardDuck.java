package org.example;

public class MillwardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Millward is quaking");
    }

    @Override
    public void fly() {
        System.out.println("Millward is flying");
    }
}
