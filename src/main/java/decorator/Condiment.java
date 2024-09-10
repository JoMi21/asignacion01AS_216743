/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 * Clase abstracta que representa un condimento que puede ser añadido a una bebida.
 * Extiende la clase Beverage y añade funcionalidad adicional a través de la composición.
 * Cada condimento tiene una referencia a una bebida y una cantidad específica.
 * @author migue
 */
public abstract class Condiment extends Beverage{
     protected Beverage beverage;
     protected int amount;
     
     /**
     * Constructor para crear un condimento con una bebida y una cantidad específica.
     * 
     * @param beverage La bebida a la que se le añadirá el condimento.
     * @param amount La cantidad del condimento.
     */
     public Condiment(Beverage beverage, int amount) {
        this.beverage = beverage;
        this.amount = amount;
    }
    
       /**
     * Método abstracto para obtener la descripción del condimento.
     * Las subclases deben proporcionar una implementación específica.
     * 
     * @return La descripción de la bebida con el condimento.
     */
    public abstract String getDescription();  
    
}

