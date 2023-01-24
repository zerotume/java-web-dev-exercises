package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject(){

        test_car = new Car("Kiel", "Leopard2", 100, 1.0);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(50, test_car.getGasTankLevel(), .001);
//        System.out.println("wat");
    }
    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(10000);
        assertEquals(0,test_car.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
//    @Test(expected = IllegalAccessException.class)
//    public void testGasOverFillException(){
//
//    }


}
