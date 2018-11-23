package com.company.sampleexam1;

import javax.swing.*;
import java.util.ArrayList;

public class PizzaMenu {
    private int maxNumPizza;
    private ArrayList<Pizza> pizzaArrayList;
    private int currentNumPizza;

    public PizzaMenu(int maxNumPizza){
        this.maxNumPizza = maxNumPizza;
        pizzaArrayList = new ArrayList<Pizza>();
        currentNumPizza = 0;
    }

    public void addPizza(String pizzaName, int pizzaPrice){
        if(currentNumPizza == maxNumPizza){
            return;
        }

        Pizza pizza = new Pizza(pizzaName, pizzaPrice);
        pizzaArrayList.add(pizza);
        currentNumPizza++;
    }

    public void findPizza(String pizzaName){

        boolean notFound = true;
        for(Pizza pizza : pizzaArrayList){

            String currentPizzaName = pizza.getName();
            if(currentPizzaName.equals(pizzaName)){
                //System.out.println(pizza.getName() + pizza.getPrice());
                JOptionPane.showMessageDialog(null,pizza.getName() + pizza.getPrice());
                notFound = false;
            }
        }

        if(notFound){
            //System.out.println("no such pizzas");
            JOptionPane.showMessageDialog(null,"no such pizzas");
        }
    }
}
