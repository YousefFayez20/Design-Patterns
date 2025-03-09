/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategydp2;

/**
 *
 * @author DELL
 */
public abstract class Duck {
    public int id;
    public String name;
    public static int counter = 0;
    FlyingBehaviour f;
    QuackingBehaviour q;
    
    public Duck(){
    this.id = counter++;
    this.name = "Duck Number: " +this.id;
    
    }
    public void display(){
        System.out.println("Hey, I'm duck Number :" +this.id);
    }
        public void swim(){
        System.out.println("Hey, I'm a swimming duck Number :" +this.id);
    }
        public void perform(){
        
            display();
            swim();
            System.out.println(f.fly());
            System.out.println(q.Quack());
        
        }
        public void gotshot(){
        this.f =  new NoFly();
        this.q = new Quacking();
        
        }
        
        
}
