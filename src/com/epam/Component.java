package com.epam;

/**
 * Created by Maryia on 11/25/2015.
 */
public abstract class Component implements Products{

    private double weight;
    public double calories;
    private String name;

    abstract public void diet();

    @Override
    public double getCalories() {
        return calories;
    }

    @Override
    public void setCalories(double calories) {
        this.calories=calories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight=weight;
    }

    @Override
    public String toString (){
        return "Name of ingridient: " + name + " " +  "Weight: " + weight + "";
    }
}



