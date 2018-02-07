package com.company;

import com.sun.javafx.runtime.async.AbstractRemoteResource;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayDeque<Integer> stringDeque = new ArrayDeque<>(10);

        try {


//            int [] test  ={1,2,3,5,6,7,8,9};
//            for(int i = test.length - 1; i > 0; i--){
//                System.out.println(test[i]);
//            }


//            System.out.println(test[test.length-1]);


            System.out.println("_________");


            stringDeque.addFirst(1);
            stringDeque.addFirst(2);
            stringDeque.addFirst(3);
            stringDeque.addFirst(4);
            stringDeque.addFirst(5);
            stringDeque.addLast(100);
            stringDeque.addLast(200);
            stringDeque.addLast(300);
            stringDeque.addLast(400);
            stringDeque.addLast(500);


            stringDeque.pullLast();
            stringDeque.pullLast();
            stringDeque.pullFirst();


            stringDeque.printArray();

            System.out.println("-------TEST------");
            int [] test1 = {1,2,3,4,5,6,7,8,9};


            for(int i = 0; i <test1.length -1; i++){
                test1[i] = test1[i +1];
            }

            for(int j = 0; j < test1.length; j++){
                System.out.println(test1[j]);
            }







//            System.out.println(Arrays.deepToString((stringDeque.toArray(new Integer[stringDeque.size()]))));
//
//            Object[] objArr = new Object[5];
//            objArr[0] = new Object();
//            objArr[1] = new String();


            







//            stringDeque.addLast(10);
//            stringDeque.addLast(11);
//            stringDeque.addLast(10);
//            stringDeque.addLast(10);


            //stringDeque.getArray();


//            System.out.println(stringDeque.size());
//            System.out.println("______");
//            System.out.println(stringDeque.pullFirst());
//            System.out.println(stringDeque.pullFirst());
//            System.out.println(stringDeque.pullFirst());
//            System.out.println("Size: " + stringDeque.size());

            //stringDeque.getArray();
            System.out.println("______");
            //System.out.println(stringDeque.pullFirst());
//            System.out.println(stringDeque.pullFirst());
//            System.out.println(stringDeque.pullFirst());
//            System.out.println(stringDeque.pullFirst());


        } catch (DequeFullException e) {
            System.out.println(e);
      }catch (DequeEmptyException e){
          System.out.println(e);
      }

        }
}



