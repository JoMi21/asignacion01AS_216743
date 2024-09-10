/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beverage;

import decorator.Beverage;

/**
 *clase del cafe descafeinado 
 * @author migue
 */
public class Decaf extends Beverage{

    /**
     *Constructor que setea la descripcion del cafe
     */
    public Decaf(){
        this.setDescription("Cafe: Descafeinado");           
    }
    
    /**
     *Metodo que regresa el costo
     */
    @Override
    public double getCost() {
       return 30;
    }

   
    
}
