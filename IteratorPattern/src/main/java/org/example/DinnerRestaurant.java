package org.example;

import java.util.ArrayList;

public class DinnerRestaurant {

    ArrayList<MenuItem> items;

    public DinnerRestaurant(){
        items = new ArrayList<>();
        items.add(new MenuItem("Omelet",50));
        items.add(new MenuItem("Chicken", 100));
    }
    public AppIterator createIterator(){
        return new DinnerIterator();
    }

    private class DinnerIterator implements AppIterator{

        int index = 0;
        @Override
        public boolean hasNext() {
            return index < items.size();
        }

        @Override
        public Object next() {
            return hasNext() ?  items.get(index++) : null;
        }
    }

}


