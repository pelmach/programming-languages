package com;

import java.util.Scanner;

public class Car {
    private int speed = 10;
    private int time = 10;
    private double fuel = 10;
    private String typeFuel = "92";

    public void setSpeed(int speed) {
        if(speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed below zero");
        }
    }
    public void setFuel(double fuel) {
        if(fuel >= 0){
        this.fuel = fuel;
        } else {
            System.out.println("fuel below zero");
        }
    }
    public void setTime(int time){
        if(time >= 0){
        this.time = time;
        } else {
            System.out.println("time below zero");
        }
    }
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }
    public double getFuel() {
        return fuel;
    }
    public int getTime() {
        return time;
    }
    public int getSpeed() {
        return speed;
    }
    public String getTypeFuel() {
        return typeFuel;
    }
    int  drive (int speed, int time){
        System.out.println("distance = " + speed * time);
        return speed * time;
    }
    double refuel(double fuel, String typeFuel){
        boolean full = false;
        int num = 60;
        while (full == false){
            if(fuel < 60){
                System.out.println("Refuelling");
                fuel++;
                num--;
            } else {
                full = true;
            }
        }
        double price = price(typeFuel);
        price *= (60 - num);
        System.out.println("Price = " + price);
        System.out.println("Full = " + fuel);
        return fuel;
    }
    double price(String typeFuel) {
        Scanner input = new Scanner(System.in);
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
}

class Main{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Car car = new Car();
        int speed = car.getSpeed();
        int time = car.getTime();
        double fuel = car.getFuel();
        String typeFuel = car.getTypeFuel();
        car.drive(speed, time);
        car.refuel(fuel, typeFuel);
        int newSpeed = input.nextInt();
        car.setSpeed(newSpeed);
        int newTime = input.nextInt();
        car.setTime(newTime);
        double newFuel = input.nextInt();
        car.setFuel(newFuel);
    }
}

