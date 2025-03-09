/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratordp;

/**
 *
 * @author DELL
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
    this.beverage = beverage;
    }
    @Override
    public String Description() {
        return beverage.Description() +", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.66;
    }
    
}
