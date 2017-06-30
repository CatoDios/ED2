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
public class nodoArbol {
        ABB hd;
        ABB hi;
        String nombre;
        String contra;
        int id;
 
        private void nodoArbol(){
            hd = null;
            hi = null;
            setNombre("");
            setContra("");
            setId(0);
        }

        /**
         * @return the nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * @param nombre the nombre to set
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * @return the contra
         */
        public String getContra() {
            return contra;
        }

        /**
         * @param contra the contra to set
         */
        public void setContra(String contra) {
            this.contra = contra;
        }

        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }
    }