package com.javarush.task.task14.task1408;

public class RussianHen extends Hen
{
    String country = RUSSIA;
    public int getCountOfEggsPerMonth(){
        return this.N;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
