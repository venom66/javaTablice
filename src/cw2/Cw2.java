/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import static cw2.tablica.*;
import static cw2.metoda.*;

/**
 *
 * @author BartD
 */
public class Cw2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
        int t []= new int [10];
        
        
        wypelnionaTablica(t);
        
        sumaTablicy(t);
        
        metoda m = new metoda();
        
        m.suma(1,2,3,4);
        
        System.out.println("suma to1: " + m);
        
        
        
        
    }    
       


}
