/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

/**
 *
 * @author BartD
 */
public class metoda {
    
    public static void suma(int ...numbers)
    {
        int suma =0;
        int i=0;
            for(i=0; i<numbers.length; i++)
            {
            suma=suma+numbers[i];
            }   
                
        System.out.println("suma1: " + suma);
    }
    
}
