package com.epam;
import com.epam.Exceptions.MyIOEforstring;
import com.epam.Exceptions.MyIOException;

import java.util.Scanner;

/**
 * Created by Maryia on 11/24/2015.
 */
public class Console {
    static Scanner in = new Scanner(System.in);
    public static int scanNumbers ()throws MyIOException {
        try{
            int number = in.nextInt();
            return number;}catch (Exception e){
            throw new MyIOException();
        }

    }
    public static String scanMessage() throws MyIOEforstring,NullPointerException {

        try {
            String message = in.next();
            return message;
        }catch (Exception e){
            throw new MyIOEforstring();
        }

    }
    public static double scanDouble(){

        double number = in.nextDouble();
        return number;
    }


    public static void close() {
        Scanner in = new Scanner(System.in);
        in.close();
    }
}

