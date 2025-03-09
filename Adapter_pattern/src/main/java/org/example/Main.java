package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Turkey turk = new WildTurkey();
        Duck TurkeyDuck = new TurkeyAdapter(turk);
        TurkeyDuck.fly();
        TurkeyDuck.quack();

    }
}