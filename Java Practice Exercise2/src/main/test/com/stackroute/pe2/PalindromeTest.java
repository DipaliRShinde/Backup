package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome obj;
    @Before
    public void setUp() throws Exception {
        obj=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        assertEquals("nayan",obj.reverse("nayan"));
    }

    @Test
    public void checkNull()
    {
        assertNotNull(obj);
    }

    @Test
    public void checkPalindrome()
    {
        assertEquals(false,obj.checkPalindrome("nayan"));
    }
}