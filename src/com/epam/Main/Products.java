package com.epam.Main;

/**
 * Created by Maryia on 11/22/2015.
 */
    public interface Products {

   public  enum category{Vegetable,Fruits,Grocery};
    public double getCalories();
    public void setCalories(double calories);
    public String getName();
    public void setName(String name);
    public double getWeight();
    public void setWeight(double weight);
    public void diet();


}


