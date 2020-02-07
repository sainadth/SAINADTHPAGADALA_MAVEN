/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newyear;

/**
 *
 * @author User
 */

abstract public class Gift {
    final private int weight;
    final private int price;
    public String name;
    
    Gift(int weight, int price){
        this.weight = weight;
        this.price = price;
    }
    public int getWeight(){
        return this.weight;
    }
    public int getPrice(){
        return this.price;
    }
    
    public String getName(){
        return this.name;
    }
    
    abstract void setName();
}
