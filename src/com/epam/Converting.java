package com.epam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Maryia on 11/29/2015.
 */
public class Converting {
    public static void main(String[] args){
        Salad sal = new Salad();
        Object[] keys = new Object[0];
        for (String key : sal.mix.keySet()) {
            keys = sal.mix.keySet().toArray();
        }
        Object[] value = new Object[0];
        for (Double values : sal.mix.values()) {
            value = sal.mix.values().toArray();
        }
        List list = new ArrayList(Arrays.asList(keys));
        list.addAll(Arrays.asList(value));
        Object[] c = list.toArray();
       // System.out.println(c);
    }
}
