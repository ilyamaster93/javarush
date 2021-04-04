package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen
{
    String country = UKRAINE;
    public int getCountOfEggsPerMonth(){
        return this.N;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
