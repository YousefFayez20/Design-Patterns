package org.example;

public class Waitress {
    DinnerRestaurant restaurant1;
    LunchRestaurant restaurant2;

    public Waitress(DinnerRestaurant restaurant1, LunchRestaurant restaurant2){
        this.restaurant1 = restaurant1;
        this.restaurant2 = restaurant2;
    }
    public void PrintMenus(){
        AppIterator iteratorDinner = restaurant1.createIterator();
        AppIterator iteratorLunch = restaurant2.createIterator();
        printmenu(iteratorLunch);
        printmenu(iteratorDinner);

    }
    private void printmenu(AppIterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item);
        }
    }

}
