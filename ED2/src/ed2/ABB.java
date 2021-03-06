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
public class ABB {

    String getNombre() {
        return raiz.nombre;
    }

   
    
 
    public nodoArbol raiz;
 
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
 
    public boolean esVacio(){
        return (raiz == null);
    }
 
    public void insertar(String nom,String con, int id){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.setNombre(nom);
            nuevo.setContra(con);
            nuevo.setId(id);
            nuevo.hd = new ABB();
            nuevo.hi = new ABB();
            raiz = nuevo;
        }
        else {
            if (id > raiz.getId()) {
                (raiz.hd).insertar(nom,con,id);
            }
            if (id < raiz.getId()){
                (raiz.hi).insertar(nom,con,id);
            }
        }
    }
 
    public void preOrder(){
        if (!esVacio()) {
            System.out.print(raiz.getNombre() + ", "  );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
 
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print(raiz.getNombre() + ", "  );
            raiz.hd.inOrder();
        }
    }
 
    public void posOrder(){
        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print(raiz.getNombre() + ", "  );
 
        }
    }
 
    public nodoArbol buscar(int a){
        nodoArbol arbolito = null;
        if (!esVacio()) {
            if (a == raiz.getId()) {
            return raiz;
            }
            else {
                if (a < raiz.getId()) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }
 
    public boolean existe(int a){
    if (!esVacio()) {
            if (a == raiz.getId()) {
            return true;
            }
            else {
                if (a < raiz.getId()) {
                    raiz.hi.existe(a);
                }
                else {
                    raiz.hd.existe(a);
                }
            }
        }
        return false;
    }
 
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
 
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }
 
    public int buscarMin() {
        ABB arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.getId();
        arbolActual.raiz=null;
        return devuelvo;
    }
 
    public int buscarMan() {
        ABB arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.getId();
            arbolActual.raiz=null;
        return devuelvo;
    }
 
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
 
    /*public void eliminar(int a) {
        nodoArbol paraEliminar = buscar(a);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
                paraEliminar.raiz = null;
            }
            else {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
                    paraEliminar.raiz.setId(paraEliminar.raiz.hd.buscarMin());
                }
                else {
                    if (paraEliminar.raiz.hi.esVacio()) {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }else{
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }
        }
    }*/
}
    

