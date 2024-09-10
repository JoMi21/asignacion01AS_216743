/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import decorator.Beverage;

/**
 * Clase del cafe tostado obscuro
 * @author migue
 */
public class DarkRoast extends Beverage{
    
    /**
     *Constructor que setea la descripcion del cafe
     */
    public DarkRoast(){
        this.setDescription("Cafe: tostado obscuro");           
    }

    /**
     *Metodo que regresa el costo
     */
    @Override
    public double getCost() {
        return 45;
    }
    
}
