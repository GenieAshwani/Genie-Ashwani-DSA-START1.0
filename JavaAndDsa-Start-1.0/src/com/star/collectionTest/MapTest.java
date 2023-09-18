package com.star.collectionTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("Ashwani",10);
        map.put("Amit",20);
        map.put("Sujit",30);
        map.put("Ajay",40);
        map.put("riya",50);
        map.put("raju",60);

        //print
        System.out.println(map);

        //Accessing the element
        Integer value= map.get("Sujit");
        System.out.println(value);

        //check key
       boolean res= map.containsKey("raju");
        System.out.println(res);

        int size = map.size();
        System.out.println("Size of map : "+size);
        Integer removedValue = map.remove("raju");
        System.out.println(removedValue);
        System.out.println(map);
        int size1 = map.size();
        System.out.println("Size of map : "+size1);

        System.out.println(map.isEmpty());

        //iterate
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key = entry.getKey();
            Integer data=entry.getValue();
            System.out.println(key + "----"+data);
        }

    }
}
