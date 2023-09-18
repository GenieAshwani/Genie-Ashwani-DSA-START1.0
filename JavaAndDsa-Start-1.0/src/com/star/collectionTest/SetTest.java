package com.star.collectionTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<Integer> num=new HashSet<>();

        num.add(20);
        num.add(10);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println(num);

        //add duplicate
        num.add(10);
        System.out.println(num);

        //Checking one element
        boolean res10 = num.contains(10);
        boolean res99 = num.contains(99);
        System.out.println("Contains 10 ? "+res10);
        System.out.println("Contains 99 ? "+res99);
        
        //Removing one element
        boolean res = num.remove(10);
        System.out.println(res);
        System.out.println(num);

        int size = num.size();
        System.out.println(size);

        //Q iterate
       Iterator<Integer> it= num.iterator();
       while (it.hasNext())
       {
          Integer value= it.next();
           System.out.println(value);
       }

        System.out.println(num.isEmpty());
       //clear the set
        num.clear();
        System.out.println(num);

        System.out.println(num.isEmpty());


    }
}
