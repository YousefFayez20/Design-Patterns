package org.example;

public class BackEndDev implements Employee{
    String title;
    public BackEndDev(String title){
        this.title = title;
    }
    @Override
    public void showDetails() {
        System.out.println("toz fe el front end, ana " + this.title + "elly ba2ool keda");
    }
}
