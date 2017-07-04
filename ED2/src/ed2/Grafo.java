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

    public NodoGrafo insertarNodo(String nuevo){
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
        return inserta;
    }
    public String muestraNodos(){
        String cadena="";
        NodoGrafo raiz=Google;
        while(raiz.sgte!=null){
            cadena=cadena+raiz.dato+"("+muestraAdy(raiz)+")"+"->";
            raiz=raiz.sgte;
        }
        cadena=cadena+raiz.dato+"("+muestraAdy(raiz)+")"+"->";
        return cadena;
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
    public boolean ExisteAdy(NodoGrafo A,String nombre){
        
        NodoAdyacente m=A.ady;
        boolean encontrado=false;
        while(m.sgte!=null || encontrado==true){
            if(m.dat==nombre){
                encontrado=true;
            }else{
                encontrado=false;
                m=m.sgte;
            }
            
        }
        return encontrado;
    }
    public void GenerarRecorrido(NodoGrafo A, NodoGrafo B){
        
        NodoAdyacente raiz=A.ady;
        NodoAdyacente inserta=new NodoAdyacente(B.dato);
        if(A.ady==null){
            A.ady=inserta;
        }
        else if(ExisteAdy(A,B.dato)){
           System.out.println("Recorrido ya existe");
        }else{
            while(raiz.sgte!=null){
                raiz=raiz.sgte;
            }
            raiz.sgte=inserta;
        }
    }

    public String muestraAdy(NodoGrafo raiz) {
        String cadena="";
        NodoAdyacente m=raiz.ady;
        if(m==null){
            cadena="no hay";
        }else{
            while(m.sgte!=null){
                cadena=cadena+m.dat+"->";
                m=m.sgte;
            }
            cadena=cadena+m.dat+"->";
        }
        return cadena;
    }
    
            
    
}
