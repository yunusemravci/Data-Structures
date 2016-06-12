/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw5yunusemre;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bmyav
 */
public class LinkedListRecTest {
    
    public LinkedListRecTest() {
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
     * Test of remove method, of class LinkedListRec.
     */
    @Test
    public void testRemove() {
        System.out.println("remove -- 1");
        Object outData = 4;
        LinkedListRec instance = new LinkedListRec();
        instance.add(4);
        instance.add(8);
        instance.add(16);
        
        boolean expResult = true;
        boolean result = instance.remove(outData);
        assertEquals(expResult, result);

    }
    /**
     * Test of remove method, of class LinkedListRec.
     */
    @Test
    public void testRemove_2() {
        System.out.println("remove -- 2");
        Object outData = "av";
        LinkedListRec instance = new LinkedListRec();
        instance.add("rt");
        instance.add("45");
        instance.add("il");
        
        boolean expResult = false;
        boolean result = instance.remove(outData);
        assertEquals(expResult, result);

    }    

    
}
