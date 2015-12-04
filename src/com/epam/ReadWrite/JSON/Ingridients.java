package com.epam.ReadWrite.JSON;

import com.epam.Main.Fruits;
import com.epam.Main.Grocery;
import com.epam.Main.Vegetables;

import java.util.List;
    /**
     * Created by Maryia on 11/24/2015.
     */
    public  class Ingridients {
        private String  calories;
        private String name;
        public List<Vegetables> vegetables;
        public List<Fruits> fruits;
        public List<Grocery> grocery;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCalories() {
            return calories;
        }

        public void setCalories(String calories) {
            this.calories = calories;
        }
        public List getVegetables() {
               return vegetables;
        }

        public void setVegetables(List vegetables) {
           this.vegetables=vegetables;
        }

        public List getFruits() {
            return fruits;
        }

        public void setFruits(List fruits) {
            this.fruits=fruits;
                }

        public List getGrocery() {
            return grocery;
        }

        public void setGrocery(List grocery) {
            this.grocery = grocery;
        }

        public String toString(){
            return "Vegetables:" +getVegetables() + ","+"Fruits:" +getFruits()+ ","+"Grocery: "+getGrocery();
        }
    }

