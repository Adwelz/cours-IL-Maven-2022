package fr.imt.coffee.machine.component;

import cupboard.coffee.type.CoffeeType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeGrinderTest {

    @Test
    void grindCoffee() throws InterruptedException {
        int grindingTime=5;

        BeanTank beanTank= new BeanTank(0,0,100, CoffeeType.MOKA);
        beanTank.increaseVolumeInTank(0.2);

        CoffeeGrinder coffeeGrinder = new CoffeeGrinder(5);
        double grindingTimeValue = coffeeGrinder.grindCoffee(beanTank);

        Assertions.assertEquals(grindingTime, grindingTimeValue);
    }
}