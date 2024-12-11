package org.example;

import org.example.modul.Air;
import org.example.modul.ElectroCar;
import org.example.modul.SportsCar;
import org.example.modul.Boat;
import org.example.modul.Objects;


public class Main {
    public static void main(String args[]) {
        SportsCar ecar = new SportsCar(125, 15, 30, "Tesla Modul 3");
        ecar.start();
        System.out.println(ecar.driveSportsCar());
    }
}
