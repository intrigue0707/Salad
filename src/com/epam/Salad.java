package com.epam;

import com.epam.ReadWrite.readFromFile;

import java.util.*;


/**
 * Created by Maryia on 11/24/2015.
 */
public class Salad {
    public static Map<String, Double> mix = new HashMap<String, Double>();

    public static Map sortingValues() {

    List entryList = new ArrayList(mix.entrySet());
    Collections.sort(entryList, new Comparator() {
        public int compare(Object o1, Object o2) {
            Map.Entry e1 = (Map.Entry) o1;
            Map.Entry e2 = (Map.Entry) o2;
            Comparable c1 = (Comparable) e1.getValue();
            Comparable c2 = (Comparable) e2.getValue();
            return c1.compareTo(c2);
        }
    });
    System.out.println(entryList);

        return null;
    }

    public static void sortingKeys(){
        List entryList = new ArrayList(mix.entrySet());
        Collections.sort(entryList, new Comparator() {
            public int compare(Object o1, Object o2) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;
                Comparable c1 = (Comparable) e1.getKey();
                Comparable c2 = (Comparable) e2.getKey();
                return c1.compareTo(c2);
            }
        });
        System.out.println(entryList);
    }


    public Double getTotalcalories() {
        readFromFile calories = new readFromFile();
        mixIngridients reqingr = new mixIngridients();
        return (Double) calories.map.get(reqingr.getIngr());

    }

}











