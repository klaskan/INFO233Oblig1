package com.company;

import java.util.Deque;
import java.util.Arrays;

public class ArrayDeque<E> implements IDeque<E> {

    private int unitsInDeque;
    private E [] arrayDeque;
    private static final int DEFAULT_CAPACITY = 20;

    public ArrayDeque(int størrelseDeque) {
        E[] tempBag = (E[])new Object[størrelseDeque];
        arrayDeque = tempBag;
        unitsInDeque = 0;
    }

    public ArrayDeque(){
        this(DEFAULT_CAPACITY);
    }

    public void printArray(){
        for(E unit : arrayDeque){
            System.out.println(unit);
        }
    }


    @Override
    public int size() {
        return unitsInDeque;
    }


    @Override
    public void addFirst(E elem) throws DequeFullException {
        if(unitsInDeque >= arrayDeque.length){
            throw new DequeFullException("Deque is full");
        }else {
            if(arrayDeque[0] == null){
                arrayDeque[0] = elem;
                unitsInDeque++;
            }else{

                for (int i = 0; i <= arrayDeque.length; i++) {
                    if(arrayDeque[i] == null){
                        for(int j = i; j >= 1;j--){
                            arrayDeque[j] = arrayDeque[j -1];
                        }
                        arrayDeque[0] = elem;
                        unitsInDeque++;
                        break;
                    }
                }

            }
        }

    }







    @Override
    public E pullFirst() throws DequeEmptyException {

        if(unitsInDeque <= 0){
            throw new DequeEmptyException("Deque is empty");
        }else {
            E firstUnit = arrayDeque[0];
            System.arraycopy(arrayDeque, 1, arrayDeque, 0, arrayDeque.length - 1);
            unitsInDeque--;
            arrayDeque[arrayDeque.length-1] = null;
            return firstUnit;

        }
    }





    @Override
    public E peekFirst() throws DequeEmptyException {
        if(unitsInDeque <= 0){
            throw new DequeEmptyException("Deque is empty");
        }else{
            return arrayDeque[0];
        }
    }

    @Override
    public void addLast(E elem) throws DequeFullException {
        if(unitsInDeque >= arrayDeque.length) {
            throw new DequeFullException("Deque is full");
        }else {
            if (arrayDeque[arrayDeque.length - 1] == null) {
                arrayDeque[arrayDeque.length - 1] = elem;
                unitsInDeque++;
            } else {

                for (int i = (arrayDeque.length - 1); i >= 0; i--) {
                    if (arrayDeque[i] == null) {
                        for (int j = i; j < arrayDeque.length - 1; j++) {
                            arrayDeque[j] = arrayDeque[j + 1];


                        }
                        arrayDeque[arrayDeque.length - 1] = elem;
                        unitsInDeque++;
                        break;
                    }


                }
            }
        }
    }



    @Override
    public E pullLast() throws DequeEmptyException {
        if(unitsInDeque <= 0){
            throw new DequeEmptyException("Deque is empty");
        }else{
            E lastUnit = arrayDeque[arrayDeque.length-1];
            System.arraycopy(arrayDeque, 0, arrayDeque, 1, arrayDeque.length - 1);
            unitsInDeque--;
            arrayDeque[0] = null;
            return lastUnit;

        }



    }



    @Override
    public E peekLast() throws DequeEmptyException {
        if(unitsInDeque <= 0){
            throw new DequeEmptyException("Deque is empty");
        }else{
            return arrayDeque[arrayDeque.length - 1];

        }

    }

    @Override
    public boolean contains(Object elem) {
        for(int i = 0; i < arrayDeque.length; i++){
            if(arrayDeque[i] == elem){
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(arrayDeque, size(), a.getClass());
    }



    @Override
    public void clear() {
        for(int i = 0; i < arrayDeque.length; i++){
            arrayDeque[i] = null;
        }
    }
}
