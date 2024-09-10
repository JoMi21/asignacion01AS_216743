/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condiment;

import decorator.Beverage;
import decorator.Condiment;

/**
 *Clase para el condimento de leche
 * @author migue
 */
public class Milk extends Condiment {
    
    /**
     *Constructor que hace referencia a la clase padre
     * @param beverage
     * @param amount
     */
    public Milk(Beverage beverage, int amount) {
        super(beverage, amount);
    }

    /**
     *Metodo que regresa la descripcion del condimento y la cantidad agregada del mismo
     * @return descripcion
     */
    @Override
    public String getDescription() {
        return beverage.getDescription()+", Leche x" + amount;
    }

    /**
     *Metodo que regresa el costo
     * @return costo
     */
    @Override
    public double getCost() {
        return 3 * amount + beverage.getCost();
    }
    
}
