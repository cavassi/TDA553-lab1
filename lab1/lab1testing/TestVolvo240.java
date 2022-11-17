package lab1.lab1testing;

import static org.junit.Assert.assertEquals;

import lab1.Car;

import org.junit.*;

import lab1.Volvo240;

public class TestVolvo240 {
    private Volvo240 testVolvo240;

    public TestVolvo240() {
        testVolvo240 = new Volvo240();
    }

    @Test
    public void testStopEngine_for_Volvo240_should_have_currentSpeed_0() {
        testVolvo240.stopEngine();
        assertEquals(0, testVolvo240.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testSpeedFactor_Volvo240_should_have_speedFactor_1_25() {
        assertEquals(1.25, testVolvo240.speedFactor(), 0.01);
    }

    @Test
    public void testStartEngine_Volvo240_should_have_currentSpeed_0_1() {
        testVolvo240.startEngine();
        assertEquals(0.1, testVolvo240.getCurrentSpeed(), 0.1);
    }

    
    @Test 
    public void testMove_Volvo240_should_have_xCord_0() {
        testVolvo240.gas(2.5);
        testVolvo240.move();
        assertEquals(0, testVolvo240.getXCord(), 0.01);
    }

    @Test 
    public void testMove_Volvo240_should_have_yCord_minus_3_125() {
        testVolvo240.gas(2.5);
        testVolvo240.move();
        assertEquals(-3.125, testVolvo240.getYCord(), 0.01);
    }

    @Test
    public void testTurnLeft_when_direction_for_Volvo240_is_up_should_have_direction_left() {
        testVolvo240.turnLeft();
        assertEquals(Car.Direction.LEFT, testVolvo240.getDirection());
        testVolvo240.turnLeft();
        assertEquals(0, testVolvo240.getXChange());
        assertEquals(1, testVolvo240.getYChange());
        assertEquals(Car.Direction.DOWN, testVolvo240.getDirection());
        testVolvo240.turnLeft();
        assertEquals(1, testVolvo240.getXChange());
        assertEquals(0, testVolvo240.getYChange());
        assertEquals(Car.Direction.RIGHT, testVolvo240.getDirection());
        testVolvo240.turnLeft();
        assertEquals(0, testVolvo240.getXChange());
        assertEquals(-1, testVolvo240.getYChange());
        assertEquals(Car.Direction.UP, testVolvo240.getDirection());
    }
}