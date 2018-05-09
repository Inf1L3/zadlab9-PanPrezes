/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random r = new Random(); 
    int [] tab = new int [100]; 
     for (int i = 0; i < 100; i++) {
            tab[i] = r.nextInt();
        }
     Arrays.sort(tab);
    for (int i = 0; i < 100; i++) {
        System.out.println(tab[i]) ;   
        }
   
     
    }
    
}
