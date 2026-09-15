package com.basics;

import java.util.*;

public class Park {


    public static void main(String[] args) {
        List<Integer> listOne = new Vector<>();
        System.out.println("Before object added to list: "+listOne);
        //To add the object to list add()
        listOne.add(30);
        listOne.add(10);
        listOne.add(20);
        listOne.add(10);
        listOne.add(30);
        listOne.add(40);
        System.out.println("After object added to list: "+listOne);
    //To find number of object  - Size()
        System.out.println("Find the number of obejct in the list: "+listOne.size());
        // To find the object based on index - get(index);
        Integer i = listOne.get(2);
        System.out.println("i: "+i);
        //To add the element based on index set(index,object)
        listOne.set(1,70);
        System.out.println("Updated list: "+listOne);

        boolean contains = listOne.contains(100);
        System.out.println("contains: "+contains);

        int i1 = listOne.indexOf(70);
        System.out.println("index of object 70: "+i1);

        int i2 = listOne.lastIndexOf(30);
        System.out.println("LastIndex of object 30: "+i2);

        listOne.remove(2);
        System.out.println("updated list: "+listOne);

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(30);
        listTwo.add(40);
        listTwo.add(50);
        listTwo.add(40);
        listTwo.add(90);
        System.out.println("ListOne: "+listOne);
        System.out.println("ListTwo: "+listTwo);

        //addAll()
//        listOne.addAll(listTwo);
//        System.out.println("ListOne: "+listOne);
//        System.out.println("ListTwo: "+listTwo);

        //removeAll() --> unique information retain
//        listOne.removeAll(listTwo);
//        System.out.println("remove all: "+listOne);

        //retainAll() --> duplicate [Common information]
//        listOne.retainAll(listTwo);
//        System.out.println("retainAll: "+listOne);
//

//        listOne.remove(70);
//        System.out.println("listone: "+listOne);
    }
}

