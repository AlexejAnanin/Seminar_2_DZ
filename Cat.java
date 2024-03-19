package ru.geekbrains.oop.lesson2.task4;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return this.satiety;
    }
    public void setSatiety() {
        this.satiety = true;
       // return 0;
    }
    public void eat(int food, Cat cat) {
       if (!getSatiety()){
            if (food < getAppetite()){
                System.out.println(cat.getName() + " просит есть");
            }else {
                System.out.println("на тарелке осталось " + (food - getAppetite())+ " еды");
                 setSatiety();
                System.out.println(cat.getName()+ " сыт: " + getSatiety());
            }
       }
    }

}

