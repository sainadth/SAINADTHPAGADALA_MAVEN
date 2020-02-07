/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newyear;

import java.util.Random;

/**
 *
 * @author User
 */
public class Chocolate extends Gift{
    final private double calories;
    final String[] chocolateNames = {"FiveStar", "DairyMilk", "Snickers"};
    Random random = new Random();
    int index = random.nextInt(chocolateNames.length);
    
    Chocolate(int weight, int price, double calories){
        super(weight, price);
        this.calories = calories;
        setName();
    }
    public double getCalories(){
        return this.calories;
    }


    @Override
    final void setName() {
        this.name = chocolateNames[index];
    }
    
}
