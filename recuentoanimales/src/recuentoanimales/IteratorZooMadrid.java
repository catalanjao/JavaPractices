package recuentoanimales;

public class IteratorZooMadrid implements Iterator{

    private int pos=0;
    private String[] animales;

    public IteratorZooMadrid(String[] animales) {
        super();
        this.animales = animales;
    }

    @Override
    public boolean hasNext() {
        return pos+1 <=animales.length && animales[pos]!=null;
    }

    @Override
    public Object next() {
        String animal = animales[pos];
        pos++;
        return animal;
    }
}
