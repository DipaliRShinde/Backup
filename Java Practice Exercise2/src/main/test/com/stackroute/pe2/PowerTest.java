package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    Power obj;
    @Before
    public void setUp() throws Exception {
        obj=new Power();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenPositivePowerOfFourNumberShouldReturnTrue()
    {
        assertEquals(true,obj.power4(16));
        assertEquals(false,obj.power4(18));
        assertNotEquals(true,obj.power4(40));
        assertNotEquals(false,obj.power4(64));
    }
    @Test
    public void checkNull()
    {
        assertNotNull(obj);
    }
    @Test
    public void negativeInput()
    {
        assertEquals(false,obj.negativeInput(-256));
        assertEquals(true,obj.negativeInput(256));
    }
    @Test
    public void zeroInput()
    {
        assertEquals(false,obj.zeroInput(0));
        assertEquals(true,obj.zeroInput(64));
    }
}