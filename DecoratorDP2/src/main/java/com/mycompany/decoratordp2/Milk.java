/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratordp2;

/**
 *
 * @author DELL
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage){
    this.beverage = beverage;
    }
    @Override
    public String Description() {
        return beverage.Description() + ", milk";
    }

    @Override
    public double cost() {
       return beverage.cost() +0.3;
    }
    
}
