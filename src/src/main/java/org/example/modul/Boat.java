package org.example.modul;

public class Boat extends Objects{
    private String typeBodyWater;
    private int distance;



    public Boat(int speed, int age, String name, int distance, String typeBodyWater) {
        super(name, speed);
        this.typeBodyWater = typeBodyWater;
        this.distance = distance;
    }

    public String getTypeBodyWater() {
        return typeBodyWater;
    }

    public void setTypeBodyWater(String typeBodyWater) {
        this.typeBodyWater = typeBodyWater;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public void start() {
        System.out.println("Время в пути: " + ((double) (distance) / (double) (speed)));
    }

    public String sail() {
        return name + "начал движение по " + typeBodyWater;
    }

}
