package fr.imt.coffee.machine.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank(5,0,10);

    @Test
    void decreaseVolumeInTank() {
        tank.decreaseVolumeInTank(1);
        Assertions.assertEquals(4,tank.getActualVolume());
    }

    @Test
    void decreaseVolumeInTank2() {
        tank.decreaseVolumeInTank(7);
        Assertions.assertEquals(0,tank.getActualVolume());
    }

    @Test
    void increaseVolumeInTank() {
        tank.increaseVolumeInTank(1);
        Assertions.assertEquals(6,tank.getActualVolume());
    }
    @Test
    void increaseVolumeInTank2() {
        tank.increaseVolumeInTank(8);
        Assertions.assertEquals(10,tank.getActualVolume());
    }
}