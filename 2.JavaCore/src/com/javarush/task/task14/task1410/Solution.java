package com.javarush.task.task14.task1410;

/* 
Дегустация вин
Давай напишем программу, которая поможет нам определить, какое вино пить по какому случаю.
Для этого нужно:
Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно".
Создать класс Wine, наследуемый от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День Рождения".
Создать класс BubblyWine, наследуемый от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый Год".
Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
Все классы должны находиться в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
Wine wine = new Wine ();
return wine;
    }

    public static Wine getWine() {
Wine wine = new Wine ();
return wine;
    }

    public static Wine getBubblyWine() {
Wine wine = new BubblyWine();
return wine;
    }
}
