package com.mycompany.newyear;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App
{
    static ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
    static ArrayList<Sweet> sweets = new ArrayList<Sweet>();
    
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args )
    {
        orderSweet();
        
        orderChocolate();
        
        System.out.println("The total weight of the gift is: " + calculateTotalWeight());
        
        System.out.println("Enter sorting type of gifts (Choose a number): \n1.By weight\n2.By Price\n3.By calories\n");
        
        int sortType = scanner.nextInt();
        
        switch(sortType){
            case 1 :Comparator<Chocolate> compareChocolatesByWeight;
                    compareChocolatesByWeight = (Chocolate c1, Chocolate c2) -> ((Integer)c1.getWeight()).compareTo(c2.getWeight());
                    Collections.sort(chocolates, compareChocolatesByWeight);
                    Comparator<Sweet> compareSweetsByWeight;
                    compareSweetsByWeight = (Sweet s1, Sweet s2) -> ((Integer)s1.getWeight()).compareTo(s2.getWeight());
                    Collections.sort(sweets, compareSweetsByWeight);
                   
            case 2: Comparator<Chocolate> compareByPrice;
                    compareByPrice = (Chocolate c1, Chocolate c2) -> ((Integer)c1.getPrice()).compareTo(c2.getPrice());
                    Collections.sort(chocolates, compareByPrice);
                    Comparator<Sweet> compareSweetsByPrice;
                    compareSweetsByPrice = (Sweet s1, Sweet s2) -> ((Integer)s1.getWeight()).compareTo(s2.getWeight());
                    Collections.sort(sweets, compareSweetsByPrice);
                
            case 3: Comparator<Chocolate> compareByCalories;
                    compareByCalories = (Chocolate c1, Chocolate c2) -> ((Double)c1.getCalories()).compareTo(c2.getCalories());
                    Collections.sort(chocolates, compareByCalories);
                    Comparator<Sweet> compareSweetsByCalories;
                    compareSweetsByCalories = (Sweet s1, Sweet s2) -> ((Integer)s1.getWeight()).compareTo(s2.getWeight());
                    Collections.sort(sweets, compareSweetsByCalories);
        }
        
        
        System.out.println("After sorting the contents in the gift....\n");
        
        for(Chocolate chocolate: chocolates){
            System.out.println("Name: "+chocolate.getName()+"  Type: Chocolate"+"Weigth: "+chocolate.getWeight()+"  Price: "
                    +chocolate.getPrice()+"  Calories: "+chocolate.getCalories());
        }
        
        for(Sweet sweet: sweets){
            System.out.println("Name: "+sweet.getName()+"  Type: Sweet"+"Weigth: "+sweet.getWeight()+"  Price: "
                    +sweet.getPrice()+"  Calories: "+sweet.getCalories());
        }
    }
    
    public static void orderSweet(){
        
        System.out.println("Enter number of sweets in Gift: ");
        int no_of_orders = scanner.nextInt();
        
        for(int i = 0; i<no_of_orders; i++){
            
            System.out.println("Enter details of sweet "+(i+1));
            System.out.println("Enter weight of Sweet: ");
            int weigth = scanner.nextInt();
            
            System.out.println("Enter price of Sweet: ");
            int price = scanner.nextInt();
            
            System.out.println("Enter calories of Sweet: ");
            double calories = scanner.nextDouble();
            
            Sweet sweet = new Sweet(weigth, price, calories);
         
            sweets.add(sweet);
        }
    }
    
  
    
    public static void orderChocolate(){
        
        System.out.println("Enter no of chocolates in Gift: ");
        int no_of_orders = scanner.nextInt();
        
        for(int i = 0; i<no_of_orders; i++){
            
            System.out.println("Enter details of chocolate "+ (i+1));
            System.out.println("Enter weight of chocolate: ");
            int weigth = scanner.nextInt();
            
            System.out.println("Enter price of chocolate: ");
            int price = scanner.nextInt();
            
            System.out.println("Enter calories of chocolate: ");
            double calories = scanner.nextDouble();
            
            Chocolate chocolate = new Chocolate(weigth, price, calories);
            
            chocolates.add(chocolate);
            
        }
    }

    private static int calculateTotalWeight() {
        
        int weight = 0;
        for(Chocolate chocolate: chocolates){
            weight += chocolate.getWeight();
        }
        
        for(Sweet sweet: sweets){
            weight += sweet.getWeight();
        }
        return weight;
    }
}
