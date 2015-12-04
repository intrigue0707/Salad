package com.epam.Main;

import com.epam.Main.Component;

/**
 * Created by Maryia on 11/24/2015.
 */
public class Fruits extends Component {

    @Override
    public void diet() {
        if(calories>=150.00) {
            System.out.println("Vegetable is not dietic");
        }
        else{
            System.out.println("Vegetables is dietic");
        }
    }

    }

