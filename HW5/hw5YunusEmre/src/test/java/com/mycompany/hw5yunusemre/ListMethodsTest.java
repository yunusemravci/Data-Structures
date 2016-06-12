/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw5yunusemre;

import java.util.List;
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
public class ListMethodsTest {
    
    public ListMethodsTest() {
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
     * Test of intersectionOfLists method, of class ListMethods.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("intersectionOfLists");
        ListMethods instance = new ListMethods();
        instance.list1.add(1);
        instance.list1.add(8);
        instance.list1.add(9);
        instance.list2.add(8);
        instance.list2.add(31);
        instance.list2.add(18);
        List expResult = null;
        expResult.add(8);
        List result = instance.intersectionOfLists();
        assertEquals(expResult, result);

    }

    /**
     * Test of unionOfLists method, of class ListMethods.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("unionOfLists");
        ListMethods instance = new ListMethods();
                instance.list1.add(1);
        instance.list1.add(8);
        instance.list1.add(9);
        instance.list2.add(8);
        instance.list2.add(31);
        instance.list2.add(18);
        List expResult = null;
        expResult.add(8);
        List result = instance.unionOfLists();
        assertEquals(expResult, result);

    }

    /**
     * Test of isSubset method, of class ListMethods.
     */
    @Test
    public void testIsSubset() {
        System.out.println("isSubset");
        ListMethods instance = new ListMethods();
        instance.list1.add(9);
        instance.list2.add(8);
        instance.list2.add(31);
        instance.list2.add(18);
        boolean expResult = false;
        boolean result = instance.isSubset();
        assertEquals(expResult, result);


    }

}
