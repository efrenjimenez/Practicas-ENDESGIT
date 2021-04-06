/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author efren
 */
public class buleanosIT {
    
    public buleanosIT() {
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

    /**
     * Test of devolverBuleano method, of class Buleanos.
     */
    @Test
    public void testDevolverBuleano() {
        System.out.println("devolverBuleano");
        boolean a = true;
        boolean b = false;
        Buleanos instance = new Buleanos();
        int expResult = -1;
        int result = instance.devolverBuleano(a, b);
        assertEquals(expResult, result);

    }
    
}
