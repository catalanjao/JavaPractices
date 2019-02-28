/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentoanimales;

import java.util.List;

/**
 *
 * @author EeveeKat
 */
public class RecuentoAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ZooMadrid zoomadrid = new ZooMadrid();
        ZooBarcelona zooBarcelona = new ZooBarcelona();

        mostrarAnimales(zoomadrid.iterator());
        mostrarAnimales(zooBarcelona.iterator());

    }

    public static void mostrarAnimales(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}
