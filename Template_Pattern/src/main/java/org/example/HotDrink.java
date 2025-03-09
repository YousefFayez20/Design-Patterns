package org.example;

public abstract class HotDrink {
    final public void prepare_drink(){
boiling();
brew();
addCondiments();
    }
    private void boiling(){
        System.out.println("Water is boiling");
    }
     abstract void brew();
    private void PourInCup(){
        System.out.println("Pouring in cup");
    }
     abstract void addCondiments();


}
