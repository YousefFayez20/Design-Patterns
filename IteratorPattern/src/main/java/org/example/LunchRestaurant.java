package org.example;

import java.util.Iterator;

public class LunchRestaurant {
    MenuItem[] items;
    int max = 6;


    public LunchRestaurant(){
        items = new MenuItem[max];
        items[0] = new MenuItem("Meat", 120);
        items[1] = new MenuItem("Grilled Kofta", 100);
    }

    public AppIterator createIterator(){
        return new LunchIterator();
    }
    private class LunchIterator implements AppIterator{
        int i = 0;
        @Override
        public boolean hasNext() {
            return i < items.length;
        }

        @Override
        public Object next() {
            return hasNext()? items[i++] : null;
        }
    }



}
