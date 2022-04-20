package com;

import java.util.Scanner;

public class Car {
    private int speed;
    private int time;
    private double fuel;
    private String typeFuel = "";

    int  drive (int speed, int time){
        System.out.println("distance = " + speed * time);
        return speed * time;
    }
    double refuel(double fuel, String typeFuel){
        boolean full = false;
        int num = 60;
        System.out.println("Refulling");
        while (!full) if (fuel < 60) {
            fuel++;
            num--;
        } else {
            full = true;
        }
        double price = price(typeFuel);
        price *= (60 - num);
        System.out.println("Price = " + price);
        System.out.println("Full = " + fuel);
        return fuel;
    }
    double price(String typeFuel) {
        if (typeFuel.equals("92")) {
            return 49.2;
        }
        if (typeFuel.equals("95")) {
            return 51.2;
        }
        if (typeFuel.equals("diesel")) {
            return 53.3;
        }
        return 1;
    }
    double consumprion(int speed, int time, int fuel){
        //Метод считает рассход топлива на 100 км
        return ((double) (60 - fuel)/(speed * time)) * 100;
    }
}


