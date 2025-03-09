package org.example;

public class Coffee extends HotDrink{
    @Override
    public void brew() {
        System.out.println("brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding milk");
    }
}
