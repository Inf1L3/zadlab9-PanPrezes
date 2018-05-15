/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class Słownik {
      public static void main(String[] args) {
  
    
        Map<String, String> words =new HashMap<>();
        words.put("witaj","hello");
        words.put("co","what");
        words.put("mama","mother");
        words.put("książka","book");
        words.put("telefon","phone");
        words.put("tak","yes");
        words.put("nie","no");
        words.put("jedzenie","food");
        words.put("woda","water");
        words.put("kanapka","sandwich");
        words.put("kawa","coffe");
        words.put("herbata","tea");
        words.put("okno", "window");
        words.put("drzwi", "door");
        words.put("stół","table");
        words.put("podłoga","floor");
        words.put("pies","dog");
        words.put("kot","cat");
        words.put("mysz","mouse");
        words.put("zeszyt","notebook");
        words.put("koniec!","Dziekujemy za skorzystanie ze słownika. Do zobaczenia ponownie ");
        
        Scanner s = new Scanner(System.in);
        String słowo;
        System.out.println("Wpisz słowo z listy, które chcesz przetłumaczyć:"
                + "witaj "
                + "co "
                + "mama "
                + "książka "
                + "telefon "
                + "tak "
                + "nie "
                + "jedzenie "
                + "woda "
                + "kanapka "
                + "kawa "
                + "herbata "
                + "okno "
                + "drzwi "
                + "stół "
                + "podloga "
                + "pies "
                + "kot "
                + "mysz "
                + "zeszyt ");
            do {
            słowo = s.nextLine();
            System.out.println(słowo +" - "+ words.get(słowo));

           }while(!"koniec!".equals(słowo));
       
        
        
}
    
}
