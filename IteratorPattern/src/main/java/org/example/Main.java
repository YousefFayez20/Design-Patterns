package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DinnerRestaurant rest1 = new DinnerRestaurant();
        LunchRestaurant rest2 = new LunchRestaurant();
        Waitress waitress = new Waitress(rest1, rest2);
        waitress.PrintMenus();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}