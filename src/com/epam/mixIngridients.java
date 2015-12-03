package com.epam;

import com.epam.Exceptions.MyIOEforstring;
import com.epam.Exceptions.MyIOException;

import java.io.IOException;

import static com.epam.Console.*;

/**
 * Created by Maryia on 11/26/2015.
 */
public class mixIngridients {
    public static String ingr="";
    public static double weight=0;
    public static void mixIngridients() throws MyIOException, IOException, MyIOEforstring {
        Salad salad = new Salad();

        System.out.println("How many ingridients do you want to mix in salad?");
        int quantityOfingr = scanNumbers();
        for (int i = 0; i < quantityOfingr; i++) {

            Salad sal=new Salad();

            System.out.println("Please,enter name of ingridient for salad ");
            ingr = scanMessage();
            String category;
          //  List ar = file.getName();

                System.out.println("Please, enter weight of ingridients in gramms");
                 weight = scanDouble();
                System.out.println("Total calories for ingridient;" +salad.getTotalcalories()*weight/100);
                System.out.println("Please,enter type of entered ingridient - vegetables, fruits, grocery");
                category = scanMessage();

                switch (category) {
                    case "vegetables":
                        salad.mix.put(ingr, weight);
                        break;
                    case "fruits":
                        salad.mix.put(ingr, weight);
                        break;
                    case "grocery":
                        salad.mix.put(ingr, weight);
                        break;
                }

            }


        }


public String getIngr(){return ingr;}
    public double getWeighr(){return weight;}
}