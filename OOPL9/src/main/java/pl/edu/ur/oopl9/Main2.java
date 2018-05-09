/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Patryk
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Random r = new Random();
        
        TreeSet<Integer> tree = new TreeSet<Integer>();
        int[] tab2 = new int[100];
        
        for(int i=0 ; i<100 ; i++)
        {
           tree.add(tab2[i]= r.nextInt(100));
        }
        
        Iterator<Integer> iterator = tree.iterator();
        
        while (iterator.hasNext()) {
		System.out.print(iterator.next() + " ");
    }
    
    }}
