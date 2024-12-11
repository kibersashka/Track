package org.example.modul;

public class Car extends Objects {
    protected int age;

    public Car() {}

    public Car(int speed, int age, String name) {
        super(name, speed);
        this.age = age;
    }

    public int getToplivo() {
        return age;
    }

    public void setToplivo() {
        this.age = age;
    }
    @Override
    public void start() {
        System.out.println("Выберите тип машины " + name);
    }

    public String drive() {
        return name + "начал движение";
    }

}
