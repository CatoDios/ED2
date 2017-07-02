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
public class Grafo {
    NodoGrafo Google;
    
    public Grafo() {
        this.Google = new NodoGrafo("Google");
        this.Google.sgte=null;
        this.Google.ady=null;
    }

    public void insertarNodo(String nuevo){
        NodoGrafo raiz=Google;
        NodoGrafo inserta=new NodoGrafo(nuevo);
        if(raiz.sgte==null){
            raiz.sgte=inserta;
        }
        else{
            while(raiz.sgte!=null){
            raiz=raiz.sgte;
            
            }
            raiz.sgte=inserta;
        }
    }
    public void muestraNodos(){
        NodoGrafo raiz=Google;
        while(raiz.sgte!=null){
            System.out.print(raiz.dato+"->");
            raiz=raiz.sgte;
        }
        System.out.print(raiz.dato+"->");
    }
    public NodoGrafo buscarNodo(String nombre){
        NodoGrafo buscado=Google;
        boolean encontrado=false;
        while(encontrado==false){
            if(buscado.dato==nombre){
                encontrado=true;
            }else{
                encontrado=false;
                buscado=buscado.sgte;
            }
            
        }
        return buscado;
    }
            
    
}
