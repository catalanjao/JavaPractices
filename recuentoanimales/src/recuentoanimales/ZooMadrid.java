/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuentoanimales;

/**
 *
 * @author EeveeKat
 */
//public class ZooMadrid {
    public class ZooMadrid implements Iterable{
    private String[] animales;
    
    public ZooMadrid(){
        animales=new String[3];
    }
    
    public String[] getAnimales(){
        animales[0]="elefantes";
        animales[1]="hipopótamos";
        animales[2]="jirafas";
       
        return animales;
    }


    @Override
    public Iterator iterator() {
        return new IteratorZooMadrid(getAnimales());
    }
}
