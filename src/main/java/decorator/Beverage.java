/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 * Clase abstracta que representa una bebida.
 * Proporciona una estructura básica para las bebidas, incluyendo una descripción y un método abstracto para obtener el costo.
 * 
 * @author migue
 */
public abstract class Beverage {
    private String description;
    
    /**
     * Obtiene la descripción de la bebida.
     * 
     * @return La descripción de la bebida.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción de la bebida.
     * 
     * @param description La nueva descripción de la bebida.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Método abstracto para obtener el costo de la bebida.
     * Las subclases deben proporcionar una implementación específica.
     * 
     * @return El costo de la bebida.
     */
    public abstract double getCost();
}
