package ru.geekbrains.oop.lesson2.task4;

import java.util.ArrayList;

public class MainClass {


    public static <arg> void main(String[] args) {

        Cat cat = new Cat("Barsik", 10, false );


        Plate plate = new Plate(50);
        plate.info();


            cat.eat(plate.getFood(), cat);

     //   plate.setFood(plate.getFood() - cat.getAppetite());

    }
}
