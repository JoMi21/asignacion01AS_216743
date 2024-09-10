/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator11;

import beverage.DarkRoast;
import condiment.Milk;
import condiment.Soy;
import decorator.Beverage;

/**
 *StarbuzzCoffe
 * @author migue
 */
public class StarbuzzCoffe {

    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage, 2); 
        beverage = new Soy(beverage, 3);  
        
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }
}
