package lab1.lab1testing;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import lab1.Saab95;
import lab1.Car;

public class TestSaab95 {
    private Saab95 testSaab95;

    public TestSaab95() {
        testSaab95 = new Saab95();
    }

    @Test
    public void testStopEngine_for_Saab_should_have_currentSpeed_0() {
        testSaab95.stopEngine();
        assertEquals(0, testSaab95.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testSpeedFactor_Saab_should_have_speedFactor_1_25() {
        assertEquals(1.25, testSaab95.speedFactor(), 0.01);
    }

    @Test
    public void testStartEngine_Saab_should_have_currentSpeed_0_1() {
        testSaab95.startEngine();
        assertEquals(0.1, testSaab95.getCurrentSpeed(), 0.1);
    }

    @Test 
    public void testMove_Saab_should_have_xCord_0() {
        testSaab95.gas(2.5);
        testSaab95.move();
        assertEquals(0, testSaab95.getXCord(), 0.01);
    }

    @Test 
    public void testMove_Saab_should_have_yCord_minus_3_125() {
        testSaab95.gas(2.5);
        testSaab95.move();
        assertEquals(-3.125, testSaab95.getYCord(), 0.01);
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_up_should_have_direction_left() {
        testSaab95.turnLeft();
        assertEquals(Car.Direction.LEFT, testSaab95.getDirection());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_up_should_have_xChange_minus_1() {
        testSaab95.turnLeft();
        assertEquals(-1, testSaab95.getXChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_up_should_have_yChange_0() {
        testSaab95.turnLeft();
        assertEquals(0, testSaab95.getYChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_left_should_have_direction_down() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(Car.Direction.DOWN, testSaab95.getDirection());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_left_should_have_xChange_0() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(0, testSaab95.getXChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_left_should_have_yChange_1() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(1, testSaab95.getYChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_down_should_have_direction_right() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(Car.Direction.RIGHT, testSaab95.getDirection());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_down_should_have_xChange_1() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(1, testSaab95.getXChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_down_should_have_yChange_0() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(0, testSaab95.getYChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_right_should_have_direction_up() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(Car.Direction.UP, testSaab95.getDirection());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_right_should_have_xChange_0() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(0, testSaab95.getXChange());
    }

    @Test
    public void testTurnLeft_when_direction_for_Saab_is_right_should_have_yChange_minus_1() {
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        testSaab95.turnLeft();
        assertEquals(-1, testSaab95.getYChange());
    }
}