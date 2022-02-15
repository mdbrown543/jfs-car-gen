package com.example.car_gen;

import org.junit.Assert;
import org.junit.Test;


public class CarTest {

    @Test
    public void testAccelerateSpeed(){
        Honda civic = new Honda("red",2006,102,true,true);
        Assert.assertEquals(102,civic.accelerateSpeed());
    }

    @Test
    public void testConvertToElectric(){
        Honda civic = new Honda("red",2006,125,true,true);
        Assert.assertEquals(true,civic.convertToElectric());
    }

    @Test
    public void testDecelerateSpeed(){
        Honda civic = new Honda("red",2006,125,true,true);
        Assert.assertEquals(95,civic.decelerateSpeed());
    }
}
