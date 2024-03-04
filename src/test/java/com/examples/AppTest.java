package com.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        String mavenHome = System.getProperty("maven.home");
        System.out.println("maven.home=" + mavenHome);
        assertNotNull(mavenHome);
    }
}
