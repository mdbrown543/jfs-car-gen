package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 100;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color,int year,int maxSpeed,boolean isElectric){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getColor(){ return color;}
    public void setColor(String newColor){ this.color = newColor;}

    public int getYear(){ return year;}
    public void setYear(int newYear){ this.year = newYear;}

    public int getSpeed(){ return speed;}
    public void setSpeed(int newSpeed){ this.speed = newSpeed;}

    public int getMaxSpeed(){ return maxSpeed;}
    public void setMaxSpeed(int newSpeed){ this.maxSpeed = newSpeed;}

    public boolean getIsElectric(){ return isElectric;}
    public void setElectric(boolean electric){ this.isElectric = electric;}

    public int accelerateSpeed(){
        if(speed + 5 < maxSpeed){
            speed+=5;
        } else {
            System.out.println("You have hit the max speed of " + maxSpeed);
            speed = maxSpeed;
        }
        return speed;
    }
    public int decelerateSpeed(){
        if(speed - 5 > 0){
            speed-=5;
        } else {
            System.out.println("You have stopped!");
            speed = 0;
        }
        return speed;
    }
    public boolean convertToElectric(){
        if(isElectric == false){
            isElectric = true;
        } else {
            System.out.println("This car is already electric.");
        }
        return isElectric;
    }
}











