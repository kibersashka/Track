package org.example.modul;

public class ElectroCar extends Car{
    protected int battery;

    public ElectroCar() {

    }

    public ElectroCar(int speed, int age, int battery, String name){
        super(speed, age, name);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public void start() {
        System.out.println("Заряда хватит на " + ((double) (battery) / (double)(speed)) + " минут");
    }
    public String driveElectroCar() {
        return "Заряд батареи: " + battery;
    }
}
