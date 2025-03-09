package org.example;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("turkey is gobbling");
    }

    @Override
    public void fly() {

        System.out.println("turkey is flying");
    }
}
