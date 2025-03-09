package org.example;

public class Tea extends HotDrink{
    @Override
    public void brew() {
        System.out.println("brewing tea");
    }

    @Override
    public void addCondiments() {

        System.out.println("adding n3na3");
    }
}
