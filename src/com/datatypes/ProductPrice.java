package com.datatypes;

import java.util.*;

public class ProductPrice {

    public static void main(String[] args) {
        Map<String,Double> prod = new HashMap<String,Double>();
        System.out.println("Map: "+prod);//[], {}
        prod.put("mobile",100.123);
        prod.put("mobile",200.123);
        prod.put("tshirt",123.123);
        prod.put("charger",500.514);
        System.out.println("Map: "+prod);

        Set<String> productTitles = prod.keySet();

        for(String title:productTitles){
            System.out.println(title);
        }

        //set is value based - Iterator()
        Iterator<String> itr = productTitles.iterator(); //[charger,tshirt,mobile]
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }

        System.out.println("*********** Values() ***********");
        Collection<Double> values = prod.values();
        for(Double value:values){
            System.out.println(value);
        }

        boolean laptop = prod.containsKey("Laptop");
        System.out.println("laptop: "+laptop);

        boolean b = prod.containsValue(123.123);
        System.out.println("contains value: "+b);

        Set<Map.Entry<String, Double>> entries = prod.entrySet();
        System.out.println(entries);
    }
}
