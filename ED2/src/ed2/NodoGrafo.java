/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2;

/**
 *
 * @author carlos
 */
public class NodoGrafo {
    String dato;
    NodoGrafo sgte=null;
    NodoAdyacente ady=null;
    
    public NodoGrafo(String nombre){
        this.dato=nombre;
       }
    
}
