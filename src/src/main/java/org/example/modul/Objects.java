package org.example.modul;

public class Objects {
    protected String name;
    protected int speed;

    public Objects() {
    }

    public Objects(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("Двигатель запущен");
    }


}


