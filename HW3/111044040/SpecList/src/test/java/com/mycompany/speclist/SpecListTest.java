/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.speclist;

import java.util.Collection;
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
public class SpecListTest {
    
    public SpecListTest() {
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
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHead() {
        System.out.println("addAllAtHead Integers");
        SpecList instance = new SpecList();
        SpecList instance1 = new SpecList();
        instance.add(4);
        instance.add(5);
        instance1.add(2);
        instance1.add(3);
        
        boolean expResult = true;
        boolean result = instance.addAllAtHead(instance1);
        assertEquals(expResult, result);
    }
    /**
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHead2() {
        System.out.println("addAllAtHead Strings");
        SpecList instance = new SpecList();
        SpecList instance1 = new SpecList();
        instance.add("AL");
        instance.add("78");
        instance1.add("/");
        instance1.add("#$");
        
        boolean expResult = true;
        boolean result = instance.addAllAtHead(instance1);
        assertEquals(expResult, result);
    }
    /**
     * Test of addAllAtHead method, of class SpecList.
     */
    @Test
    public void testAddAllAtHead3() {
        System.out.println("addAllAtHead Doubles");
        SpecList instance = new SpecList();
        SpecList instance1 = new SpecList();
        instance.add(4.014);
        instance.add(5.789);
        instance1.add(0.152);
        instance1.add(0.49953);
        
        boolean expResult = true;
        boolean result = instance.addAllAtHead(instance1);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectList() {
        System.out.println("getIntersectList Integers");
        SpecList instance = new SpecList();
        SpecList instance1 = new SpecList();
        SpecList intersect = new SpecList();
        
        instance.add(4);
        instance.add(5);
        instance.add(-1);
        instance1.add(-1);
        instance1.add(4);
        instance1.add(6);
        intersect.add(4);
        intersect.add(-1);

        List result = instance.getIntersectList(instance1);
        assertEquals(intersect, result);
        // TODO review the generated test code and remove the default call to fail.

    }
        /**
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectList2() {
        System.out.println("getIntersectList Strings");
        SpecList instance = new SpecList();
        SpecList instance1 = new SpecList();
        SpecList intersect = new SpecList();
        
        instance.add("alid");
        instance.add("5");
        instance.add("mesnas");
        instance1.add("aa");
        instance1.add("57");
        instance1.add("{+/");

        List result = instance.getIntersectList(instance1);
        assertEquals(intersect, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    /**
     * Test of getIntersectList method, of class SpecList.
     */
    @Test
    public void testGetIntersectList3() {
//        System.out.println("getIntersectList Doubles");
//        SpecList instance = new SpecList();
//        SpecList instance1 = new SpecList();
//        SpecList intersect = new SpecList();
//        
//        instance.add(4.1);
//        instance.add(0.5);
//        instance.add(-1.4864);
//        instance1.add(-1.4864);
//        instance1.add(0.04);
//        instance1.add(-7.6);
//        intersect.add(-1.4864);
//
//        List result = instance.getIntersectList(instance1);
//        assertEquals(intersect, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList for Integers");
        int whichOrder = 0;
        SpecList instance = new SpecList();
        instance.add(4);
        instance.add(-2);
        instance.add(8);
        instance.add(6);
        SpecList expResult = new SpecList();
        expResult.add(-2);
        expResult.add(4);
        expResult.add(6);
        expResult.add(8);
        List result = instance.sortList(0);
        assertEquals(expResult, result);

    }
        /**
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortList2() {
        System.out.println("sortList for Strings");
        int whichOrder = 0;
        SpecList instance = new SpecList();
        instance.add("asd");
        instance.add("*-84");
        instance.add("dcav");
        instance.add("kldsa");
        SpecList expResult = new SpecList();
        expResult.add("*-84");
        expResult.add("asd");
        expResult.add("dcav");
        expResult.add("kldsa");
        List result = instance.sortList(0);
        assertEquals(expResult, result);

    }
        /**
     * Test of sortList method, of class SpecList.
     */
    @Test
    public void testSortList3() {
        System.out.println("sortList for Doubles");
        int whichOrder = 0;
        SpecList instance = new SpecList();
        instance.add(0.4);
        instance.add(-2.18);
        instance.add(0.08);
        instance.add(-16.98);
        SpecList expResult = new SpecList();
        expResult.add(-16.98);
        expResult.add(-2.18);
        expResult.add(0.08);
        expResult.add(0.4);
        List result = instance.sortList(0);
        assertEquals(expResult, result);

    }
    
}
