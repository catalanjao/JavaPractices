/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentoanimales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EeveeKat
 */
//public class ZooBarcelona  {
    public class ZooBarcelona  implements Iterable{
    private List<String> animales;
    
    public ZooBarcelona(){
        animales=new ArrayList<String>();
    }
    
    public List<String> getAnimales(){
        animales.add("gorilas");
        animales.add("osos");
        animales.add("hamsters");
        return animales;
    }

       @Override
    public Iterator iterator(){
        return new IteratorZooBarcelona(getAnimales());
    }
}
