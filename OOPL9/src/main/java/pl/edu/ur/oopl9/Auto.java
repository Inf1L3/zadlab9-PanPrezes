/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

/**
 *
 * @author Patryk
 * 
 */


   public class Auto<T, S> {
   T marka, nazwa;
   S max_prędkość, cena;
   
    /**
     *
     * @param marka
     * @param nazwa
     * @param max_prędkość
     * @param cena
     */
    public Auto(T marka, T nazwa, S max_prędkość, S cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.max_prędkość = max_prędkość;
        this.cena = cena;
    
        }
        public void wypisz()
        {
         System.out.println("Marka:  " + marka + " klasa: " + marka.getClass());   
         System.out.println("nazwa:  " + nazwa + " klasa: " + nazwa.getClass());   
         System.out.println("max_speed:  " + max_prędkość + " klasa: " + max_prędkość.getClass()); 
         System.out.println("cena:  " + cena + " klasa: " + cena.getClass());   
        }
    
}

    

