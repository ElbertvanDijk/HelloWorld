/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.test;

import hello.Greeting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elbert van Dijk
 */
public class GreetingJUnitTest {

    public GreetingJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGreeting() {
        Greeting greeting = new Greeting(1, "Hello world!");

        assertEquals("Greeting content must be Elbert", "Hello world!", greeting.getContent());
        assertEquals("Greeting id must be 1", 1, greeting.getId());
    }
}
