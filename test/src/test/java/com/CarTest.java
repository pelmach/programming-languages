package com;


import org.testng.Assert;
import org.testng.annotations.*;

public class CarTest {
    private Car car = new Car();
    @Test(groups = "functest")
    public void testDrive() throws Exception{
        Assert.assertEquals(100, car.drive(10, 10));
        Assert.assertEquals(20, 50, car.drive(5,10));//!
    }
    @Test(groups = "checkintest")
    public void testRefuel() throws Exception{
        Assert.assertEquals(60, car.refuel(10, "92"));
        Assert.assertEquals(70, 60, car.refuel(10, "92"));//!
    }
    @Test(groups = "checkintest")
    public void testPrice() throws Exception{
        Assert.assertEquals(49.2, car.price("92"));
        Assert.assertEquals(51.2, car.price("95"));
        Assert.assertEquals(53.3, car.price("diesel"));
        Assert.assertEquals(53.3, 49.2, car.price("92"));//!
    }
    @Test(groups = "checkintest")
    public void testConsumption() throws Exception{
        Assert.assertEquals(50, car.consumprion(10, 10, 10));
        Assert.assertEquals(10, 20, car.consumprion(2, 10, 10));//!
    }


}
