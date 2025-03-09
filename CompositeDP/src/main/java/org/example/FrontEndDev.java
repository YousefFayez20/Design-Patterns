package org.example;

public class FrontEndDev implements Employee{
String title;

    public FrontEndDev(String title) {
        this.title = title;
    }

    @Override
    public void showDetails() {
        System.out.println("Hello from Front end dev." + this.title);
    }
}
