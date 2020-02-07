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
public class Sweet extends Gift{
    final private double calories;
    final String[] sweetNames = {"Laddu", "Kaju Katli", "Rasagulla"};
    Random random = new Random();
    int index = random.nextInt(sweetNames.length);
    
    Sweet(int weight, int price, double calories){
        super(weight, price);
        this.calories = calories;
        setName();
    }
    public double getCalories(){
        return this.calories;
    }


    @Override
    final void setName() {
        this.name = sweetNames[index];
    }

}
