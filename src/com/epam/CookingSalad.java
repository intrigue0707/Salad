package com.epam;

import com.epam.DB.ConnectToDB;
import com.epam.Exceptions.IncorrectChoosing;
import com.epam.Exceptions.MyIOEforstring;
import com.epam.Exceptions.MyIOException;
import com.epam.Exceptions.MyInputException;
import com.epam.ReadWrite.readFromFile;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Maryia on 11/24/2015.
 */
public class CookingSalad {

    public static void  CookingSalad() throws IOException, MyInputException, MyIOException, MyIOEforstring,NullPointerException,IncorrectChoosing{
        Salad sal=new Salad();
        Scanner sc = new Scanner(System.in);
        readFromFile.main();
        ConnectToDB.createTable();
        readFromFile file= new readFromFile();
        String item;
        System.out.println("Hello. Let's cook tasty salad!Basic list of ingridients consists of :" + file.getName());
        System.out.println("Do you want to choose from following list of ingridients (y) or add you own ingridient (n)?");
        item = sc.next();
        if (item.equals("y")){
            mixIngridients.mixIngridients();
        }
        else if(item.equals("n")){
            addingToList.addingToList();
            mixIngridients.mixIngridients();

        }else {
            throw new IncorrectChoosing();
        }

        ConnectToDB.insertTable();
        ConnectToDB.readfromDB();
        Salad.sortingValues();
        Salad.sortingKeys();
        }


}

