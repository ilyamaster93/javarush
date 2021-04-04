package com.javarush.task.task14.task1408;

public abstract class Hen implements Country
{
    int N;
    String country;
    public abstract int getCountOfEggsPerMonth();
    public String getDescription(){
        return "Я - курица.";
    }
}
