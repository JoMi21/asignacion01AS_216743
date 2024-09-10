/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import decorator.Beverage;

/**
 *Clase del cafe de mezcla de la casa
 * @author migue
 */
public class HouseBlend extends Beverage{
    
    /**
     *Constructor que setea la descripcion del cafe
     */
    public HouseBlend(){
       this.setDescription("Cafe: Mezcla de la casa");
    }

    /**
     *Metodo que regresa el costo
     */
    @Override
    public double getCost() {
        return 38;
    }
    
}
