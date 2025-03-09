/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decoratordp;

/**
 *
 * @author DELL
 */
public class DecoratorDP {

    public static void main(String[] args) {
        Beverage Drink1 = new DarkRoast();
        CondimentDecorator D1withAdds = new Mocha(Drink1);
         System.out.println(D1withAdds.Description());
         System.out.println(D1withAdds.cost());
        D1withAdds = new Mocha(Drink1);
         System.out.println(D1withAdds.Description());
         System.out.println(D1withAdds.cost());
        D1withAdds = new Milk(Drink1);
        System.out.println(D1withAdds.Description());
        System.out.println(D1withAdds.cost());
        
    }
}
