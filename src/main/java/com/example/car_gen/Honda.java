package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    public Honda(String color, int year, int maxSpeed,boolean isElectric,boolean isTurboCharged) {
        super(color, year, maxSpeed, isElectric);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean getIsTurboCharged(){return isTurboCharged;}
    public void setIsTurboCharged(boolean turboCharged) {
        this.isTurboCharged = turboCharged;
    }

}
