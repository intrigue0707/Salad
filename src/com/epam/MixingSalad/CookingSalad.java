package com.epam.MixingSalad;

//import com.epam.DB.ConnectToDB;

import com.epam.DB.ConnectToDB;
import com.epam.Exceptions.IncorrectChoosing;
import com.epam.Exceptions.MyIOEforstring;
import com.epam.Exceptions.MyIOException;
import com.epam.Exceptions.MyInputException;
import com.epam.ReadWrite.JSON.ReadFromFile;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Maryia on 11/24/2015.
 */
public class CookingSalad {

    public static void  CookingSalad() throws IOException, MyInputException, MyIOException, MyIOEforstring,NullPointerException,IncorrectChoosing{
        Salad sal=new Salad();
        Scanner sc = new Scanner(System.in);
        ReadFromFile.main();
        ConnectToDB.createTable();
        ReadFromFile file= new ReadFromFile();
        String item;
        System.out.println("Hello. Let's cook tasty salad!Basic list of ingridients consists of :" + file.getName());
        System.out.println("Do you want to choose from following list of ingridients (y) or add you own ingridient (n)?");
        item = sc.next();
        if (item.equals("y")){
            MixIngridients.mixIngridients();
        }
        else if(item.equals("n")){
            AddingToList.addingToList();
            MixIngridients.mixIngridients();

        }else {
            throw new IncorrectChoosing();
        }

       ConnectToDB.insertTable();
        ConnectToDB.readfromDB();
       Salad.sortingValues(sal.getMix());
       Salad.sortingKeys(sal.getMix());
        }


}

