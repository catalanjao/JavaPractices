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
public class  IteratorZooBarcelona implements Iterator{

    private int pos=0;
    private List<String> animales;
    
    public IteratorZooBarcelona(List<String> animales){
        super();
        this.animales=animales;
    }
    @Override
    public boolean hasNext() {
        return pos+1 <= animales.size();
    }

    @Override
    public String next() {
        String animal = animales.get(pos);
        pos++;
        return animal;
    }
    
}
