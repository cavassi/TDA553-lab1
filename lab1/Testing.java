package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class Testing {
    private Volvo240 testCarVolvo240;
    private Saab95 testSaab95;

    public Testing() {
        testCarVolvo240 = new Volvo240();
        testSaab95 = new Saab95();
    }
    @Test
    public void testSpeedFactor() {
        assertEquals(1.25, testCarVolvo240.speedFactor(), 0.01);
        assertEquals(1.25, testSaab95.speedFactor(), 0.01);
    }

    @Test
    public void testStartEngine() {
        testCarVolvo240.startEngine();
        testSaab95.startEngine();
        assertEquals(0.1, testCarVolvo240.getCurrentSpeed(), 0.1);
        assertEquals(0.1, testSaab95.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngine() {
        testCarVolvo240.stopEngine();
        testSaab95.stopEngine();
        assertEquals(0, testCarVolvo240.getCurrentSpeed(), 0.1);
        assertEquals(0, testSaab95.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testIncrementSpeed() {
        testCarVolvo240.incrementSpeed(2.5);
        testSaab95.incrementSpeed(2.5);
        assertEquals(3.125, testCarVolvo240.getCurrentSpeed(), 0.01);
        assertEquals(3.125, testSaab95.getCurrentSpeed(), 0.01);
    }

    @Test
    public void testDecrementSpeed() {
        testCarVolvo240.decrementSpeed(1.5);
        testSaab95.decrementSpeed(1.5);
        assertEquals(1.25, testCarVolvo240.getCurrentSpeed(), 0.01);
        assertEquals(1.25, testSaab95.getCurrentSpeed(), 0.01);
    }

    @Test 
    public void testMove() {
        testCarVolvo240.move();
        testSaab95.move();
        assertEquals(0, testCarVolvo240.getXCord(), 0.01);
        assertEquals(-1.25, testCarVolvo240.getYCord(), 0.01);
        assertEquals(0, testSaab95.getXCord(), 0.01);
        assertEquals(-1.25, testSaab95.getYCord(), 0.01);
    }

    @Test
    public void testTurnLeft() {
        testCarVolvo240 = new Volvo240();
        // System.out.println(testCarVolvo240.getDirection());
        testCarVolvo240.turnLeft();
        // assertEquals(-1, testCarVolvo240.getXChange());
        // assertEquals(0, testCarVolvo240.getYChange());
        // System.out.println(testCarVolvo240.getDirection());
        assertEquals(Car.Direction.LEFT, testCarVolvo240.getDirection());
        testCarVolvo240.turnLeft();
        assertEquals(1, testCarVolvo240.getXChange());
        assertEquals(0, testCarVolvo240.getYChange());
        assertEquals(Car.Direction.DOWN, testCarVolvo240.getDirection());
        testCarVolvo240.turnLeft();
        assertEquals(1, testCarVolvo240.getXChange());
        assertEquals(0, testCarVolvo240.getYChange());
        assertEquals(Car.Direction.RIGHT, testCarVolvo240.getDirection());
        testCarVolvo240.turnLeft();
        assertEquals(0, testCarVolvo240.getXChange());
        assertEquals(-1, testCarVolvo240.getYChange());
        assertEquals(Car.Direction.UP, testCarVolvo240.getDirection());
    }

    // @Test
    // public void testTurnRight() {
    //     testCarVolvo240.turnRight();
    //     assertEquals(1, testCarVolvo240.getXChange());
    //     assertEquals(0, testCarVolvo240.getYChange());
    //     assertEquals(Car.Direction.RIGHT, testCarVolvo240.getDirection());
    //     testCarVolvo240.turnRight();
    //     assertEquals(0, testCarVolvo240.getXChange());
    //     assertEquals(1, testCarVolvo240.getYChange());
    //     assertEquals(Car.Direction.DOWN, testCarVolvo240.getDirection());
    //     testCarVolvo240.turnRight();
    //     assertEquals(-1, testCarVolvo240.getXChange());
    //     assertEquals(0, testCarVolvo240.getYChange());
    //     assertEquals(Car.Direction.LEFT, testCarVolvo240.getDirection());
    //     testCarVolvo240.turnRight();
    //     assertEquals(0, testCarVolvo240.getXChange());
    //     assertEquals(-1, testCarVolvo240.getYChange());
    //     assertEquals(Car.Direction.UP, testCarVolvo240.getDirection());
    // }
    public static void main(String[] args) {
        Testing testObj = new Testing();
        testObj.testSpeedFactor();
        testObj.testStartEngine();
        testObj.testStopEngine();
        testObj.testIncrementSpeed();
        testObj.testDecrementSpeed();
        testObj.testMove();
        testObj.testTurnLeft();
        // testObj.testTurnRight();
    }
}
