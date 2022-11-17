package lab1testing;

import static org.junit.Assert.assertEquals;

import org.junit.*;

@Test
    public void testStopEngine_for_Saab_should_have_currentSpeed_0() {
        testSaab95.stopEngine();
        assertEquals(0, testSaab95.getCurrentSpeed(), 0.1);
    }