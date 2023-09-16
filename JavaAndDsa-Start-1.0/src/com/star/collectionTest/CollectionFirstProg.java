package com.star.collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionFirstProg {

    public static void main(String[] args) {
        //order
        List<Integer> al=new ArrayList<>();
      //  System.out.println(al.size());

        //need to check how find out capacity
        System.out.println();
        System.out.println();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(10);
        al.add(null);
        al.add(null);
        System.out.println(al.get(3));
        al.remove(2);
        System.out.println(al);
        //unordered
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(10);
        set.add(null);

        System.out.println(set);
    }
}
