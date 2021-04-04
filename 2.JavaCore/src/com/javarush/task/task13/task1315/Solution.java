package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
Создай классы Dog, Cat и Mouse.
Реализуй интерфейсы в добавленных классах, учитывая что:

Кот (Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
Мышь (Mouse) может передвигаться, и ее могут съесть;
Собака (Dog) может передвигаться и съесть кого-то.
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }
    
    public class Cat implements Movable, Edible, Eat{
        public void move () {
            System.out.println("Двигаюсь");
        }
        public void beEaten () {
            //System.out.println("Двигаюсь");
        }
        public void eat () {
            
        }
        
    }
    
    public class Dog implements Movable, Eat{
        public void move () {
            System.out.println("Двигаюсь");
        }
        
        public void eat () {
            
        }
        
    }
    
    public class Mouse implements Movable, Edible{
        public void move () {
            System.out.println("Двигаюсь");
        }
        public void beEaten () {
            //System.out.println("Двигаюсь");
        }
        
    }
}