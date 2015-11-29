package com.epam;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by Maryia on 11/28/2015.
 */
public class Converting {
    public static void main(String[] args) {


    Salad sal=new Salad();
    Set set = sal.mix.keySet();
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
        System.out.println(iter.next());
}
    }}