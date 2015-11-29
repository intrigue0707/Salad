package com.epam;

import com.epam.ReadWrite.readFromFile;

import java.util.*;

/**
 * Created by Maryia on 11/24/2015.
 */
public class Salad {
   public static Map<String,Double> mix = new HashMap<String, Double>();

    public Double getTotalcalories(){
        readFromFile calories=new readFromFile();
        mixIngridients reqingr=new mixIngridients();
        return (Double) calories.map.get(reqingr.getIngr());

    }
    public static void main(String[] args){

    Map<String, Integer> unsortMap = new HashMap<String, Integer>();
    System.out.println(mix);
    printMap(mix);

    System.out.println("\nSorted Map......");
    Map<String, Double> sortedMix = sortByComparator(mix);
    printMap(sortedMix);}
        private static Map<String, Double> sortByComparator(Map<String, Double> mix) {

            // Convert Map to List
            List<Map.Entry<String, Double>> list =
                    new LinkedList<Map.Entry<String, Double>>(mix.entrySet());

            // Sort list with comparator, to compare the Map values
            Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
                public int compare(Map.Entry<String, Double> o1,
                                   Map.Entry<String, Double> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            });

            // Convert sorted map back to a Map
            Map<String, Double> sortedMix = new LinkedHashMap<String, Double>();
            for (Iterator<Map.Entry<String, Double>> it = list.iterator(); it.hasNext();) {
                Map.Entry<String, Double> entry = it.next();
                sortedMix.put(entry.getKey(), entry.getValue());
            }
            return sortedMix;
        }

        public static void printMap(Map<String, Double> map) {
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println("[Key] : " + entry.getKey()
                        + " [Value] : " + entry.getValue());
            }
        }

    }









