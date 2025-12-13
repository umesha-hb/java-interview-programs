package com.uttara.datastructure.implementation;

import java.util.Arrays;

public class MyArrayList<E> {
	private final int DEFAULT_SIZE=2;
    private Object[] myData = new Object[DEFAULT_SIZE];
    private int actSize=0;

    public boolean add(E data){
        if (actSize>=myData.length/2){
            increaseSize();
        }
        myData[actSize++] = data;
        return true;//when can it be false?
    }

    private void increaseSize()throws RuntimeException{
    	        myData = Arrays.copyOf(myData, myData.length*2);
    }

    public E get(int index) throws RuntimeException{
        if (index >= actSize){
            throw new IndexOutOfBoundsException(); 
        }
        return (E) myData[index];
    }

    public static void main(String[] args) {
        MyArrayList<String> arList = new MyArrayList<>();
        arList.add("Hello");
        arList.add("Hello");
        arList.add("Hello");
        arList.add("Bye bye!");
        System.out.println(arList.get(3));// prints Bye bye! which is correct

    }

}
