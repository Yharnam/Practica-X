/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_10;

/**
 *
 * @author tutu5
 */
public abstract class Ingredientes {
    
    private String nombre;
    
    public Ingredientes (String _nombre){
        
        this.nombre= _nombre;
        
    }
    
    public String getNombre(){
        
        return this.nombre;
    }
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public abstract int getTipo();
    
}
