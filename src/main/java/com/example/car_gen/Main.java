package com.example.car_gen;

public class Main {

    public static void main(String[] args){
        Honda civic = new Honda("red",2006,125,true,true);
        Lexus rx350 = new Lexus("silver",2019,140,false,false);
        Toyota supra = new Toyota("black",2020,130,false,false);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        supra.accelerateSpeed();
        System.out.println("The Supra's current speed is " + supra.getSpeed());

        rx350.decelerateSpeed();
        System.out.println("The RX350's current speed is " + rx350.getSpeed());

        rx350.convertToElectric();
        System.out.println("The RX350 is now electric");


    }
}
