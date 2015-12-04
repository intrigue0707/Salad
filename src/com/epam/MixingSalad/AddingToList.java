package com.epam.MixingSalad;

import com.epam.Exceptions.MyIOEforstring;
import com.epam.Exceptions.MyIOException;
import com.epam.Exceptions.MyInputException;
import com.epam.ReadWrite.JSON.writeToFile;

import java.io.IOException;

import static com.epam.MixingSalad.Console.scanDouble;
import static com.epam.MixingSalad.Console.scanMessage;

/**
 * Created by Maryia on 11/26/2015.
 */
public class AddingToList {
    public static String jcategory;
    public static String jingr;
    public static double jcalories;
    public static  void addingToList() throws MyIOEforstring, IOException, MyIOException, MyInputException {

        System.out.println("Let's add your ingridient. Please enter category for ingridient - vegetables, fruits, grocery");
        jcategory = scanMessage();
        System.out.println("Let's add your ingridient. Please enter name for your ingridient");
        jingr = scanMessage();
        System.out.println("Let's add calories for your ingridient. Please enter number of calories for 100gr of your ingridients");
        jcalories = scanDouble();
        writeToFile.main();
        System.out.println("Your ingridient was added to base.Let's add your ingridient to salad");
    }



    public String getJCategory() {return jcategory;}
    public String getJIngr(){return jingr;}
    public  double getJcalories(){return jcalories;}
}