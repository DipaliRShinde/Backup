package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {

    EvenNum evenOddObj;
    @Before
    public void setUp() throws Exception {
        evenOddObj=new EvenNum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenPositiveNumberShouldReturn() {
        assertEquals(true,evenOddObj.isEven(90));
        assertEquals(false,evenOddObj.isEven(13));
    }


}