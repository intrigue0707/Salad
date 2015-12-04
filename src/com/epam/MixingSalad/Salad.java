package com.epam.MixingSalad;

/**
 * Created by Maryia on 12/4/2015.
 */

import com.epam.ReadWrite.JSON.ReadFromFile;

import java.util.*;


/**
 * Created by Maryia on 11/24/2015.
 */
public class Salad {

    private static  Map<String, Double> mix = new HashMap<String, Double>();

    public Map<String, Double> getMix(){
        return mix;
    }

    public static List sortingValues(Map<String, Double> mix) {

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

        return entryList;
    }

    public static List  sortingKeys(Map<String, Double> mix){
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
        return entryList;
    }


    public Double getTotalcalories() {
        ReadFromFile calories = new ReadFromFile();
        MixIngridients reqingr = new MixIngridients();
        return (Double) calories.map.get(reqingr.getIngr());

    }

    public Double countClories(){
        MixIngridients ingr=new MixIngridients();
        return getTotalcalories()*ingr.weight/100;
    }

}

