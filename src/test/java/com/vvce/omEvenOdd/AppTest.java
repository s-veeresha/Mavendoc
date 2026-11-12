package com.vvce.omEvenOdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App obj=new App();
	

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testEven() {
        assertEquals("Even",obj.CheckEvenOdd(10));
    }
    public void testOdd() {
        assertEquals("Even",obj.CheckEvenOdd(7));
    }

}
