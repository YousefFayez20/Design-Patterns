/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decoratordp;

/**
 *
 * @author DELL
 */
public class DarkRoast extends Beverage {
public DarkRoast(){
description = "dark roast coffee";

}
    @Override
    public double cost() {
        return 1.3;
    }
    
}
