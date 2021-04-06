/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *<h2>Clase Buleano</h2>
 * <p>La clase contiene un método que según dos variables booleanas,
 * devuelve 1 si las dos tienen valor true, o -1 si alguna de las dos tiene
 * valor false</p>
 * @author efrenjc
 */
public class Buleanos {
    
     /**
     * Metodo que según dos variables booleanas,
     * devuelve 1 si las dos tienen valor true, 
     * o -1 si alguna de las dos tiene valor false
     * crea un objeto punto con las coordenadas dadas.
     * @param a variable boolean.
     * @param b variable boolean.
     */
    public int devolverBuleano(boolean a, boolean b){
        int aux = 0;
        if(a && b){
            aux = 1;
        }
        else{
            aux= -1;
        }
        
        return aux;
    }
    
}
