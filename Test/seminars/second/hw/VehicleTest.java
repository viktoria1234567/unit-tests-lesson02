package seminars.second.hw;

import org.junit.jupiter.api.Test;
import seminars.first.model.Calculator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VehicleTest {
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarHasfourwheels() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleHasfourwheels() {
        Motorcycle motorcycle = new Motorcycle("abc", "fgh", 2010);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarHasspeed() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    public void testMotorcycleHasspeed() {
        Motorcycle motorcycle = new Motorcycle("abc", "fgh", 2010);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    public void testCarHasspeedEmulatingMotion() {
        Car car = new Car("Dodge", "Ram", 2010);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycleHasspeedEmulatingMotion() {
        Motorcycle motorcycle = new Motorcycle("abc", "fgh", 2010);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}