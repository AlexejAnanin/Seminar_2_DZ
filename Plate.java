package ru.geekbrains.oop.lesson2.task4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    public void setFood() {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
