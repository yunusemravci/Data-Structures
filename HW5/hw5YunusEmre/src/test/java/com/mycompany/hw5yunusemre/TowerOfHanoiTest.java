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

/**
 *
 * @author bmyav
 */
public class TowerOfHanoiTest {
    
    public TowerOfHanoiTest() {
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
     * Test of towerOfHanoi method, of class TowerOfHanoi.
     */
    @Test
    public void testTowerOfHanoi() {
        System.out.println("towerOfHanoi");
        int disksize = 3;
        char src = 'S';
        char dst = 'A';
        char aux = 'D';
        TowerOfHanoi instance = new TowerOfHanoi();
        instance.towerOfHanoi(disksize, src, dst, aux);
 
    }
    /**
     * Test of towerOfHanoi method, of class TowerOfHanoi.
     */
    @Test
    public void testTowerOfHanoi_2() {
        System.out.println("towerOfHanoi -- 2");
        int disksize = 8;
        char src = 'S';
        char dst = 'A';
        char aux = 'D';
        TowerOfHanoi instance = new TowerOfHanoi();
        instance.towerOfHanoi(disksize, src, dst, aux);
 
    }
    
}
