import java.util.Arrays;

public class LinkedListBasic<E> {
    private int Size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object []element;
    public LinkedListBasic(){
        element=new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element,newSize);
    }
    public void add(E e){
        if (Size==element.length){
            ensureCapa();
        }
        element[Size++]=e;
    }
    public E get(int index)
    {
        if (index<0||index>Size){
            throw new IndexOutOfBoundsException("Index"+index+" Size"+index);
        }
        return (E) element[index];
    }
}
