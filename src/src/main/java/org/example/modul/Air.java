package org.example.modul;

public class Air extends Objects {
    private int distance;

    public Air() {
    }

    public Air(String name, int speed,  int distance) {
        super(name, speed);
        this.distance = distance;
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

    public String drive() {
        return name + "начал движение";
    }
}
