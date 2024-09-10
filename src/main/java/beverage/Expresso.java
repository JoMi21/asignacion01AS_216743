/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import decorator.Beverage;

/**
 *Clase del expresso
 * @author migue
 */
public class Expresso extends Beverage {

    /**
     *Constructor que setea la descripcion del cafe
     */
    public Expresso(){
         this.setDescription("Cafe: Expresso"); 
    }
    
    /**
     *Metodo que regresa el costo
     */
    @Override
    public double getCost() {
        return 36;
    }
    
}
