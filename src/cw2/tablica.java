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
public class tablica {
    
    public static int suma = 0;    
    public static int j = 0;
    
    /**
     *
     * @param liczby
     */
    public static void wypelnionaTablica (int liczby [])
    {
    for(int i=0; i<liczby.length; i++)
        {
        
            liczby[i]= i+10;
            System.out.println("liczba tablicy" + i + "to:" + liczby[i]);
        
        }
    
    }
    
    
    public static void sumaTablicy(int[] tab)
    {
    
            for(j=0; j<tab.length; j++)
            {
             suma= suma + tab[j];   
            }
            
            System.out.println("Suma tablicy to: " + suma);
            
    }
    
}
