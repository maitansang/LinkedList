package CauTrucDuLieu;

import java.util.ArrayList;

public class    MyList<E> {
    private int size =0;
    static final int DEAFAULT_CAPACITY=10;
    Object elements[] = new Object[DEAFAULT_CAPACITY];

    public MyList( ) { }
    public MyList(int capacity){
        this.elements= new Object[capacity];
    }
    public void add(int index,E element){
        if(index>=0 && index<=DEAFAULT_CAPACITY)
        {

            for(int i=size; i>index; i--)
                elements[i] = elements[i-1];

            size++;
        elements[index]=element;

        }
        else
            System.out.printf("\nVi tri %d khong hop le.",index );

    }
    E remove(int index) {
        E element= (E)elements[index];
        for(int i = 0; i < size; i++) {

            if(i == index) {
                size--;
                for(int j=i; j < size; j++) {
                    elements[j] = elements[j + 1];
                }
                return element;
            }

        }
        return null;
    }
    public int size(){
        return size;
        }
    public int indexOf(E o){
        for (int i = 0; i <size ; i++) {
            if (elements[i]==o){
                return i;
            }
        }
        return -1;
    }
    public E get (int i){
        for (int j = 0; j <size ; j++) {
            if(j==i){
                return (E)elements[j];
            }
        }
            return null;
    }
    public Object clone (){
        MyList<Object> myListClone = new MyList<Object>(this.elements.length-1);
        for (int i = 0; i <myListClone.elements.length ; i++) {
            myListClone.elements[i]=this.elements[i];
        }
        myListClone.size=size-1;
        return  myListClone;
    }
    public void clear(){
        for (int i = 0; i <size ; i++) {
            elements[i]=null;
        }
        size=0;
    }
    public boolean contains(E o){
        for (int i = 0; i <size ; i++) {
            if(elements[i]==o){
                return true;
            }
        }
        return false;
    }
    public boolean add(E toAdd){
        if (toAdd!=null){
            add(size,toAdd);
            return true;
        }
        else return false;
    }
    public void ensureCapacity(int minCapacity){
        if (minCapacity>size){
            MyList<E> newMyList = new MyList<E>(minCapacity+10);
            for (int i = 0; i <size ; i++) {
                newMyList.elements[i]=elements[i];
            }
            elements =  newMyList.elements;
        }
    }
}
