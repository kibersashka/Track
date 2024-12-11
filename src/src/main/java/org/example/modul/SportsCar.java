package org.example.modul;


public class SportsCar extends Car {
    private int power;

    public SportsCar() {
    }

    public SportsCar(int speed, int age, int power, String name) {
        super(speed, age, name);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("Мощности хватит на " + ((double) (power) / (double) (speed)));
    }
    public String driveSportsCar() {
        return "Количество топлива: " + power;
    }

}