package com.javarush.task.task14.task1420;

import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {
    public  static  void main (String[] args){
        final Item itemOne = new Item("Телевизор",15, 30);
        final Item itemTwo = new Item("Утюг", 10, 5);
        final Item itemThree = new Item("Телефон", 2, 30);

        final Item[] items = {itemOne, itemTwo, itemThree};
        Arrays.sort(items, Comparator.comparingDouble(Item::valueUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));
        final  int knapsackWeight=25;
        int weightSoFar=0;
        int  valueSoFar=0;
        int currentItem=0;

        while (currentItem<items.length && weightSoFar!=knapsackWeight) {
            if (weightSoFar + items[currentItem].getWeight()<knapsackWeight){
                //берем объект целиком
                valueSoFar+=items[currentItem].getValue();
                weightSoFar+=items[currentItem].getWeight();

            } else {
                //берем часть объекта
valueSoFar+=((knapsackWeight-weightSoFar)/(double) items[currentItem].getValue())*items[currentItem].getValue();
            weightSoFar+=knapsackWeight;
            }
            currentItem++;
        }
        System.out.println("Ценность лучшего набора: "+ valueSoFar);

    }
}
class Item{
    private String name;
    private int weight;
    private int value;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public double valueUnitOfWeight(){
        return value/(double) weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String toString(){
        return "{name:"+ name +"w:" +weight+ ",v:"+value+"}";
    }
}
